data class Student(val firstName: String, val lastName: String, val
id: Int)
data class Scientist(val firstName: String, val lastName: String,
                     val type: String)

object StudentRegistry{
    val studentList = mutableListOf<Student>()

    fun addStudent(student: Student){
        studentList.add(student)
    }

    fun removeStudent(student: Student){
        studentList.remove(student)
    }

    fun printStudentList(){
        for(student in studentList){
            println(student)
        }
    }
}
object ScientistRegistry{
    val scientistList = mutableListOf<Scientist>()

    fun addScientist(scientist: Scientist){
        scientistList.add(scientist)
    }

    fun removeScientist(scientist: Scientist){
        scientistList.remove(scientist)
    }

    fun printScientistList(){
        for(scientist in scientistList){
            println(scientist)
        }
    }
}

interface Counts {
    fun studentCount(): Int
    fun scientistCount():Int
}

val counter = object : Counts{
    override fun studentCount(): Int {
        return StudentRegistry.studentList.size
    }

    override fun scientistCount(): Int {
        return ScientistRegistry.scientistList.size
    }
}
fun main() {
    val nayem = Student("Nayem", "Khan", 1)
    val makin = Student("Makin", "Ahmed", 2)
    val nayon = Student("Nayon", "Ahmed", 3)
    val nuru = Student(firstName = "Nuru", "Molla", 4)

    StudentRegistry.addStudent(nayem)
    StudentRegistry.addStudent(makin)
    StudentRegistry.addStudent(nayon)
    StudentRegistry.addStudent(nuru)

    // a special scientist
    val william = Scientist("William", "Ankan", "CGPA")
    val habibusSharif = Scientist("Habibus", "Sharif", "I am from " +
            "South Africa")
    val freelancerNasim = Scientist("Freelancer", "Nasim",
        "Freelancing")


    ScientistRegistry.addScientist(william)
    ScientistRegistry.addScientist(habibusSharif)
    ScientistRegistry.addScientist(freelancerNasim)

    println(counter.studentCount())
    println(counter.scientistCount())
}