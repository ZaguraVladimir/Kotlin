package l14

fun main(args: Array<String>) {
    var nums = 0..10

    println("value in nums")
    for (value in nums) {
        print("value = ${value}${if (value == nums.last) "\r\n" else ", "}")
    }

/*
    println()
    println("value in 17")
    for (value in 10  100 step 5) {
        print("value = ${value}${if (value == nums.last) "\r\n" else ", "}")
    }
*/

    println()
    println("value in nums step 2")
    for (value in nums step 2) {
        print("value = ${value}${if (value == nums.last) "\r\n" else ", "}")
    }

    println()
    println("value in 10 downTo 0")
    for (value in 10 downTo 0) {
        print("value = ${value}${if (value == nums.first) "\r\n" else ", "}")
    }

    println()
    println("value in 10 downTo 0 step 3")
    for (value in 10 downTo 0 step 3) {
        print("value = ${value}${if (value == nums.first) "\r\n" else ", "}")
    }
}