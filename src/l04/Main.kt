package l04

fun main(args: Array<String>) {

    val myFirstFunction: Int = myFirstFunction()
    println("myFirstFunction = ${myFirstFunction}")

    val myFirstFunction1: Int = myFirstFunction1(123)
    println("myFirstFunction1 = ${myFirstFunction1}")

    myFirstFunction2()

    val myFirstFunction3: Double = myFirstFunction3(2, .5)
    println("myFirstFunction3 = ${myFirstFunction3}")
}

fun myFirstFunction(): Int {
    return 1
}

fun myFirstFunction1(a: Long): Int {
    return a.toInt()
}

fun myFirstFunction2() {
}

fun myFirstFunction3(a: Long, b: Double) = a + b