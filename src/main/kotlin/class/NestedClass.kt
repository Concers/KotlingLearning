package `class`


/**
 * Nested Class
 *
 * Classlar iç içe classların olduğu yapılar.
 * Class içine class tanımlarsak nested class olur.
 * Üstündeki classın değişkenine veya fonksiyonuna erişemiyor.
 * ClassIsmi.NestedClass().printname
 * NestedClasslar static olarak tutuluyor.
 *
 *
 * Inner class içine nested yapmamıza izin verilmiyor. Ancak yine inner class ekleyebiliriz.
 *
 * Nested class içerisine bir nested class ya da inner farketmeksiniz class ekleyebilirsiniz..
 *
 *
 *
 * Ne yaptığından emin değilseniz yazmayın
 *
 */


class Outer {
    private val bar: Int = 1

    class Nested {
        fun printname() {
        }
    }

}

class Outer2 {
    private val bar: Int = 1
    private val name = "Ugur"
    private val surName = "Erol"
    fun getAge() = 31
    inner class Nested {
        fun printname() {
            name
            surName
            getAge()
        }
    }

}

/**
 * Interface içerisinde interface veya class barındırabilir.
 */


fun main(args: Array<String>) {
//    val demoInterface = OuterInterface.InnerClass()
    /**
     * İlk class dış nesnesini çağırıp içindeki classlara veya interfacelere ulaşabiliriz.
     */
    val demo2 = Outer.Nested()
    /** Interface'li çağırımı
     *
     */
    Outer2().Nested().printname()
}
