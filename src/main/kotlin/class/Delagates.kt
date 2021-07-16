package `class`

import kotlin.properties.Delegates

class User85 {
    var name: String by Delegates.observable("Initilazed Value") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }


}

/**
 *
 * veteoble farkı
 * if(!beforeChange  false ise akışta çıkartıyor
 * true ise değişikliği yapıyor..
 *
 * şart cümlesi yazılır
 * şart cümlesi sağlandığında değer ataması yapılur...
 *
 * vetoable return değeri boolean değer ister
 *
 *
 */
var max : Int by Delegates.vetoable(0){
    property, oldValue, newValue ->
    newValue > oldValue
}

fun main(args: Array<String>) {
    val user = User85()
    user.name = "first"
    user.name = "second"


    println(max)
    max = 10
    println(max)
    max = 5
    println(max)




}

/**
 *
 * Vetoable vs Observable farkı Kotlin nedir ?
 *
 * bir class değernin değişeceğin interface veya higher order invoke observable patterni
 * Livedata
 */