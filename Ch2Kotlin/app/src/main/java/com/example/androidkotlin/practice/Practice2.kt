class Practice2
open class SystemPc(val name: String, val price: Int) {

    open val add = 5

    constructor(myname: String, myprice: Int, weight: Int) : this(myname, myprice)

    fun detail() {
        println("name is: $name and its price is $price")
    }
}

class Laptop(name: String, price: Int, val weight: Int) : SystemPc(name, price) {
    override var add: Int = 10

    constructor(name: String, price: Int, weight: Int, camera: Boolean) : this(
        name,
        price,
        weight
    ) {
        add = weight
    }
}

fun main() {
    val systemPc = SystemPc("System", 200, 2)
    println(systemPc.name)
    println(systemPc.price)

    var numbers = listOf(2,312,15,23,76)
    println(numbers.sortedDescending())
    println(numbers.reversed())


}

