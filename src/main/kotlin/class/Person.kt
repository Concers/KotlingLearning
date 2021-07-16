package `class`

class Person {
}

fun main(args: Array<String>) {
    // implecit bir şekilde boş bir constructora sahip
    // her class Any classını almaktadır.
    // defualt construtorc implecit olarak yazılır.
    // Bir classtan miras alırsa en tepedeki class Any'den miras alıyor
    // javadaki object kavramına karşılık gelecektir.
    val person = Person()
}