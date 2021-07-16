package `class`

import Function.baz

/**
 *
 *  * Bir classın  ihtiyaç duyacağı şey constructor ile kısıtlama yapılır..
 * Instance yaratılmak için ihtiyaç duyacağı şey..
 *
 */

//Aynı isimdeki yapıya birden fazla yazmaya overloading

class Car(name: String = "Mini Cooper", color: String, weelCount: Int = 3) {
    init {
        println("Init blog çalıştı")
    }

    constructor() : this(color = "Red") {
        println("1 second constructor ")
    }

    constructor(madeof: String) : this("MiniCooper", "Red", 3) {
        println("2. second constroctur")
    }

    constructor(madeof: String, name: String, color: String, weelCount: Int) : this(name, color, weelCount) {
        println("3. second constructor ")
    }

}

/*    primary constractor ve secondary constractor var
      annotion belirtmiyorsak visibli private gibi vs belirtmiyorsak constructor vermeye gerek yok
 */
class ExampleConstructor(name: String)

// Primary constructora yerine secondry constructor yazılacaksa primary constructoru this ile gösterilecek.
class Car2 constructor() {

    constructor(madeof: String) : this()
}

// this ile primary constructora defualt değer ataması gerekiyor.
class Car3 constructor(name: String = "Mini Cooper", color: String = "Red", weelCount: Int = 3) {

    constructor(madeof: String) : this()
}

// primary kısmında name argument atandı .Bu yüzden mavi olarak yazıyor.
class Car4 constructor(name: String = "Mini Cooper", color: String, weelCount: Int = 3) {

    constructor(madeof: String) : this(color = "Red")


    // constructor overloading
    // Birden fazla nesne oluştulursa birden fazla constructor olarak yapılabilir.
    constructor(name: String, color: String, madeof: String) : this(color = "Red")

}


// init blog!!

class Initblog {
    // Constructorların dışında init blogu geliyor. Javada her yerde init blog yazıyordu. Artık default olarak geliyor.
    // çalıma zamanlaması

    init {
        println("Merhaba")

    }
}

class CarOpen

fun main(args: Array<String>) {
    val car: Car = Car()
    val car2: Car = Car("Metal")
    var car3: Car = Car(
        "Metal ", "Mini Cooper", "Red", 2
    )

    val car5: CarOpen = CarOpen()
    baz

    /**
    // Javada Consturctorları overload yapıyoruz.
    // Primary ve Secondary constructor var.
    // Secondary overload ediyoruz.
    // Secondary constructor yazıyorsak. Primary constructor this diye işaretlememiz gerekiyor.
    // Seconday constructor init blog çalışması nedeni primary constructor işaret ediyor olduğumuzdan dolayı.
    // Javada new var Kotlin'de yok
     *
     */



    // SundayExample Start

    // defualt olarak "Red" atandı sen onu atamazsan kızar.
    val day = Day("Hello")
}


/*
    Start Sunday Learning Kotlin 06.06.2021
 */


// constructor yazman gerekeiyorsa başına visibilty gelmesi gerekiyor
// best practise için yapman gerekiyor.
class Day constructor(day: String, color: String = "Red") {

    private val mDay: String
    private val mColor: String

    init {
        mDay = day
        mColor = color
        "primary const. created".printLog()
    }
    // primary constructor işaret etmek için this dememiz gerekiyor.

    // kızmasının sebebi veri sayısı farklılaştırması gerekiyor. Aynı sayıda değişken bekleyeceksin verilerin tipleri farklı olacak
    // tip veya sayıların farklılaşması gerekiyor.
    // constructor(name : String) : this("Pazartesi")


    constructor(name: String, day: String, color: String) : this("Pazartesi", "Red") {
        "2.secondry const created".printLog()
    }

    /*  Extension Func yazıldığı için silinebilir.
       fun printLog(message : String){
           // day kullanmak istiyorsan val ve var ile kullanmak gerekiyor.
           // make val not var
           println("Message $message  day $mDay Color  $mColor")
           println("---------------------------")

          }
     */


}

// her bir constructor çalışmadan önce bile init blogu çalışıyopr
/*
class Person2(){}

// implecit bir şekilde boş bir constructora sahip
// her class Any classını almaktadır.
// defualt construtorc implecit olarak yazılır.
// Bir classtan miras alırsa en tepedeki class Any'den miras alıyor
// javadaki object kavramına karşılık gelecektir.
val person = Person()

 */

// Bir classın üyelerine baktığımızda veya yazabildiklerimiz

// değişkenler yazabiliriz.
// property ve functionlar üye fonsksiynlar
// nested yada inner classlar  yazılacaklar
// object kullanımı

// Extension func örnek
fun String.printLog() {
    println(this)
    println("--------------------")
}


// polymorphism
//
