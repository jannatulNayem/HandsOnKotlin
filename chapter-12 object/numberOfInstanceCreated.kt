data class Student private constructor(val id: Int, val firstName: String,
val lastName: String) {
    var fullName = "$lastName, $firstName"
    companion object{
        var numberOfStudents = 0
        fun createStudent(id:Int, firstName: String, lastName:
        String):Student{
            val student = Student(id, firstName, lastName)
            numberOfStudents += 1
            return student
        }
    }
}

fun main() {
    val ruhan = Student.createStudent(1, "Ruhan", "Molla")
    println(Student.numberOfStudents)

    val rayhan = Student.createStudent(2, "Ashraful", "Alam")
    println(Student.numberOfStudents)
}