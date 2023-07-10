object Answer {

    var i : Int = 2

    def gcd(a: Int, b: Int): Int = {
        if (b == 0) a
        else gcd(b, a % b)
    }

    def prime(n: Int): Boolean = {
        if (n <= 1) {
            false
        } else if (n == i) {
            true
        } else if (gcd(n, i) > 1) {
            false
        } else {
            i = i + 1
            prime(n)
        }
    }


    def main(args: Array[String]) : Unit = {
        println(prime(5))  
        println(prime(8))
    }
}