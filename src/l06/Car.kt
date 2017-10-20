package l06

class Car(private var weight: Float, private var size: Int) {
    var isNew: Boolean = false
        get() {
            return field
        }
        set(value) {
            if (value) {
                println("Yeeees")
            }
            field = value
        }

    override fun toString(): String {
        return "Car(weight=$weight, size=$size, isNew=$isNew)"
    }
}