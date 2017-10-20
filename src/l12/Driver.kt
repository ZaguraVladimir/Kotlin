package l12

class Driver(name: String) : Person(name) {

    override val age: Int = 2

    override fun getAdress(): String {
        return "Driver address"
    }

    override fun toString(): String {
        return "Driver(name='$name', age=$age, addres = '${getAdress()}')"
    }
}