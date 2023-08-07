object Answer {
    def filterEven(numbers: List[Int]) : List[Int] = numbers.filter(num =>  num % 2 == 0)

    def calcSquare(numbers: List[Int]) : List[Int] = numbers.map(num => num * num)


    def isPrime(num: Int) : Boolean = {
        if (num <= 1) {
            false
        } else {
            var i = 2
            while (i*i <= num) {
                if (num%i == 0) {
                    return false
                }
                i += 1
            }
            true
        }
    }

    def filterPrime(numbers: List[Int]) : List[Int] = numbers.filter(num => isPrime(num))

    def main(args: Array[String]) : Unit = {
        val numlist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val evenList = filterEven(numlist)
        println(evenList)

        val squares = calcSquare(numlist)
        println(squares)

        val primeList = filterPrime(numlist)
        println(primeList)
    }
}