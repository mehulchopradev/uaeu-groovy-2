class Account {
  // groovy bean
  String name
  String type
  Double balance

  def withdraw(Double amt) {
    println "Transaction starts..."

    try {
      if (amt < 0) {
        throw new IllegalArgumentException('Amt to withdraw should be more than 0')
      }

      if (this.balance - amt < 1000) {
        throw new MinBalNotMaintainedException('Bal not getting maintained') // explicitly throw an exception to the caller
      }

      this.balance -= amt
      this.balance
    } finally {
      println "Transaction ends.."
    }
  }

  // redefine setter function which is automatically given in every groovy bean
  // achieve encapsulation of balance attribute
  def setBalance(Double balance) {
    if (balance < 0) {
      this.balance = 0
    } else {
      this.balance = balance
    }
  }

  /* Account(String name, String type, Double balance) {
    this.name = name
    this.type = type
    this.balance = balance
  } */

  /*
  // default constructor
  Account() {

  }
  Account(Map map) {
    this.name = map['name']
    this.type = map['type']
    this.balance = map['balance']
  } */
}
