package Function


/*  bir fonksiyon herhangi ir sınıfın içerisinde değil de bir osyasının boşlukta tanımlanıyorsa
    top level function

    Bir fun oluştururken top level fuction yazılmıyor.
 */


fun main(args: Array<String>) {

    funGlobal()

}

/*
    Fonksiyon içerisinde fonksiyon tanımı kotlin'dee yapılabilir'. bu fonksiyonlara local fonksiyon denir
    Sebebi ise yazdığınız
    Bir func scope içinde  başka bir function tanımlayabiliyoruz.
    Scope içerisiden fun herhangi bir yerden erişirken globaldaki olanı her yerden erişebilirsin.

    field private olsa bile bunların isimleriyle private methodlara erişebiliyoruz.
    Kotlin güvenlik önlemli olarak core iş yapan
    function LocalFunction çalışıyor funglobal çalışıyor funReflaction erişemiyorsan
encapsule

 */
fun matH() {

    fun getNumber() {

    }
}

fun funGlobal() {
    fun funReflaction() {}

    funGlobal()
}


/* bir fonsiyon Generic tip alıyorsa Generic Fonsiyon oluyor

 */

// fun <T> singletonList(item: T): List<T> { /*...*/ }