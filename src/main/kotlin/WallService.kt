object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<Report>()

    fun createComment(comment: Comment) {
        val postId = comment.postId;

        for (post in posts) {
            if(post.id == postId) {
                comments.plus(comment)
                return
            }
        }

        throw PostNotFoundException("Post not found: $postId")
    }

    fun report(comment: Comment, reason: Int) {
        for (_comment in comments) {
            if (_comment.id == comment.id) {
                val report = Report(comment.fromId, comment.id, reason)
                reports.plus(report)

                return
            }
        }

        throw CommentNotFoundException("Comment not found: ${comment.id}")
    }

    fun add(post: Post): Post {
        val count = posts.size + 1L
        val item = post.copy(id = count)

        posts += item
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, existPost) in posts.withIndex()) {
            if (existPost.id == post.id) {
                posts[index] = post.copy(id = existPost.id, ownerId = existPost.ownerId, createdBy = existPost.createdBy)
                return true
            }
        }

        return false
    }
}

class CommentNotFoundException(message: String) : Exception(message)

class PostNotFoundException(message: String) : Exception(message)