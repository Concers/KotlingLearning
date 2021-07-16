package `class`


/**
 *
 * Kotlinde Tip parametreleridir.
 *
 *
 */




class Company<T> (text : T){
    var x = text
    init {
        println(x)
    }
}

fun main() {
    var name : Company<String> = Company("Ugur")
    var rank : Company<Int> = Company(12)
}

//class Box<in C>(c: C) {
// fun println(c: C) {
//
//     println(" ---- -$c")
//
// }
//
//}
//
//interface Source<T> {
//    fun nextT(): T
//
//}
//
//fun main(args: Array<String>) {
//    println("Box ${Box(2)}")
//}
