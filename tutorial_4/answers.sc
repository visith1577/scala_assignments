
object Answers {

    def calcInterest(deposit: Double) : Double = {
        val interestRate1 = 0.02;
        val interestRate2 = 0.04;
        val interestRate3 = 0.035;
        val interestRate4 = 0.065

        val interest = 
            if (deposit > 0) {
                if (deposit <= 20000) {
                    deposit * interestRate1;
                } else if (deposit > 20000 && deposit <= 200000) {
                    deposit * interestRate2;
                } else if (deposit > 200000 && deposit <= 2000000) {
                    deposit * interestRate3;
                } else {
                    deposit * interestRate4;
                }
            } else {
                0
            } 

        interest
    }


    def main(args: Array[String]) : Unit = {
        val input = scala.io.StdIn.readLine("Enter deposit amount: ")
        val out = calcInterest(input.toDouble) 

        println(f"Calculated interest is Rs. $out%1.2f")
    }
}