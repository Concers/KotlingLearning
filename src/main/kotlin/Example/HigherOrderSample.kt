fun main(args: Array<String>) {
    val readline = readLine()?.toInt()
    if (readline != null) {
        readline
        floorButtonClick(readline) {
            println("Test")
        }
    }
}

fun floorButtonClick(floorButtonNumber: Int, floor: (floorNumber: Int) -> Unit) {
    println("$floorButtonNumber ChooseFloor")
    ringRing(floorButtonNumber) {
        chooseFloorNumber(true) {}
        floor(floorButtonNumber)
        waitingOpenDoor(floorButtonNumber)
        opentoWorld(floorButtonNumber) //
    }
}

fun opentoWorld(floorNumber: Int) {
    println("Door is open you should go $floorNumber. floor ")
}

fun waitingOpenDoor(floorNumber: Int) {
    println("$floorNumber waiting for the door to open")
    openDoor(floorNumber)
}

fun openDoor(door: Int) {
    println("$door door opened")
}

fun ringRing(floorNumber: Int, function: (Int) -> Unit) {
    println("$floorNumber Floor Ring ring")
    function(floorNumber)
}

fun chooseFloorNumber(isClick: Boolean = false, floorNumberClick: () -> Unit) {
    if (isClick) {
        floorNumberClick
    } else {
        println("don't floor number")
    }
}
//
//1..9 arasında numara seç
//        ... nolu zill basıldı
//        .. nolu zil çalıyor. Kapıyı açması bekleniyor
//        .. kapıyı aç butonuna basıldı
//        kapı açılıyor
//        Hoşgeldiniz
//