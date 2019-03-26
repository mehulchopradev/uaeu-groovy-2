import com.google.college.domain.Student
def slist1 = new StudentList(students: [
    new Student(name: 'mehul', roll: 10, gender: 'm', marks: 90),
    new Student(name: 'jane', roll: 13, gender: 'f', marks: 80),
    new Student(name: 'jill', roll: 11, gender: 'f', marks: 95),
  ])

def slist2 = new StudentList(students: [
    new UaeStudent(studentName: 'xyz', rollNo: 45, gender: 'm', marks: 90),
    new UaeStudent(studentName: 'mno', rollNo: 23, gender: 'f', marks: 87)
  ])

println slist1.findByRoll(13)
println slist2.findByRollNo(34)

println slist1.findByName('mehul')
println slist2.findByStudentName('xyz')
