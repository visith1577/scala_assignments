object Answer {

    var i : Int = 2

    def gcd(a: Int, b: Int): Int = {
        if (b == 0) a
        else gcd(b, a % b)
    }

    def prime(n: Int): Boolean = {
        if (n <= 1) {
            i = 2
            false
        } else if (n == i) {
            i = 2
            true
        } else if (gcd(n, i) > 1) {
            i = 2
            false
        } else {
            i = i + 1
            prime(n)
        }
    }

    def primeSeq(n: Int): Unit = {
        var primeList = (2 until n).filter(prime)
        // println(primeList)
        println(primeList.mkString(" "))        
    }


    def main(args: Array[String]) : Unit = {
        primeSeq(10)
    }
}