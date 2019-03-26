class StudentList {
  List students

  def methodMissing(String missingMethodName, args) {
    // println missingMethodName
    // println args
    def property = missingMethodName[6..missingMethodName.size()-1]
    def rightProperty = property[0].toLowerCase() + property[1..property.size()-1]
    students.find {
      it[rightProperty] == args[0]
    }
  }
}
