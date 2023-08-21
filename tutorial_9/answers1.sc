case class Account(id: String, balance: Double) {

  def deposit(amount: Double): Account = {
    this.copy(balance = this.balance + amount)
  }

  def withdraw(amount: Double): Account = {
    this.copy(balance = this.balance - amount)    
  }

  def transfer(amount: Double, to: Account): (Account, Account) = {
    val from = this.withdraw(amount)
    val toUpdated = to.deposit(amount)
    (from, toUpdated)
  }
}

class Bank(accounts: List[Account]) {

  def negativeBalances: List[Account] = accounts.filter(_.balance < 0)

  def sumOfBalances: Double = accounts.map(_.balance).sum

  def applyInterest(): List[Account] = {
    accounts.map { account =>
      val interest = if (account.balance >= 0) 0.05 else 0.1
      account.copy(balance = account.balance * (1 + interest))
    }
  }
}

object Main extends App {

  // Queston 3
  val account1 = Account("1", 1000)
  val account2 = Account("2", 500)

  val (updated1, updated2) = account1.transfer(100, account2)

  println(updated1) 
  println(updated2) 

  // Question 4
  val bank = new Bank(List(
    Account("1", 500),
    Account("2", -200),
    Account("3", 100)  
  ))
  
  println(bank.negativeBalances) 
  
  println(bank.sumOfBalances)
  
  println(bank.applyInterest()) 
}