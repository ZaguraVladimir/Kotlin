package l06

fun main(args: Array<String>) {

    val person = Person("Vladimir", "Zagura", 38)
    println("person = ${person}")

    val car = Car(1000F, 1)
    println("car = ${car}")
    car.isNew = true
    println("car = ${car}")

}