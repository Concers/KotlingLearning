package `class`


// bir func. varken class'ın final olması sacma bir kullanım olacaktır. open func bir esprisi kalmaz' //
open class Shape (val name: String) {

    var mColor: String = ""
    var medgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        medgeCount = edgeCount
    }


    // bodysiz bir fun yazıyorsak abstract yazmamız gerekiyor.
    open fun drawShape() {
        println("Name $name")
        println("Color : $mColor")
        println("EdgeCount : $medgeCount")
    }
}




// defualt olarak vermek gerekiyor. yada Dışarıdan alıp vermek gerekiyor
class Rectangle(name: String) : Shape(name)

class Circle(name: String, color: String) : Shape(name, color) {

    // Üst classı kullanıcam ama yine değiştirmek istiyorum dersen
    // super.drawshape çağırıyorum.
    // Yani ilk super çalıştır sonra func devam et.

    override fun drawShape() {

        super.drawShape()
        val circle = """
                    .....
        _d^^^^^^^^^b_
     .d''           ``b.
   .p'     Objects     `q.
  .d'   in mirror may   `b.
 .d'   be less virtual   `b.
 ::   than they appear.   ::
 ::  ...................  ::
 ::                       ::
 `p.  johnca@netcom.com  .q'
  `p.   John Abbe aka   .q'
   `b.     Rademir     .d'
     `q..          ..p'
        ^q........p^
            ''''

        
    """.trimIndent()

        println(circle)

    }


}

open class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {

    //final yapma durumunda override edilemez.
    // dedesini soy ismini erişemez.

    override fun drawShape() {

        super.drawShape()
        val square = """
           ************
           **        **
           **        **
           **        **
           ************
       """

        println(square)
    }
}


class OneMeteterSquare : Square("OneMeterSquare","Blue",4){
    override fun drawShape() {
        super.drawShape()
    }

    /* ust class'taki drawShape final olursa alt classda bu fun override edilemez
    // o'dan yazılması gerekiyor.
    fun drawShape(){

    }

     */
}

fun main(args: Array<String>) {
//    val shape = Shape("Shape")
//    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Magenta")
    val square = Square("Square", "Cyan", 4)

//    shape.drawShape()
//    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()

}