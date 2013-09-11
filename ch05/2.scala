class BankAccount {
	private var remainingBalance = 0

	def deposit(money : Int) {
		remainingBalance += money
	}

	def withdraw(money : Int) {
		if (remainingBalance > money) remainingBalance -= money else throw new Exception("balance is not enough")
	}

	def balance = remainingBalance
}

val account = new BankAccount
try {
	account.deposit(1000)
	println(account.balance)
	account.withdraw(400)
	println(account.balance)
	account.withdraw(800)
	println(account.balance)
} catch {
	case e: Exception => println(e.getMessage)
}