package `class`

/**
 *
 * Singleton pattern yapısı sorulacak..
 *
 *
 *
 *
 * anti pattern - her şeyi singleton yaparsak memory silinemiyecek anti patern olarak döner
 *
 *
 * 1. amaç bir class var instance var bir çok ekranda ihtiyaç var. Ödeme fatura filtre ürün falan...
 * İstek atabilmek için instance ihtiyaç var.  Singleton yapısı olmaz ise sürekli olarak istek atılır.
 * Progress dönüşü instance oluşturuyor demek ...
 *
 * Uygulama içinde fazla zaman geçiriliyorsa , sürekli ekran arası geçişler olacak istek atılırken
 * memoryda instance oluşturur.
 *
 *
 * Bir class bir çok yerde ihtiyacımız varsa Singleton yapmamız gerekir.
 *
 *
 * İçerisindeki değişkeni birden fazla değeri  başka bir yerde daha kullanmak istiyorsak singleton kullanacaksın.
 *
 *
 *
 *
 * Bir classın  ihtiyaç duyacağı şey constructor ile kısıtlama yapılır..
 * Instance yaratılmak için ihtiyaç duyacağı şey..
 *
 *
 * Bir classın değişkenine ya da fonksiyonuna
 *
 * Singleton yapısı
 * defualt constractor private yap başka bir constuctor yazmamız gerekiyor.
 * Bu classın instance nesnesini içeride oluştururken  içeriden nesneyi null kontrolü oluşturup boşsa
 * değer doluysa o bilgiyi geri döner.
 *
 *
 * private static profile newinstance
 * private profile
 *  synchorized  static public profile newinstance (içinde if newinstance == null  nullsa ilkkez değer oluştur else -> return newinstance  )
 *
 *
 *
 *  volitile vs synchorized ...
 *
 *
 */


/**
 *
 * Thread safe
 *
 */

object ProfileName {
    var nickName: String? = null

}




fun main(args: Array<String>) {
    ProfileName.nickName = "Hello"
    println(ProfileName.nickName)
    println("-----------------")
    ProfileName.nickName = "World"
    println(ProfileName.nickName)
    ProfileName.nickName


}
