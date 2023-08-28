object answer {

    // Question 1
    def calculateAverage(temperature: List[Double]) : Double = temperature.map(temp => (temp * 9/5) + 32.0).reduce(_+_) / temperature.length

    // Question 2
    def countLetterOccurences(words: List[String]) : Int = words.map(_.length).reduce(_ + _)

    // main function
    def main(args: Array[String]): Unit = {

        // Question 1
        val temps = List(0.0, 10.0, 20.0, 30.0)
        val average = calculateAverage(temps)

        println(s"Input: ${temps}")
        println(s"Output: Average Fahrenheit temperature: $average")

        // Question 2
        val words = List("apple", "banana", "cherry", "date")
        val wordCount = countLetterOccurences(words)

        println(s"Input: ${words}")
        println(s"Total count of letter occurrences: $wordCount")
    }
}