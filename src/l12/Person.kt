package l12

open class Person(val name: String = "anonimous") {

    open val age: Int = 0

    open fun getAdress(): String {
        return "Person address"
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, addres = '${getAdress()}')"
    }
}