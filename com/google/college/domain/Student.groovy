package com.google.college.domain

class Student extends CollegeUser {
  Integer roll
  Float marks

  // method overriding
  // valid method override requires the signature of the method to be the same
  def getDetails() {
    def part1 = super.getDetails()
    def part2 = "\nRoll : ${this.roll}"

    part1 + part2
  }

  // even inspite of above, we stil get the Map constructor
}
