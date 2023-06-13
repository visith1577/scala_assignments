// scala activity 1

object Assignment 
{
    // Question 1
    def areaOfDisk(r: Double): Double = {
        val pi = math.Pi
        pi*r*r
    }
    val radius = 5.0
    val area = areaOfDisk(radius)

    // Question 2
    def convertCelsiusToFahrenheit(celcius: Double): Double = {
        (celcius * 1.8) + 32.0
    }
    val celsius = 35.0
    val fahrenheit = convertCelsiusToFahrenheit(celsius)

    // Question 3
    def calculateSphereVolume(radius: Double): Double = {
        val pi = math.Pi
        (4.0 / 3.0) * pi * math.pow(radius, 3)
    }
    val volume = calculateSphereVolume(radius)

    // Question 4
    def calculateWholesaleCost(radius: Double): Double = {
        val coverPrice = 24.95
        val discount = 0.4
        val shippingCostFirst50 = 3.0
        val shippingCostAdditional = 0.75

        val discountedPrice = coverPrice * (1 - discount)
        val shippingCost = if (numCopies <= 50) shippingCostFirst50 else shippingCostFirst50 + (numCopies - 50) * shippingCostAdditional
        val totalCost = discountedPrice * numCopies + shippingCost

        totalCost
    }
    val numCopies = 60
    val totalWholesaleCost = calculateWholesaleCost(numCopies)

    // Question 5
    def calculateRunningTime(easyPace: Double, tempoPace: Double, distances: List[Double]) : Double = {
        val easyPaceTime = easyPace * distances(0)
        val tempoTime = tempoPace * distances(1)
        val totalTime = easyPaceTime + tempoTime + easyPaceTime 

        totalTime
    }
    val easyPace = 8.0 
    val tempoPace = 7.0 
    val distances = List(2.0, 3.0) 
    val totalRunningTime = calculateRunningTime(easyPace, tempoPace, distances)

    def main(args: Array[String]) : Unit = 
    {    
        printf(f"The area of disk is ${area}%2.2f\n")
        println(s"The temperature $celsius°C is equal to $fahrenheit°F")
        printf(f"The volume of a sphere with radius $radius is $volume%2.2f\n")
        printf(f"The total wholesale cost for $numCopies copies is Rs. $totalWholesaleCost%2.2f\n")
        println(s"The total running time is $totalRunningTime minutes")
    }
}