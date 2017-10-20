package l10

fun main(args: Array<String>) {
    val miA: MyInterface = A()
    println("mi = ${miA}")
    println("mi.f1() = ${miA.f1()}")
    println("mi.f2() = ${miA.f2()}")

    println()

    val miB: MyInterface = B()
    println("mi = ${miB}")
    println("mi.f1() = ${miB.f1()}")
    println("mi.f2() = ${miB.f2()}")
}