package l10

class B : MyInterface {
    override fun f1() = "B.f1"

    override fun f2(): String {
        return "${super.f2()} + B.f1"

    }
}