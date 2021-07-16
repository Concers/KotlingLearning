package `class`

/**
 *
 *
 */

val balance: Int = 25000

data class BankAccount(val balance: Int)

/**
 *
 * Inline classların belirtilen constructor'ları java kodunda private olarak bulunurlar.
 * Bundan dolayı zaten bu constructorlarlar nesne oluşturamıyoruz. Bunu yapabiliyor gibi görünmenin sebebi
 * gerçekte o nesnenin hiç yaratılmıyor oluşu sebebiyle.
 * Bizim nesne oluşturduğumuz olarak şey ise değişkenin kendisi..
 *
 *
 * Inline Classlar içerisine property tanımlanmasına izin verir. Bu propertyin backing fieldi olamaz..
 *
 * Inline classlar herhangi bir interface'i implement edebilirler.
 * Open keyword'yla beraber kullanılamaz. Final keywordu vermekte redundant uyarısı verir.
 *
 * abstract keywordu ile de kullanılamaz.
 *
 *
 */


//@JvmInline
//value class BankAccount3(val balance: Int) : Print  {
//
//    init {
//        println("balance ")
//    }
//
//    val accountNumber : Long
//    get() {
//        return 123131
//    }
//
//    override fun balancePrint() {
//        TODO("Not yet implemented")
//    }
//
//}


interface Print{
    fun balancePrint()
}

/**
 *
 * value class @JvmInline annotation olmadan henüz kullanılmıyor.
 * Ancak value  classların dokumantasyonunda inline classların birden fazla değişlen alabilmesine izin verilecek yazıyor
 *
 *
 *


 */



interface I


 class Foo(val i: Int) : I

fun asInline(f: Foo) {}
fun <T> asGeneric(x: T) {}
fun asInterface(i: I) {}
fun asNullable(i: Foo?) {}

fun <T> id(x: T): T = x




fun main(args: Array<String>) {
    val f = Foo(42)

    asInline(f)    // unboxed: used as Foo itself
    asGeneric(f)   // boxed: used as generic type T
    asInterface(f) // boxed: used as type I
    asNullable(f)  // boxed: used as Foo?, which is different from Foo

    // below, 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just '42'), as 'f'
    val c = id(f)

}
