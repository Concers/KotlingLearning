package `class`

/**
 *
 * object experssion == sağ tarafına yazabildiğimizden ötürü
 *
 * when function
 *
 *
 *
 */

interface Print2{
    fun onPrint()
}

open class User{
    open fun getUserFullName(){}

}

val fullName : User = object : Print2 , User(){

    val firstName = "Uğur"
    val surname = "Erol"
    override fun onPrint() {
        println("Full name = $firstName $surname")
    }

    override fun toString(): String {
        return "$firstName $surname"
    }

    override fun getUserFullName() {
        super.getUserFullName()
    }
}

fun main(args: Array<String>) {
    println("Full name : ${fullName.toString()}")
}

