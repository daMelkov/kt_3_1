import attachments.Attachment

/**
 * Объект, описывающий комментарий к записи
 */
data class Comment (
    val id: Long,
    val postId: Long,
    val fromId: Int?,
    val date: Int,
    val text: String
)