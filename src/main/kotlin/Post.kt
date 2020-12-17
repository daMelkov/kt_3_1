/**
 * Объект, описывающий запись на стене пользователя или сообщества
 */
data class Post(
    val id: Long = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int = 0,
    val date: Int,
    val text: String,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Int = 0,
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Int = 0,
    val canClose: Boolean = true,
    val canOpen: Boolean = true,
    val copyright: String = "",
    val likes: Int = 0,
    val reposts: Int = 0,
    val views: Int = 0,
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut,
    val postponedId: Int = 0
)