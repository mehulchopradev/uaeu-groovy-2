def fullName = 'mehul chopra'

String.metaClass.pipefy = {sep = '|' ->
  // println delegate // similar to it, this
  def result = ''
  for (ch in delegate) {
    result += ch + sep
  }

  result
}

// capability to define a user defined function in an existing builtin class
println fullName.pipefy()
println 'hello world'.pipefy(',')
