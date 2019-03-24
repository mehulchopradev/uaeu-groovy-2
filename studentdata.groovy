def name = 'mehul'
def gender = 'm'
def roll = 10
def marks = 90

def getDetails(name, gender, roll) {
  // string interpolation. Single string with dynamic variable or groovy expression substitution
  // no + operator for concatenation
  "Name: ${name}\nGender: ${gender}\nRoll: ${roll}" // GString
}

def r = getDetails name, gender, roll
println r
