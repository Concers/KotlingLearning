package `class`


/**
Interface vs abstract en büyük fark interface state tutamıyor.
 */

/**
 * Bir class abstract ise interface implement edildikten sonra bu interface in fonksiyonlarını
 * override etmek zorunda kalmıyor
 * bir intercafe içerisidne body'si olanlar override etmek zorunda değilir.
 * Body'si olmayanlar fonksiyonlar classlar implement edildiğinde override edilmek zorunda
 * Property field de interfacelerde tanımalama yapabilir.
 * get ve seti tanımlamıyoruz ki
 * Propertylerden değer ataması yapılmamaış olanlar zorunlu olarak override edilir.
 * eger propery initial değeri aldıysa ,override etme zorunluluğu ortadan kalkar.
 * Interface içerisine tanımlı olan override edilme zorunluluğu olan propertyler(field)
 * primary constroctur içerisinde de  override edebilir.
 * Body'si olan (override olan edilme zorunluluğu olmayan ) fonksiyon override edilirse,
 * override edilen yerde body'si içerisinden super'i çağırabilirsin.// çağırmak zorunda değiliz.
 */

interface MyInterface {

    /**
     *  interface içerisindeki initial değeri olmayın bir property ya da bodysi olmayan yapılar
     *
     *  abstract olarakta tanımlanabilir.
     *
     */
    val prop: Int // abstract

    // property tutuyoruz.
    val propertyWithImplementation: String
        get() = "Foo"

    fun foo() {

    }

    var prop2: Int
}

class Child(
    override val prop: Int,
    override var prop2: Int
) : MyInterface {

    // override edilmesi zorunlu değildi.
    override val propertyWithImplementation: String
        get() = "Implement Property"


}

/**
Interface implement edilir. Abstract miras edilir.
Interface başka interface miras olarak verilebilir.
Interfacelere tanımlanan propertleryde(field javadaki field değil) initial değer alma zorunluluğu yoktur.
 */

interface Named {
    val fullName: String?
}

interface Person2 : Named {
    val firstName: String
    val lastName: String
    override val fullName: String?
        get() = "$firstName  $lastName"

}

/*
Eğer implement edilen interface , başka bir interface'i implent ediyorsa
ve bu interface'in üyeleri child interface override edilmiş ise,
Child interface'i implement eden class'a , bu propertynin override edilme zorunluluğu kalkıyor.
 */

class Employee(
    override val firstName: String,
    override val lastName: String,
    override val fullName: String?, // zorunluluğu yoktur.
    val position: Int
) : Person2

class C : A {
    override fun bar(s: String) {
        println("Bar")
    }

}

open class E

/**
 *
 * birden fazla interface class'a tanımlayabiliyoruz.
 * birden fazla interface bir class'a tanımlanırken aralarına virgül koyuluyor.
 * : işaretinde yapılarının hangilerinin class inheritance
 * hangilerinin interface implamentation olduğunu karıştırmamak için bu yapıların sonuna bakmamız gerekir.
 * sonunda constructor parantezleri görüyorsak : dan sonra yapı classtır (inhertiance) miras alma işlemi yapılıyordur
 * () yoksa  interfacedir. implement  işlemi yapılıyordur.
 */
class F : E(), B

/**
 * 2 farklı interface aynı fonksiyonların olması durumunda override edilmesi sırasında aynı fonksoynu iki kere
 * yazarak override edemeyiz.
 *
 * Eğer implement ettiğimiz interfacelerin aynı isimde fonksiyonları bulunuyorsa , tek bir fonksiyon işlemi yapılır.
 * Bunun içerisinden hangisinin body'sine erişmek istiyorsak o interface ismini <> işaretleri arasına yazmamız gerkeiyor.
 * super olabilmesi için body olması gerekiyor.
 */
class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
        TODO("Not yet implemented")
    }


    override fun bar(s: String) {
        // super<A>.bar interface bar fonksiyonun bodysi yok. Dolayısıyla super erişelebmez.

        super.bar() // B arayüzüne yazmak zorunda kalmıyorsanız. Buna reduntant uyarısı verilir.
        super.bar()  // böyle çağrıbilirsin.
    }

}

interface A {
    fun foo() {
        println("A")

    }

    fun bar(s: String)


}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("Bar")
    }
}


/*
Uyuz teknik sorusu
Override edilme zorunluluğu kalkıyor
initial değer alıyorsa
interafe interface implement ediliyorsa üye fonk. alt interface
override ediliyorsa Child interface'de zorunluluk yoktur.
 */

interface firstInterface{
    fun foo()
    fun bar(){
        // optional body
        var a : Int
    }
}

fun main(args: Array<String>) {


}

/**
 *
 * Interface anlamı gerğei final yapamazsınız open yapması da gereksizdir Ide tarafından  redundant uyarısı
 *
 * open // extend edilmesi için gereklidir..
 */


/**
 *
 * Interface == Function
 * Action hepsi birer higherorder function
 *
 */

