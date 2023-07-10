object Answer {

    def fib(n: Int): BigInt = n match {
        case 0 => 0
        case 1 => 1
        case _ => fib(n-2) + fib(n-1)
    }

    def fibList(n: Int): Unit = {
        (0 to n).foreach(n => print((fib(n).toString) + " "))
    }


    def main(args: Array[String]): Unit = {
        // print(fib(10))
        fibList(10)
    }
}