package `class`

fun main() {


    val buyukBaba = BuyukBaba(money = 5000)
    val buyukAnne = BuyukAnne()
    val anne = Anne()
    val baba = Baba("Nurullah", "Erol", 10, buyukBabaMoney = buyukBaba.money)
    val erkekcocuk = ErkekCocuk(20)
    val kizCocuk = KizCocuk(
        24,
        )


}
// Javada mirasa açık halde durur
// Kotlinde Open yapmamız gerekiyor.
// MultiInheritance yapılamıyor.


open class BuyukBaba(
    val name: String = "Ali",
    val surName: String = "Erol",
    val money: Int
) {
    // override function içinde open olması gerekiyor.
    open fun printInfo() {

        println("Name $name , surName : $surName , Money  $money")
    }
}

open class BuyukAnne

open class Baba(
    private val babaName: String,
    private val babaSurname: String,
    private val babaMoney: Int,
    buyukBabaMoney: Int
) : BuyukBaba(money = buyukBabaMoney) {
    override fun printInfo() {
        println("Baba Name $babaName , baba surName $babaSurname , baba money $babaMoney")
        println("Dede Name $name , dede surName $surName , dede money $money")
    }
}

open class Anne : BuyukAnne()

class ErkekCocuk(dedeMoney: Int) : Anne(

)

class KizCocuk(babaMoney: Int) : Baba(
    "Nurullah",
    "Erol",
    10,
    babaMoney
)
/**
miras aldığımız var Child veriyorsak instance oluştururken  init{} çalışır ilk
method tetikleniyorsa fun yapıyorsak o yapar. child class tarafından override edildiyse çalışır init blog girer
child init çalışır.

null olmaması gereken değer null geliyorsa override edilenleri kontrol et

bir classlar kotlin public olarak geliyor
2 class constructor primary ve secondary var
secondary constuctorlardan init blog var
primary constructordan dolayı ilk init blogu kullanıyor
java extend kotlin :
MultiInhretance yok
Üst class extend aldıysak alt
Üst class init override edilen fun varsa alt class override edildiyse
ilk üst class child'de nulll değerler varsa override kısmına bir bak

Miras aldığımızda neler var.
Override neler var

 */















































