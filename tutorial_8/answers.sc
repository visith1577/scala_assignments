object Answer {

    // Question 1
    def calculateInterest(deposit: Double): Double = {
        val interestRate = deposit match {
            case amount if amount <= 20000 => 0.02 
            case amount if amount <= 200000 => 0.04
            case amount if amount <= 2000000 => 0.035 
            case _ => 0.065 
        }

        val interestAmount = deposit * interestRate
        interestAmount
    }


    // Question 2
    def matchInput(input: Int): Unit = {
        input match {
            case x if x < 0 => println("input is negetive")
            case x if x % 2 == 0 => println("Even number is given")
            case x if x == 0 => println("Input is zero")
            case _ => println("Odd Number is given")
        }
    }


    // Question 3
    def toUpper(str: String): String = str.toUpperCase
    
    def toLower(str: String): String = str.toLowerCase

    def formatNames(name: String) (formatFn: String => String) : String = formatFn(name)

    def main(args: Array[String]) : Unit = {
        val depositAmount = 250000 
        val interest = calculateInterest(depositAmount)
        println(s"Interest earned: Rs. $interest")

        
        val input = scala.io.StdIn.readLine("Enter number: ").toInt
        matchInput(input)

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