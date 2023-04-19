package com.example.ch2kotlin

class Emum {

}
enum class Pizza {
    SMALL, MEDIUM, LARGE
}
enum class Week(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)

}

interface  Cardlimit {
    fun limit()
}

enum class CardType : Cardlimit {
    Gold {
        override fun limit() {
            println("Gold Card limit : 100000")
        }
    },
    Platinum {
        override fun limit() {
            println("Platinum Card Limit : 200000")
        }
    },
    Daimond {
        override fun limit() {
            println("Diamond card Limit : 500000")
        }
    };
}

fun main() {
    val small = Pizza.SMALL
    println(small)

    val day = Week.SUNDAY
    println(day.number)

    for (element in Week.values()) {
        println("${element.ordinal} = ${element.name} - ${element.number}")
    }

    OuterEnum.InnerEnum.MEDIUM

}
enum class OuterEnum {
    ;

    abstract fun enumFunction()
    enum class InnerEnum {
        SMALL,MEDIUM,LARGE
    }
}