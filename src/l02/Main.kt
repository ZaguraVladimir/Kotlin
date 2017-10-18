package l02

fun main(args: Array<String>) {
    val userJava: UserJava = UserJava("zvm4@yandex.ru")
    println("userJava.email = ${userJava.email}")

    val userKotlin: UserKotlin = UserKotlin("ZaguraVladimr@GMail.com")
    println("userKotlin.email = ${userKotlin.email}")
}