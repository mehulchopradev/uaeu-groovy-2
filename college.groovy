import com.google.college.domain.Student
import com.google.college.domain.Professor
import com.google.college.domain.CollegeUser

// def c = new CollegeUser(name: 'mehul', gender: 'm')

/* def s = new Student('mehul', 'm' as Character, 10, 90)
def p = new Professor('rock', 'm', ['Physics', 'Maths'])

println s.getDetails()
println p.getDetails()
 */

def name = 'mehul chopra'
println name // 'mehul chopra'

def s = new Student(name: 'mehul', gender: 'm', roll: 10, marks: 90)
println s // println (s.toString())
// println s.getDetails()

def p = new Professor(name: 'rock', gender: 'm', subjects:['Physics', 'Maths'])
println p
// println p.getDetails()
