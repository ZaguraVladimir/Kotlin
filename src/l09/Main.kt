package l09

import l08.Color
import l08.Color.*

fun main(args: Array<String>) {

    var r: String

    val n = 5
    r = when (n) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "None"
    }
    println("r = ${r}")

    println("r = ${getFavoriteColor(BLACK)}")
}

fun getFavoriteColor(color: Color) = when (color) {
    BLACK, WHITE -> "Черный или белый"
    GREEN -> "Зеленый"
    RED -> "Красный"
}
