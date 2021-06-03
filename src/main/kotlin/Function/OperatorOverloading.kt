// Operator Overloading

data class PairNumber(val numberOne: Int, val numberTwo: Int) {

    operator fun minus(pairNumber: PairNumber): PairNumber {
        val returnPairObject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )
        println("Sonuc = (${returnPairObject.numberOne} , ${returnPairObject.numberTwo})")

        return returnPairObject
    }
}

fun main() {
    val plusNumber = PairNumber(10, 11)
    val plusNumberTwo = PairNumber(2, 5)
    val pairNumber = plusNumber - plusNumberTwo

    val numbers = listOf(5, 2, 10, 4)

    val sum = numbers.reduce { sum, element -> sum + element }
    println(sum)
    val sumDoubled = numbers.fold(0) { sum, element -> sum + element % 2 }
    println(sumDoubled)

}