case class Rational(numerator: Int, denominator: Int) {
    require(denominator != 0, "denominator must not be zero")

    def neg: Rational = {
        Rational(-numerator, denominator)
    }

    def sub(r: Rational): Rational = {
        Rational(
            numerator*r.denominator - r.numerator*denominator,
            denominator*r.denominator
        )
    }

    override def toString: String = {
        s"$numerator/$denominator"
    }
}

object Main extends App {

  val x = Rational(3, 4)
  val y = Rational(5, 8) 
  val z = Rational(2, 7)

  val result = x.sub(y).sub(z)

  println(x.neg)
  println(result) 

}