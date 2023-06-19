object Assignment2 {

    // Question 3
    def amtEarnedFromNormalhrs(hrs: Int): Double = 250*hrs  
    def amtEarnedFromOT(hrs: Int): Double = 85*hrs  
    def totalSalaryEarned(): Double = amtEarnedFromNormalhrs(40) + amtEarnedFromOT(30)
    def totalSalaryTakenHome(): Double = totalSalaryEarned() - totalSalaryEarned()*0.12

    // Question 4
    def calculateProfit(ticketPrice: BigDecimal): BigDecimal = {
        val baseAttendees: Int = 120
        val attendanceIncrease: Int = 20
        val performanceCost: BigDecimal = 500.0
        val attendeeCost: BigDecimal = 3.0

        val totalAttendees = baseAttendees + ((15 - ticketPrice) / 5.0)* attendanceIncrease
        val revenue = totalAttendees*ticketPrice 
        val profit = revenue - performanceCost - attendeeCost*totalAttendees

        profit  
    }

    def main(args: Array[String]): Unit = {
        val amt: Double = totalSalaryTakenHome() 
        println(s"The take-home salary is Rs. $amt")

        val price = Range.BigDecimal(5.0, 40.0, 0.1)
        val profits = price.map(price => (price, calculateProfit(price)))
        val bestPrice = profits.maxBy(_._2)._1
        println(s"The best price for a ticket is Rs. $bestPrice")
    } 
}