/**
daha okunaklı kodlar yazıyoruz
infix keywordu ile başlamalı
fonsiyon bir üye fonsiyon olmalıdır. yada extension olmalı
sadece bir parametre olmalıdır. Vararag kullanamazsınız.
infix medhod parametresi defualt değer alamaz.

ilk paramatre infix method ikinciparamaetre
class fonskyion olacak  veya extension
defualt değer alamıyor
tek bir değer alabiliyor.
infix keyword ile başlıyor.

 **/

fun main() {

    val isStudent = false
    val isMale = true
    val number = 4

    val whatever = println(isStudent and isMale)

    // matematiksel operatorlerin type conversion range kullanım
    // infix methodlarına karşı işlem önceliği vard.


    // infix fun. mantik operatölerine göre önceliği vardır
    if (number == 3 && number < 5) {
        println(true)
    } else {
        println(false)
    }


}

class InfixFuction {


    private infix fun downloadImage(imageUrl: String) {

    }
}

