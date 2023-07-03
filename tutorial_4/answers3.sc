object Answers {

    def toUpper(str: String): String = str.toUpperCase
    
    def toLower(str: String): String = str.toLowerCase

    def formatNames(name: String) (formatFn: String => String) : String = formatFn(name)

    def main(args: Array[String]) : Unit = {

        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        for (name <- names) {
            val upperCaseName = formatNames(name)(toUpper)
            val lowerCaseName = formatNames(name)(toLower)
            println(s"Original name: $name")
            println(s"Uppercase name: $upperCaseName")
            println(s"Lowercase name: $lowerCaseName")
            println("------------")
        }
    }
}