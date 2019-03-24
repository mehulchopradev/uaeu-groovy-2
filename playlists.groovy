def pointers = [2, 3, 4, 3, 2, 10, 5, 6, 2, 9, 8]

def forEach(items, action) {
  for(item in items) {
    action(item)
  }
}

// print all the pointers
/* for(pointer in pointers) {
  println pointer
} */

// closure
// a block of code (like a function) that can take arguments and can return a value
// it can passed as an argument, returned from a function, defined inside a function
/* def printItem = {ele ->
  println ele
} */
// forEach(pointers, { println it })
pointers.each {
  println it
}

println '*****************************'

pointers.eachWithIndex {it, index ->
  if (it > 5) {
    println index + ' : ' + it
  }
}


// print only the pointers greater than 5
/* def printMoreThan5 = {
  if (it > 5) { // if a closure takes only one argument, do not explicity define parameter
    // will be available using the 'it'
    println it
  }
} */
/* forEach(pointers, {
  if (it > 5) {
    println it
  }
}) */

/* forEach(pointers) {
  if (it > 5) {
    println it
  }
} */




/* for(pointer in pointers) {
  if (pointer > 5) {
    println pointer
  }
} */
