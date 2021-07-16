package `class`

import javax.print.attribute.standard.Media


/**
 *
 * veri tutmak için data class diyeceğiz
 *
 *
 *
 * iş görüşmesi sorusu
 *
 * Data Class vs Class farkı iş görüşme sorusu
 *
 *
 */
/**
 *
 *
 * Data classlar  1 parametre almak zorundadur
 * paramatreler val ve var ile yazılmalıdır.
 *Open yapılamıyor , abstract , sealed , inner yapılamıyor
 * tüm data classlar final olduğu için final modifier' redundant uyarısı verir.
 * Tüm classlar publictir görünülür için.
 *
 *
 * def. nesnesini oluşturduğumuzda fonksiyonu arka planda oluştururlar.
 * equals method.
 * hashcode method.
 * toString fonksiyonu copy -
 * compenentN
 * ----------------------------
 *
 * düz classlarda toString alabilmemiz için override edip return kısmına bütün
 * değişkenlerini vermemiz gerekiyor.
 *
 * val ve var bir class içindeki fonskiyonu erişmemiz için yazılmaktadır.
 *
 * tüm classlar any olduğu için hascode toString oluşturuluyor fakat bizlerden düz classlar geri dönüş değeri vermektedir.
 *
 *
 * Yukarıdaki fonksiyonlardan biri override edilirse, oto generate edilen hali yazılmaz.
 *
 * Yukarıdaki fonksiyonlar sadece primary const. içerisindeki değişkenlerle çalışır.
 *
 *
 *Pair ve triple özelleştirilmiş generic data classlar mevcut.
 *
 *
 *
 * Classlar extend edilir...
 */

data class News(
    var title: String = "Title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
) {
    init {
        val initblock: Int
    }
}

open class NewsData(
    val title: String,
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
) {


    var children: MutableList<Person> = mutableListOf()

    constructor(title2: String, parent : News): this(title2,"hello", true, listOf()){

    }
}


fun main(args: Array<String>) {
    val newsOne = News(
        "Yeni Bir eğitimi Dönemi Başladı",
        "Eğitim Dönemi yeni bir şekilde başladı",
        true,
        arrayListOf()
    )
    val newsTwo = NewsData(
        "Yeni Bir eğitimi Dönemi Başladı",
        "Eğitim Dönemi yeni bir şekilde başladı",
        true,
        arrayListOf()
    )



    println("Data Class: $newsOne")
    println("Class  $newsTwo")



//    newsOne.equals()
    newsOne.toString()
    newsOne.hashCode()
    newsOne.copy()
    newsOne.component1()

    newsTwo.toString()
    newsTwo.hashCode()
    // https://kotlinlang.org/docs/destructuring-declarations.html ilgili konu
    val (title, description, hashmediaContent, mediaList) = newsOne

    val newsThree = newsOne.copy(description = "Farklı descration")

    // generic type...
    val pair = Pair("Gökhan", "Öztürk")
    val triple = Triple("Gökhan", 645, 15)
    val xtriple = triple.third


}


class Media


// cumartesi collections