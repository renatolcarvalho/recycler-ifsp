package com.rc.recyclerlistcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rc.recyclerlistcard.adapter.ArtistSongAdapter
import com.rc.recyclerlistcard.model.ArtistSong
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

	private var adapter: ArtistSongAdapter? = null
	private var artists: List<ArtistSong>? = null


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		artists = fillArtists()

		val recyclerView = findViewById<RecyclerView>(R.id.artists)

		val layout = LinearLayoutManager(this)
		recyclerView.setLayoutManager(layout)

		adapter = ArtistSongAdapter(artists!!)
		recyclerView.setAdapter(adapter)
	}

	private fun fillArtists(): List<ArtistSong> {
		val artists = ArrayList<ArtistSong>()

		artists.add(
			ArtistSong(
				"Blink 182", "NINE", "Punk Rock",
				"ic_blink"
			)
		)

		artists.add(
			ArtistSong(
				"Being as an ocean", "Proxy", "Post HardCore",
				"ic_beign"
			)
		)

		artists.add(
			ArtistSong(
				"Taking back sunday", "Last One", "HardCore",
				"ic_taking_back"
			)
		)

		return artists
	}
}
