/**
 * Объект, описывающий запись на стене пользователя или сообщества
 */
data class Post(
    val id: Long,
    val ownerId: Int,
    val fromId: Int?,
    val createdBy: Int,
    val date: Int,
    var text: String,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = false,
    val comments: Comment? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String = listOf("post", "copy", "reply", "postpone", "suggest").toString(),
    val postSource: PostSource? = null,
    val signerId: Int? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut? = null,
    val postponedId: Int? = null
)