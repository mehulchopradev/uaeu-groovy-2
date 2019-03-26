def nos = [4, 5, 10, 1, 2, 10, 5, 7, 8, 9]

// get a new list, that has only the evens numbers from nos list (filtering)
def evens = nos.findAll {
  !(it % 2)
}
println evens

// get a new list, that has only the odds greater than 5 from nos list (filtering)
def oddsMorethan5 = nos.findAll {
  (it % 2) && (it > 5)
}
println oddsMorethan5

// get a new list, that has 1 mark deducted from all the elements in the nos list (mapping)
def deductedMarks = nos.collect {
  it - 1
}
println deductedMarks

// check whether the list has people who have scored less than 5 pointer
def lessThan5 = nos.any {
  it < 5
}
println lessThan5

// check whether all the people in the list have scored more than 5 pointer or no
def ismoreThan5 = nos.every {
  it > 5
}
println ismoreThan5
