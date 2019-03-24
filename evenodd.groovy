def n = 7

/* if (n % 2) { // groovy truthy
  println "It is odd"
} else {
  println "It is even"
} */

// ternary operator
def result = (n % 2) ? "It is odd" : "It is even"
println result

// elvis operator
def username = 'mehul25'
def greeting = username ?: 'Guest'
println greeting
