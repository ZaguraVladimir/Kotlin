package l07

import l07.animals.cat.CatA
import l07.animals.cat.CatB
import l07.animals.dog.Dog
import l07.animals.u1
import l07.animals.u2

fun main(args: Array<String>) {
    val catA = CatA()
    catA.f1()
    catA.f2()
    val catB = CatB()
    catB.f1()
    catB.f2()
    val dog = Dog()
    dog.f1()
    dog.f2()

    u1()
    u2()
}