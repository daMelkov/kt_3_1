sealed class Attachment {
    open val type: String
    get() = when (this) {
            is Photo -> "photo"
            is Video -> "video"
            is Audio -> "audio"
            is Doc -> "doc"
            is Graffiti -> "graffiti"
    }
}

class Graffiti (
    val id: Int,
    val ownerId: Int,
    val photo130: String
    ) : Attachment()

class Audio (
    val id: Int,
    val ownerId: Int,
    val artist: String? = null,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int? = null,
    val albumId: Int? = null,
    val genreId: Int? = null,
    val date: Int? = null
    ) : Attachment()

class Doc (
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String,
    val size: Int = 0,
    val ext: String? = null,
    val url: String? = null,
    val date: Int
    ) : Attachment()

class Video (
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String,
    val description: String? = null,
    val duration: Int
    ) : Attachment()

class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String? = null,
    val date: Int? = null
) : Attachment()