import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_post_id_more_then_0() {
        val post = Post(
            id = 0L,
            ownerId = 10,
            fromId = 10,
            createdBy = 10,
            date = 20201217,
            text = "post text",
            donut = Donut()
        )

        val actual = WallService.add(post).id

        assertTrue("Ожидалось, что добавленное сообщение будет иметь id отличный от 0.", actual > 0L)
    }

//    @Test
//    fun update() {
//        fail("Empty test")
//    }
}