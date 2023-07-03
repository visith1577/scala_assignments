object Answers {

    def main(args: Array[String]) : Unit = {
        val input = scala.io.StdIn.readLine("Enter number: ").toInt

        input match {
            case x if x <= 0 => println("Negative/Zero is input")
            case x if x % 2 == 0 => println("Input is Even")
            case _ => println("Input is Odd")
        }
    }
}