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

    def sumList(list: List[Int]): Int = {
        list match {
            case Nil => 0
            case head :: tail => head + sumList(tail)
        }
    }


    def sumOfEven(n: Int): Int = {
        val evenList = (0 until n).filter(isEven).toList
        sumList(evenList)
    }

    def main(args: Array[String]): Unit = {
        println(sumOfEven(10))
    }
}