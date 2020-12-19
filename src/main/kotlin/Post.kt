/**
 * Объект, описывающий запись на стене пользователя или сообщества
 */
data class Post(
    val id: Long,
    val ownerId: Int,
    val fromId: Int?,
    val createdBy: Int,
    val date: Int?,
    var text: String?,
    val replyOwnerId: Int?,
    val replyPostId: Int?,
    val friendsOnly: Boolean?,
    val comments: Int?,
    val count: Int?,
    val canPost: Boolean?,
    val groupsCanPost: Int?,
    val canClose: Boolean?,
    val canOpen: Boolean?,
    val copyright: String?,
    val likes: Int?,
    val reposts: Int?,
    val views: Int?,
    val postType: String?,
    val signerId: Int?,
    val canPin: Boolean?,
    val canDelete: Boolean?,
    val canEdit: Boolean?,
    val isPinned: Boolean?,
    val markedAsAds: Boolean?,
    val isFavorite: Boolean?,
    val donut: Donut?,
    val postponedId: Int?
)