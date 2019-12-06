package com.rc.recyclerlistcard.model

class ArtistSong {

    val name: String
    val lastAlbum: String
    val genre: String
    val image: String

    constructor(name: String, lastAlbum: String, genre: String, image: String) {
        this.name = name
        this.lastAlbum = lastAlbum
        this.genre = genre
        this.image = image
    }
}