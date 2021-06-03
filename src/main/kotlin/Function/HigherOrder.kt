// fonksiyonlar kotlin'de 'First Class Citizen '

fun main() {
    // Yapısal Olarak
    // parametre kısmına bak..
    // Tip belirtim yerine parametre parantezleri lamda işlerine dönüş değeri
    fun foo(higherOrderFunction: (Message: String) -> Unit) {
        higherOrderFunction("Kekod_")
    }

    fun normalfoo(boo: String) {

    }

    // Çağrılırken fonksiyon içinde fonksiyon çağırır gibi çağırır

    foo { message ->
        println("Message : $message")
    }


    val highOrderFunction = { surName: String ->
        "Surname : $surName"

    }
    // isimsiz kullanıma
    val anonymus = fun(surName: String): String {
        return "Surname $surName"
    }

    val anonymousFunction2 = fun(surName: String): String = "Surname : $surName"

    val news = News()
    news.read(::println)
    news.read { println("Test") }

}

class News {


}

fun News.read(readtitle: (title: String) -> Unit) {
    readtitle("Codemy is Awesome")
}

infix fun News.filterNews(getFilter: (getFilter: String) -> Unit) {
    getFilter
}
