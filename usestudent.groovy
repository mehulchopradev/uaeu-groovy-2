println Student.count // access static attribute using the class name
def s1 = new Student('mehul', 'm' as Character, 10, 90)
println s1.getDetails()
/* s1.name = 'mehul'
s1.gender = 'm' as Character
s1.roll = 10
s1.marks = 90 */


def s2 = new Student()

/*println s1.name
println s1.roll
println s1.gender */
println Student.getStudentCount() // static function called using the class name
