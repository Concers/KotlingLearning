package Function

import `class`.printLog

/**
 * Visibility modifiers classlar objectler interface constructor functions properter ve setters kullanabiliriz.
 * Getters visibility propertye sahip çünkü verdiğimizde değişken değiştirelemez olur.Bizler değişkenlerin getleriden
 * bilgi aldığımız için onlara erişmemiz gerekiyor.
 * Visibility modifeyer private , protected ,internal ve public.. defualt olarak her yapı public olarak geliyor.
 */

fun main(args: Array<String>) {
    println(bar)
    baz = 4
    bar = 4
    println(bar)


//    val Nested = Outer.Nested() //
//    println(Nested)



}

/**
 * Eğer ki hiç bir visibility modifier yazmazsak defualt olarak public olarak geliyor declatiorions anlamı olaarak v
 * visible görünür oluyor
 * private olarak yazdığımızda sadece görünür olduğu yerde erişebiliriz.
 * Internal olarak yazdığımız yazı modul yapısında visible olmasını sağlıyor
 * protected top-level declatirons olarka kullanılamaz
 */
fun baz() {}
class Bar

private fun foo() {

}

/**
 * Get kısmını return olarak 1 yaptığımızda değiştirsek bile değeri  bizlere get return değeri 1 olduğu için 1 dönecek
 *
 */
  var bar: Int = 5
    private set

internal var baz = 6 // visible inside same module

/**
 *
 */


open class Outer {
    private val a = 1 // Private olduğu için dışarıdan erişemiyorum.
    protected open val b = 2 // protected olduğun için erişemiyorum.
    internal val c = 3
    val d = 4

    // sadece bu class içinde eribilirim
    protected open class Nested {
        open val e: Int = 5
    }


}

class Subclass : Outer() {


    var nas = 4


    override val b: Int
        get() = super.b


}

 class Unrelated(o: Outer) {

    /**
     * o.a ve o.b visible olamadığı için erişemiyorum
     * o.c ve o.d visible olduğu için aynı modul içinde erişebiliyorum
     */
    val oC: Int = o.c
    val oD: Int = o.d
    //   val nested = Outer.Nested // protected olduğundan dolayı erişemyiorum.


}

class C(a: Int)


/**
 *
 * Local declatrons functions ve classlara visibility modifier ekleyemiyoruz.
 *
 */

/**
 *
 * Modul seviyesinde visibilty modifier eklemek istiyorsak internal yazmamız gerekiyor.
 *
 *
 */
