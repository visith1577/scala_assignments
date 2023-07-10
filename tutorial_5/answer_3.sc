object Answer {

    def sum(n : Int) : Int = if (n <= 0) 0 else n + sum(n-1)

    def main(args : Array[String]) : Unit = {
        val input = scala.io.StdIn.readLine("Enter Number: ").toInt
        println(sum(input))
    }
}