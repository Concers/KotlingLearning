package collections

import `class`.E
import java.lang.reflect.Type

/**
 *
 * Collections içerisine varrag yazamıyorsun. Bakınız infix function
 */
fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three","four")
    println("Number Elemensts ${numbers.size}")
    println("Third Elements ${numbers[2]}")
    println("Fourth elements ${numbers[3]}")
    println("Index of Element \"three\" ${numbers.indexOf("three")} ")
}

fun Array<Type>.getlow(a : Array<Type>): Array<Type> {
    return a


}

