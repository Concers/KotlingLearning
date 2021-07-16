package `class`

class YoutubeDownlader(private val youtubeLink : String, val format : String) {

    init {
        download()
    }

    private val fileDirectory = ""
    private fun download(){
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        youtubeLink
        //file.convertToBlaBlac("format")

       // fileDirectory = file.directory
    }
    fun getFileDirectory() = fileDirectory
}

fun main() {
    val youtubeDownlader = YoutubeDownlader("link", "mp4")
    youtubeDownlader.getFileDirectory()
    youtubeDownlader.format
}

// saklamak istediğimiz verileri private
// ulaşmak istediklerimizi public yaptığımızda public.




// backing field kavramına
// kotlinde encapsulation default olarak yapılıyor diyebilir 