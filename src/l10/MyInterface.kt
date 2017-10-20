package l10

interface MyInterface {
    val n: Int get() = 2

    fun f1(): String
    fun f2() = "MyInterface.f2"
}