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
        name, price, weight
    ) {
        add = weight
    }
}

class Profile {
    lateinit var userName: String


    fun setUpName(userName: String) {
        this.userName = userName
    }

    fun printUserName() {
        if (::userName.isInitialized) {
            println("UserName is $userName")
        } else {
            println("Name is not initialize")
        }
    }
}

//abstract method override in enum
enum class Calculator {
    ADD {
        override fun perform(a: Int, b: Int): Int {
            return a + b
        }
    },
    SUBTRACT {
        override fun perform(a: Int, b: Int): Int {
            return a - b
        }
    },
    MULTIPLY {
        override fun perform(a: Int, b: Int): Int {
            return a * b
        }
    },
    DIVIDE {
        override fun perform(a: Int, b: Int): Int {
            if (b == 0) {
                throw IllegalArgumentException("Cannot divide by zero")
            }
            return a / b
        }
    };

    abstract fun perform(a: Int, b: Int): Int
}

fun main() {
    val add = Calculator.ADD.perform(1,2)
    println(add)

    val profile = Profile()
    profile.printUserName()

    profile.setUpName("Shyam")
    profile.printUserName()


    val systemPc = SystemPc("System", 200, 2)
    println(systemPc.name)
    println(systemPc.price)
    println(systemPc.add)


    val numbers = listOf(2, 312, 15, 23, 76)
    println(numbers.sortedDescending())
    println(numbers.reversed())

    val set = setOf<Int>(1, 2, 12, 122)
    println(set.mapIndexed { k, v -> k * v })
    println(set.map { it * 4 })
    println(set.reduce { a, i -> a * i })
    println(set.sum())
}


