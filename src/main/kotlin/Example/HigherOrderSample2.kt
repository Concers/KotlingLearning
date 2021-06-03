fun main() {

    val totalArea = 200
    val totalPerimeter = 60

    calculate(10, { area ->
        println("Area : $area ")
        val squareCount = totalArea / area
        println("Square Count $squareCount")
    }, {
        println("Perimeter : $it")
        val squareCount = totalPerimeter / it
        println("Square Count $squareCount")
    })


//    calculate(10, areaInfo, { perimeter: Int -> })
//    calculate(10, areaInfo2, { perimeter: Int -> })

}

fun calculate(
    number: Int,
    areaInfo: (area: Int) -> Unit,
    perimeterInfo: (Int) -> Unit
) {
    //area hesaplandıktan sonra bana haber ver.

    val area = number * number
    areaInfo(area)

    val perimeter = number * 4
    perimeterInfo(perimeter)


}

// bina ziline bastığında evin içinde zil çalıyor ya o sistem olabilir
// araba motorunun çalışma mantığı uygun sanki @kekod_
// highOrder motor'un kendisi, lakin kontak tetiklenmeden çalışmıyo