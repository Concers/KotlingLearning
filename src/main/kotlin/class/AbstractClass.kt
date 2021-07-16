package `class`

/**
 *
 *
 * Kesin olması gereken her şey abstracttır
 * baseactivity basefragment
 * roomdb baseclasslarımızda abstractlarımız var.
 *
 * Child classlar extend olarak bir classa özel spesefik olarak özellik eklemeyi içini yazıyorlar. Bu da Solid O aykırı oluyor.
 * override etme zorunluluğu olan şeylere abstracct var
 * interfaceler ekleniyor çıkarılıyor.
 *
 *
 *
 * Bir override edilmesi mutlaka zorunluluğu olanları abstract olarak yazılması gerkeiyor.
 *
 * ekstra özellikler ise interfaceleri koymak gerekiyor.
 *
 *
 * abstract yapılar extend classın birebir aynısını sağlar.
 * opsiyonel alanalar interface olarak tanımlanır.
 *
 * bir classların şablon oalrak tutmak , child classları override etmek zorunda bırakmak istiyorsak.
 */


// abstract class olarak başında yazılıyor.

interface MCDonaldsService {
    fun motoCarrier()

//    fun sellCoffee(): McCoffee
}


/**
 * Abstract classlar opendır final yazılamaz.
 * extend etmeniz için yazılan abstract classlar final yazmak kekoca o zaman class yaz
 * final ve open modifer'iları kullanmak anlamsızdır ve yanlıştır
 *
 *
 * abstract class yeni eklenen yapılar tüm child classlarda override edilmek zorundadır.
 *  * open val olarak yazdığın bir şey override etme zorunluluğu yok
 *
 * abstract class opsiyonel yapılar varsa , bunları child classların tamamında override etme zorunda olmayalım diye
 * open keywordu ile tanımlayabiliriz.
 *
 *
 *
 * abstract bir class bir abstract class extend ederse override etme zorunluluğu ortadan kalkıyor..
 *
 * eğer abstract bir class , abstract bir class'i miras alır ve abstract yapıları override ederse
 * child classı abstract class'ı miras alan bir düz class üst ablstact classı abstract yapılarını override edemez
 *
 *
 * anlam değiştiriyorsa ve opsiyonal bir şey ekleniyorsa yeni bir abstract class yazılabilir.
 * Carrefuar  -> CarrefuarExpress
 *
 *
 * abstract classın kendi özelliğinin dışını çıkıyorsa abstract class içine yazmayın
 * Ana abstract classı miras alıp yeni abstract class yazmak daha doğru olabilir fakat->
 *
 *
 *
 * abstract classlar aynı zamanda instance'i oluşturlamayan classlar .Bu sebeple singleton gibi patternler içinde kullanaiblir.
 *
 */
abstract class MCDonalds {

    abstract val fridge: Fridge
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList: List<McHamburger>

    abstract fun clean(clock: Int)

    /**
     * opsiyonel
     */
    open val policeOffer: Police = TODO()


}

abstract class McDonaldsExpress : MCDonalds() {

    abstract fun sellCoffee(): McCoffee

    override fun clean(clock: Int) {
        println("Clean time : $clock")
    }


}


class McDonaldsMaltepe : MCDonalds(), MCDonaldsService {
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrier() {
        TODO("Not yet implemented")
    }


}


class McDonaldsKadikoy : MCDonalds(), MCDonaldsService {
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrier() {
        TODO("Not yet implemented")
    }


}

class McDonaldsMaltepeExpress : McDonaldsExpress() {
    override fun sellCoffee(): McCoffee {
        TODO("Not yet implemented")
    }
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }
}


class Fridge
class MenuList
class SuperVisor
class McHamburger
class Police
class McCoffee

/**
 *
 * Anonymous class, inner class, nested class, default method, subsignature of method, lambda. checked,
 * unchecked exceptionlar, errorlar Singleton patternler, Bunlarin haricinde,
 * javanin generic yapisina da baya hakim olmanizi oneririm.
 */


fun main() {
  //   val mcDonalds = McDonalds
}