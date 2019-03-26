// closure 1
def adder = {a, b ->
  a + b
}

// currying
// create a new closure from existing by keeping 1 or more arguments fixed!
def addByOne = adder.rcurry(1)
/*
  addByOne = {a, b= 1->
    a + b
  }
*/

println addByOne(4)
println addByOne(5)


def tmpClosure = {a, b, c ->
  println a
  println b
  println c
}

def tmp1 = tmpClosure.curry(3, 1)
tmp1(4)
