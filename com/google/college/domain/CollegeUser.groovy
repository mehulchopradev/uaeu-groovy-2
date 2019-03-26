package com.google.college.domain

class CollegeUser {
  String name
  Character gender

  def getDetails() {
    // "this" is the current object
    "Name: ${this.name}\nGender: ${this.gender}"
  }

  // overriden method
  String toString() {
    this.getDetails()
  }
}
