println 'Program starts'

def i = 'nine'

// handled the exception
try {
  def ii = i as Integer
  if (ii % 2) {
    println 'Odd'
  } else {
    println 'Even'
  }
} catch (NumberFormatException e) {
  println e
  // e.printStackTrace()
}

println 'Program ends'
