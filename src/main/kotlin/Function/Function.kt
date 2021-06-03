fun main(args: Array<String>) {

}

// Javada çağırmak için ..
@JvmOverloads
fun print(message  : String = "Message"){
    println(message)
}

open class A {
    open fun foo (i : Int = 10){

    }
}
// dedemin soyadını değiştiremiyorum gibi.
class B : A() {
    override fun foo(i: Int) {
        super.foo(i)
    }
}