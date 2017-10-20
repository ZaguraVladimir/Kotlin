package l15

fun main(args: Array<String>) {
    val i = 3
    val intRange = 1..10
    println("${i} in intRange = ${i in intRange}")

    val c = 'G'
    val charRange = 'a'..'z'
    println("${c} in charRange = ${isChar(c, charRange)}")
    for (c in charRange) {
        print(c)
    }
    println()
    println(c)
}

fun isChar(char: Char, charRange: CharRange) = char in charRange