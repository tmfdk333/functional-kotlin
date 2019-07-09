package chapter01
/*
class Biscuit(val flavour: String) {
    fun eat(): String {
        return "냠냠냠, 맛있는 $flavour 비스킷"
    }
}
open class BakeryGood(val flavour: String) {
    fun eat(): String {
        return "냠냠냠, 맛있는 $flavour 베이커리 제품"
    }
}

class Cupcake(flavour: String): BakeryGood(flavour)
class Biscuit(flavour: String): BakeryGood(flavour)

fun main(args: Array<String>) {
    val myBlueberryCupcake = Cupcake("블루베리")
    println(myBlueberryCupcake.eat())
}
*/
/*
open class BakeryGood(val flavour: String) {
    fun eat(): String {
        return "냠냠냠, 맛있는 $flavour ${name()}"
    }

    open fun name(): String {
        return "베이커리 제품"
    }
}

class Cupcake(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "컵케이크"
    }
}

class Biscuit(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "비스킷"
    }
}

fun main(args: Array<String>) {
    val myBlueberryCupcake = Cupcake("블루베리")
    println(myBlueberryCupcake.eat())
}
*/
/*
open class BakeryGood(val flavour: String) {
    fun eat(): String {
        return "냠냠냠, 맛있는 $flavour ${name()}"
    }

    open fun name(): String {
        return "베이커리 제품"
    }
}

open class Roll(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "롤"
    }
}

class CinnamonRoll: Roll("시나몬")

open class Donut(flavour: String, val topping: String): BakeryGood(flavour) {
    override fun name(): String {
        return "${topping}로 토핑된 도넛"
    }
}

fun main(args: Array<String>) {
    val myDonut = Donut("커스터드", "파우더 슈가")
    println(myDonut.eat())
}
*/