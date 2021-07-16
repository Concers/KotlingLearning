package `class`

/**
 *
 * Kullanım sebebi classları gruplaya bilmek içindir.
 * Enumlar tek bir instance
 * kısıtlanmış hiyeraşı kurmanı sağlar.
 *
 * birden fazla nesnesine erişebiliriz.
 * instance özelinde veri taşıma saklama yapılıyor.
 *
 * enumlarda veri taşınabiliyor. Veri özelinde alt grubuna ait alıyoruz.
 *
 *
 * Sealed classları gruplar birden fazla instance sahip olabilirler
 * Enumlar value gruplar static instance sadece...
 */


/**
 *
 * Sınırlı küme de gruplanabilir class'lar yazmayı sağlar.
 * Kısıtlanmış bir class hiyarişi kurabilmemizi sağlar
 *
 * Arka planda static olarak tutulmazlar. Enumartionlardan en büyük farkı budur.
 * Enum'lar verileri gruplarken , Sealed Clasllar classları gruplar..
 *
 *
 * Sealed Classlar aynı zamanda  Abstract class'tır. Abstract oldukları  için open olmazlar.
 * Sealed class'lar Abstract class oldukları için final olamazlar. Anlamsal oalrak zaten saçmadır.
 *
 *
 *
 *
 * Sealed classların nesnesi oluşturulamaz. Constructor'ında  private ve proctected  olduğu için nesnesi oluşturulamaz.
 *
 * Seadled Class'n subclass'ın neler olduğu compiletime'da bilinmektedir.
 *
 * Seadled classları extends alan subclasslar eskiden aynı dosya üzerinde bulunmaya zorunluluğu vardı
 * Bu zorunluluk esnetletirek aynı package içerisinde olmaya kadar genişletildi.
 * Ancak aynı package disina çıkp , bir sub- classa seadled classa miras olarak vermek isterseniz buna izin verilmiyor.
 *Sealed classlar miras alan subClass'lar final oldukları için miras alınamaz. SDK'ler için önemlidir
 *
 * Sealed classlar içine object tanımlamaları da yapılabilir
 * Sealed classlarda içeriisnde sadece object tanımı yapıyorsanız. Bu kullanımın teknik olarak enumdan hiç bir farkı yoktur
 *
 *  */


sealed class Response

class Success : Response()
class Error : Response()

fun handle(response: Response) {
    when (response) {
        is Success -> {
            // response'dan gelen bilgilerle ui'sini doldur
        }
        is Error -> {
            // pop-uğ ile kullanacıya bilgi ver.
        }
        /// else case yok subclassların neler olduğu compiletime'da bilinmektedir.
    }
}

// bu yanlıştır. Enum kullanmanmız gerekir.
sealed class PaymentOption{
    object Cash
    object Card
    object Tansfer
}
enum class PaymentOption2{
    CASH,CARD,TRANSFER
}


fun main(args: Array<String>) {
    //  val response = Response()  abstract olduğu için nesnesi oluşturulmuyor.
    val error = Error()
}


class A0 {
    companion object {
        const val name = "Uğur"
        val surName = "Erol"
    }
}


/**
 *
 * İş Görüşme
 *
 * * Sealed classları gruplar birden fazla instance sahip olabilirler
 * Enumlar value gruplar static instance sadece...
 *
 * compiletime 'da when subclasslarda bilindiği için else yazılmaz.
 *
 *
 * const ile val var nedir ?
 * -> const val compileTime da değişkenler tanımlanıyor . Val . Runtime üzerinde yazılıyor.
 *
 */