package `class`


/**
 *
 * by lazy method.
 * bir class instance  oluştururken activity fragment custom view kaldrırıken
 * classın üstüne bir sürü değişken oluşmuş olabilir o class ayağı kalkarken kullanılmayacak
 * istek atacak isteğin cevabı geldiğinde kullanılacak
 * min. eforla kalkması gerekir.
 * lazy sonradan değer atamsında bulunuyorsun.
 *
 * lazyde evalute expiression yapıldığında initialize ediyor. Yapılan hatalardan bir tanesi..
 *  evalute edildiğinden sonra yine çağırmıyor..
 *
 *  user erişip isLateinit öyle kullanılıyor.
 */

data class User6(
    val name: String = "Ugur",
    val surName: String = "Erol"
)

class CardDetailFragment {
    private val user: User6 by lazy {
        println("User6")
        User6()
    }

    /**
     *
     * lateinit ile ilk değer ataması yapılmıyor...
     *
     * interface ilk değer ataması yapılmıyor..
     *
     *
     * lateinit var
     * by lazy val {} lambda var
     *
     */
    private lateinit var user2: User6


    lateinit var name: String
    fun printUserInfo() {


        println(" name  ${user.name}  surname ${user.surName}")

        /**
         * this::varible. modifer keywordların kontrolünü yapabiliyoruz.
         *
         */
        if (this::user2.isInitialized) {
            user2 = User6()

        }
//        println(" name  ${user2.name}  surname ${user2.surName}")
    }

}


/**
 *
 * observable mediator livedata vetobile çalışma mekanızmasıyla olur
 *
 */

//interface BalanceChanged {
//    fun onBalanceChanged(changedbalance: Long)
//}

class BankAcount5(
//    val balanceChanged: Int
    inline val balanceChanged: (Long) -> Unit
) {
    var balance: Long = 1_000_000
        set(value) {
            field = value

            if (value <= 100) {
//                balanceChanged.onBalanceChanged(invoke)
                balanceChanged.invoke(value)
            }
        }

}


fun main() {
    val cardDetailFragment = CardDetailFragment()
    cardDetailFragment.printUserInfo()

//    val bankAcount5 = BankAcount5({
//        override fun onBalanceChanged(changedbalance: Long) {
//            sendPushNotification(changedbalance)
//        }
//    })

    val bankAcount5 = BankAcount5(::sendPushNotification)
    println("Balance : ${bankAcount5.balance}")
    bankAcount5.balance = 90

}

fun sendPushNotification(changedbalance: Long) {
    println("Paran Bitiyor : $changedbalance")
    println("Üzülme paraya ihtiyacın varsa , ihtiyacın varsa kredin yanında şimdi başvur.")
}

/**
 *
 * Değişkenin değeri değiştidiğinde intarfece veya higherorder fonksiyonumuz var.
 */