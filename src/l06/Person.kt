package l06

class Person(var firstName: String, var lastName: String, var age: Int) {
    override fun toString(): String {
        return "$firstName $lastName Age: $age"
    }
}