data class Grade(
    val letter: Char, val points: Double, val credits:
    Double
)

open class Person(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

open class Student(
    firstName: String, lastName: String,
    var grades: MutableList<Grade> = mutableListOf<Grade>()
) : Person(firstName, lastName) {
    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

open class StudentAthlete(firstName: String, lastName: String) :
    Student(firstName, lastName) {
    val failedClasses = mutableListOf<Grade>()
    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)
        if (grade.letter == 'F') {
            failedClasses.add(grade)
        }
    }

    val isEligible: Boolean
        get() = failedClasses.size < 3
}

class StudentBaseballPlayer(
    firstName: String,
    lastName: String,
    var position: String,
    var number: Int,
    var battingAverag: Double
) :
    StudentAthlete(firstName, lastName) {

}
// advantage: -> code duplication is reduced, 
// disadvantages: -> tightly coupled, compilation time increased

