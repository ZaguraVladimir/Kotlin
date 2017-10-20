package l13

class SuperMouse : Mouse() {
    fun funB() {
        println("SuperMouse.funB")
        funProtected()
    }
}