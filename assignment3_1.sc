object Assignment3 {

    // Question 1
    def reverseString(s: String): String = {
        if (s.isEmpty){
            " "
        } else {
            reverseString(s.tail) + s.head
        }
    }

    // Question 2
    def stringGreaterThan(strList: List[String]): List[String] = strList.filter(_.length > 5)

    // Question 3
    def meanInFloat(n: Int, m: Int): Float = BigDecimal(((n.toFloat + m.toFloat) / 2)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat


    def main(args: Array[String]) : Unit = {

        // Q1
        var str: String = " "
        println(reverseString(str))

        // Q2
        val inputList = List("apple", "banana", "orange", "watermelon", "kiwi", "grapefruit")
        val filteredList = stringGreaterThan(inputList)
        println(filteredList)

        // Q3
        println(meanInFloat(5, 8))
    }
}