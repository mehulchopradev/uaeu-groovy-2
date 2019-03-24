class Student {
  String name
  Character gender
  Integer roll
  Float marks

  static Integer count = 0

  Student() {
    Student.count += 1
  }

  Student(String name, Character gender, Integer roll, Float marks) {
    // "this" is the current object for which the constructor is called
    this.name = name
    this.gender = gender
    this.roll = roll
    this.marks = marks

    Student.count +=1
  }

  def getDetails() {
    // "this" is the current object
    "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}"
  }

  static def getStudentCount() {
    // a static function does not have "this"
    Student.count
  }
}
