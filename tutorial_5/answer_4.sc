object Answer {
    def isEven(n: Int): Boolean = {
        if (n == 0) {
            true
        } else if (n == 1){
            false
        } else {
            isEven(n - 2)
        }
    }

    def isOdd(n: Int): Boolean = !isEven(n)

    def main(args: Array[String]): Unit = {
        println(isEven(4))
        println(isOdd(4))
    }
}