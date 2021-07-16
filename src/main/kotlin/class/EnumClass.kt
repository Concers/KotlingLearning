package `class`

/**
 *
 * best practice olarak enum classlar büyük harfle yazılıyor
 * değerler arasına , koyarak en sonda body parantez sonuna noktalı virgül konuyor.
 *
 *Tip güvenliğini de sağlar type-safety
 *
 * kendi yapısı gereği finaldır.
 * abstract , sealed, open, inner, olamazlar yapısı gereği finallardır.
 * Redundant uyarısı verir
 *
 * özünde class oldukları için constructor kullanabilirler.
 *
 *
 *
 *Javada Static classlarda direk . ile erişebilir.
 * Bir Object oluşturmadan o yüzden direk erişebiliyoruz.
 *
 * gruoplayabildiğimiz verilere enum
 * constructorlarına veri girişi yapabiliriz.
 * tek bir yerden yönetebiliriz.
 * enum classların sabitleri static final class şeklinde tutular. Kullanırken
 * nesnesini oluşturmajk zorunda kalmayız.
 *
 *
 * Her enum sabiti name:String  ve ordinal:Int değişkenlere default olarak sabittir.
 * name ifadesi enum'ın kendisinin string halini verir.
 * ordinal ifadesinin. enumdaki sabitinin indeksini verir.
 * bu değişkenler final oldukları için, enum sabitleri içerisinde override edilemezler.
 *
 * Enum class'larının nesnesi oluşturulamaz.
 * constructları private olduğu için.
 *
 * enum class başka bir herhangi classı miras (inherat) edemez.
 * enum classlar herhangi bir interface implent edelebilirler .
 *
 *
 * enum classlar abstract propertyler abstractlar fonc. alabilirler.
 * Bunlara aldıklarında tüm sabitler bu abstract yapıları override etmek zorundadır.
 *
 * bir open func. da yazılabilir. Open olmasından dolayı override etme zorunluluğu yoktur.
 * Ancak open olarak belirtilen fonksiyonun body'si olmak zorundadır.
 *
 *
 * compiletime'da bilinmediği için when  else case yazılır.
 *
 */

enum class DAYS {
    SUNDAY, MONDAY, TUESDAY, WEDNASDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * primary constructor kısmına val var tanımlarsam
 * starCount erişebilirim.
 */


interface TeamsFuctionalty {
    fun practise() {

    }
}

enum class Teams(val starCount: Int) : TeamsFuctionalty {
    FENERBAHÇE(3),
    GALATASARAY(4),
    BEŞİKTAŞ(3),
    TRABZONSPOR(2)
}

enum class DaysOfWeek(val dayNumber: Int) {
    Pazartesi(1) {
        override fun toString(): String {
            return "PAZARTESİ"
        }
    },
    Sali(2) {
        override fun toString(): String {
            return "SALI"
        }
    },
    Carsamba(3) {
        override fun toString(): String {
            return "ÇARŞAMBA"
        }
    },
    Persembe(4) {
        override fun toString(): String {
            return "PERŞEMBE"
        }
    },
    Cuma(5) {
        override fun toString(): String {
            return "CUMA"
        }
    },
    Cumartesi(6) {
        override fun toString(): String {
            return "CUMARTESİ"
        }
    },
    Pazar(7) {
        override fun toString(): String {
            return "Pazar.toString().toUpperCase()"
        }
    }
}

fun main(args: Array<String>) {
    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf("WEDNASDAY")}")
    val dayList = DAYS.values()
    println(dayList.size - 1)
    println(DaysOfWeek.Pazar.dayNumber)
    println(DaysOfWeek.Pazar.toString())
    println(DaysOfWeek.Pazar.ordinal)
    println(DaysOfWeek.Pazar.name)
    /**
     *
     * Örnekler gökhandan
     */

    val fb = "Fenerbahçe"
    val gs = "GALATASARAY"
    val bjk = "BEŞİKTAŞ"
    val ts = "TRABZONSPOR"

    val team: String = readLine()!!
    if (team == fb) {
        println("asdasdas")
    } else if (team == bjk) {
        println("asdasdas")
    } else if (team == gs) {
        println("asdasdas")
    } else if (team == ts) {
        println("asdasdas")
    }

    val startcount = when (team) {
        Teams.FENERBAHÇE.toString() -> {
            3
        }
        Teams.BEŞİKTAŞ.toString() -> {
            2
        }
        Teams.GALATASARAY.toString() -> {
            3
        }
        Teams.TRABZONSPOR.toString() -> {
            4
        }
        else -> {
            -1
        }
    }


}

/**
 *
 * İş Görüşme
 *
 * * Sealed classları gruplar birden fazla instance sahip olabilirler
 * Enumlar value gruplar static instance sadece...
 */

