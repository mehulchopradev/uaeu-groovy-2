// def a1 = new Account('mehul', 'savings', 10000)

// def a2 = new Account(['name': 'mehul', 'type': 'savings', 'balance': 9000])
// same as below
def a2 = new Account('name': 'mehul', 'type': 'savings', 'balance': 9000)
// the constructor or the function should be taking only one argument i.e Map

// println a1.name
println a2.name
println a2.balance

try {
  println a2.withdraw(8500)
} catch (MinBalNotMaintainedException e) {
  println e
} catch(IllegalArgumentException e) {
  println e
}


def a3 = new Account()
a3.balance = -450 // a3.setBalance(-450)

// println a3.balance // a3.getBalance()
