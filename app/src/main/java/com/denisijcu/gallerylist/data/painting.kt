package com.denisijcu.gallerylist.data


// Data Model
class Painting(id: Int, title: String, artist: String, description: String, imageResourceId: Int, review: Review) {
    private val id: Int
    private val title: String
    private val artist: String
    private val description: String
    private val imageResourceId: Int
    private var review: List<Review>

    val myId = id



    init {
        this.id = id
        this.title = title
        this.artist = artist
        this.description = description
        this.imageResourceId = imageResourceId
        this.review = listOf(review)
    }

    fun getId(): Int {
        return id
    }

    fun getTitle(): String {
        return title
    }

    fun getArtist(): String {
        return artist
    }

    fun getDescription(): String {
        return description
    }

    fun getImageResourceId(): Int {
        return imageResourceId
    }
    fun getReview(): List<Review> {
        return review
    }

}

class Review(user:String,content:String, id:Int){
val user: String
val content: String
val id: Int
    init {
        this.user = user
        this.content = content
        this.id = id
    }

}



