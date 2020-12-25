object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

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

class PostNotFoundException(message: String) : Exception(message)