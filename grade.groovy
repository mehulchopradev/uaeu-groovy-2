def marks = 56

// you can switch on almost any data in groovy
// case in switch are more flexible as compare to case in java

// 70..100 - 70 to 100
// 70..<100 - 70 to 99
switch(marks) {
  case 70..100: println 'A'
    break
  case 60..69: println 'B'
    break
  case 40..59: println 'C'
    break
  case 0..39: println 'F'
    break
  default: println 'I'
}
