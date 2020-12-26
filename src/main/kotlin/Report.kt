class Report (
    val ownerId: Long,
    val commentId: Long,
    reasonId: Int = 1
) {
    var reasonId = reasonId
    set (value) {
        if (value in 1..8) {
            field = value
        }

        throw ReasonNonFoundException("Reason not correct")
    }
}

class ReasonNonFoundException(message: String) : Exception(message)