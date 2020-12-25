import attachments.Attachment

/**
 * Объект, описывающий комментарий к записи
 */
class Comment (
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut?,
    val replyToUser: Int?,
    val replyToComment: Int?,
    val attachments: Array<Attachment>?,
    val parents_stack: Array<Comment>?
)