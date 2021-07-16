fun main(args: Array<String>) {

}

// Javada çağırmak için ..
@JvmOverloads
fun print(message  : String = "Message"){
    println(message)
}


// extend edebilir bir sınıf , yavru child sınıf tarafından inherit alınırsa
// ve sınıfı override edelebilir open bir method varsa bu ,method argument'e sahip olursa
// defualt değer alan varsa override ettikten sonra değer değiştirelemiyor.
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