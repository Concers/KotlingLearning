fun main() {
    // ExtensionFuction Reciver sınıfa ihtiyaç duyucaz.

    fun String.extPrint(handsomeValue: HandsomeOne): Unit {

    }

    val name: String = "Uğur"


    val square = Shape().areaSet(2)
    println(square)


    //extension fonsiyon ister direk valuler üzerinden çoğalabilir
    (3 + 0.14).numberToString("")
    1353.toFloat()

    //infix fonsiyonlar extension fonsksiyonlarla kullanabilir
    //extplus infix extension olduğun için . kullanıma gerek duymaz.
    //log ise sadece extension oluğu için nokta ile çağrılır


    //infix fonksiyonlar extension fonksiyonlarla kullanabilir.
    // extPlus infix extension olduğu için . kullanımına ihtiyaç duymaz.
    // log ise sadece extension fonksiyon olduğu için nokta ile çağrılır
    ("3" extPlus "5") log2 ("")

    // 2saat11dakika


}

infix fun Number.numberToString(number: String) {
    println(number)

}

// infix extension fonskyion expression formundada kullanabilir...
infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()
class HandsomeOne

infix fun Number.log2(string: String) {
    println(string)
}

// String receiver hali infix yapılmış
infix fun String.stringPrint(emptyParam: String) {
    println(emptyParam + this)
}


//class içinde yazılan extension func. yazıldıysa bir dosya içerisinde yazılması gerekiyor.
class foo {
    fun Number.extString(number: Number) {
        println(number.toString())
    }
}

// Global olarak Ext Func için
infix fun Double.extDoubleToString(double: Double) {
    this.toString()
}

// bir sınıfın içinde farklı bir sınıfa ait ext.founc varsa  bu sınıfın içinde aynı isimli fun olsa bile
// extension çağırmak için this@sinifismi.uyefonksoyin() şeklinde çağırım yapılabilir.
// classı etiketlemek gerekiyor.


// bir sınıfın ismine ait ext yazarsnız. üye fonksion olarak yazıldıysa  extension ile birebir aynı ise
// geri dönüş tipler aynı ise üye classta birebir olduğu için classtaki çalışır.
// methodu override etmen gerekiyor.
//  class abstract override edemezsin.

open class Shape {
    fun setNumber(number: Number) {
        println(number)
    }
}

fun Shape.setNumber2(number: Number) {
    this.toString()
}

fun Shape.areaSet(area: Int) = println(area * area) // single expression kullanımı


// bir sınıfa extension fonsiytona extension propertyde yazılabilir.
// bunun sebebi propertylerin get ve set olmasından dolayı
// bu extension properylerin içerisinde field tanımlanamaz.
// property ve field konusu beraber sınıflar işlenirken anlatılacak

//var Shape1.type:
//    get() = "Rectange"
//    set(value) = {
//        type = value
//    }
//


//class Rectange : Shape() {
//    override fun Int.setNumber() {
//
//    }
//
//}

//Notes : nullable extension function a yazılabilir.
//        Compainion objectlere extension yazılabilir.Sınıflar'da örneğini yapabilecğeiz.
//
//


// bir class içersine yazmadan fonksyionlar yazabilmek extension fonksiyon.

open class Square {
    var intNumber = 0
    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber
    }

    open fun Int.extToString() {
        println("")
    }

    fun log(log: Int) {
        println(log)
    }

    fun extToString() {
        println("Keko class printi")
    }
}


class Rectange : Square() {
    override fun Int.extToString() {
        TODO("Not yet implemented")
    }
}

