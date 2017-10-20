package l08

fun main(args: Array<String>) {

/*
    val red = Color.RED
    println("red.name = ${red.name}, red.colorHex = ${red.colorHex}, red.opacity = ${red.opacity}")

    val white = Color.WHITE
    println("white.name = ${white.name}, white.hex = ${white.colorHex}, white.opacity = ${white.opacity}")
*/

    for (color in Color.values()) {
        println("color.name = ${color.name}, color.hex = ${color.colorHex}, color.opacity = ${color.opacity}")
    }
}