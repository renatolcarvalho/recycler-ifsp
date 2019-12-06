package com.rc.recyclerlistcard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rc.recyclerlistcard.R
import com.rc.recyclerlistcard.adapter.ArtistSongAdapter.ArtistSongViewHolder
import com.rc.recyclerlistcard.model.ArtistSong

class ArtistSongAdapter : RecyclerView.Adapter<ArtistSongViewHolder> {

    private val artists: List<ArtistSong>
    private var context: Context? = null

    constructor(artists: List<ArtistSong>){
        this.artists = artists;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistSongViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.artist_cell, parent, false)
        this.context = parent.context
        return ArtistSongViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.artists.size
    }

    override fun onBindViewHolder(holder: ArtistSongViewHolder, position: Int) {
        val artist = artists.get(position)
        holder.name.setText(artist.name)
        holder.lastAlbum.setText(artist.lastAlbum)
        holder.genre.setText(artist.genre)
        holder.image.setImageResource(
            context!!.getResources()!!.getIdentifier(
                artist.image, "drawable", context!!.getPackageName()
            )
        )
    }

    class ArtistSongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val name: TextView
        internal val lastAlbum: TextView
        internal val genre: TextView
        internal val image: ImageView

        init {

            name = itemView.findViewById(R.id.txtName) as TextView
            lastAlbum = itemView.findViewById(R.id.txtLastAlbum) as TextView
            genre = itemView.findViewById(R.id.txtGenre) as TextView
            image = itemView.findViewById(R.id.imageAlbum) as ImageView
        }

    }
}