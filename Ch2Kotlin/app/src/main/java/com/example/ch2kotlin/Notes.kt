package com.example.ch2kotlin

class Notes {
}

//interface  Nurse{
//    fun goAndBuyMedicine()
//}
//
//interface Medical {
//    fun giveMedicine()
//}
//class MedicalImpl() : Medical {
//    override fun giveMedicine() {
//        println("give medicine")
//    }
//}
//class Doctor(private val nurse: Nurse): Nurse by nurse{
//
//}
//class NurseImpl(val medical: Medical): Nurse,Medical by medical {
//    override fun goAndBuyMedicine() {
//        println("give medicine list to nurse")
//    }
//}
//
//
//fun main() {
//    val medical = MedicalImpl()
//    val nurse = NurseImpl(medical)
//    val doctor = Doctor(nurse)
//    doctor.goAndBuyMedicine()
//    nurse.giveMedicine()
//
//}
data class Darshan(
    val brain: Brain? = null,
    val legs: Leg? = null,
    val hands: Hand? = null,
    val hasCommonSense: Boolean
)

data class Brain(
    val reallyHasBrain: Boolean = true,
    val cells: List<Cells> = emptyList()
)

data class Cells(val id: Int)

data class Leg(val count: Int)
data class Hand(val count: Int)

fun main() {
    val brain = Brain(true)
    val leg = Leg(2)
    val hand = Hand(2)

    val darshanTheRockstar = Darshan(hasCommonSense = true)

    darshanTheRockstar
        .brain
        ?.cells
        .orEmpty()
        .size
        .let { println(it) }

    darshanTheRockstar
        .brain
        ?.cells
        ?.size ?: 0
        .also { println("output: $it") }

    darshanTheRockstar
        .hands
        ?.count


    darshanTheRockstar
        .legs
        ?.count ?: 0
        .run { println(this) }

    var person = Darshan(brain,leg,hand,true)
    person
        ?.brain
        ?.cells
        ?.size
        .apply { println(this) }


    person
        .legs
        ?.count
        .let { if (it == null) println("output2 : ") }

}
