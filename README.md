### Задача №1 - PostNotFoundException
Мы продолжаем развивать наш сервис с постами и решили внедрить в него возможность комментирования постов: [createComment](https://vk.com/dev/wall.createComment).

В чём суть? Вы создаёте member function внутри `WallService`:
```kotlin
class WallService {
private var posts = emptyArray<Post>()
private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment) {
        TODO()
    }
}
```
Как работает эта функция: она сначала проверяет, существует ли в массиве `posts` пост с `id` равным тому, что в комментарии в свойстве `postId`. Если существует, то добавляет комментарий в массив `comments`.

А вот если не существует - выкидывает исключение `PostNotFoundException`.

Спроектировать класс для комментариев вам нужно самостоятельно на базе описания типа [Comment](https://vk.com/dev/objects/comment).

### Задача №2 - JUnit
Как вы уже знаете - без тестов никуда. А это значит, что нам нужно написать целых два теста на созданную нами функцию:

1. Функция отрабатывает правильно, если мы добавляем комментарий к правильному посту
2. Функция выкидывает исключение, если мы пытаемся добавить комментарий к несуществующему посту
Тестировать, что какой-то код выкидывает исключение, достаточно просто:

```kotlin
@Test(expected = PostNotFoundException::class)
fun shouldThrow() {
// здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
}
```
### Задача №3 - Жалобы*

В социальных сетях есть разные люди, которые оставляют разные комментарии.

Неплохо бы внедрить [функцию для уведомления о нехороших комментариях](https://vk.com/dev/wall.reportComment).

Что нужно сделать:
1. Реализовать саму функцию (для простоты храните эти репорты в отдельном массиве)
2. Подумать в каких случаях и какие нужно выкидывать исключения*
3. Написать автотесты