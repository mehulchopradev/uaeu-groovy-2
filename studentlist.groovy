import com.google.college.domain.Student
// import com.google.college.domain.*
// import com.* // import all classes there in com folder only. No subpackages will be imported

def studentList = [
  new Student('mehul', 'm' as Character, 10, 90),
  new Student('jane', 'f' as Character, 11, 45),
  new Student('mark', 'm' as Character, 4, 80)
]

def smap = [
  10: studentList[0],
  11: studentList[1],
  4: studentList[2]
]

def roll = 11

// search now using a map
if (roll in smap) {
  def student = smap[roll]
  println student.getDetails()
} else {
  println "Not found"
}

// search in a list
/* def found = studentList.find {
  it.roll == roll
}
if (found) {
  println found.getDetails()
} else {
  println "Not found"
} */
