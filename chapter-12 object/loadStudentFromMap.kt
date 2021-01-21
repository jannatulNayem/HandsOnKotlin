class Student private constructor(
    val firstName: String, val
    lastName: String, val id: Int
) {
    companion object {
        val studentList = mutableListOf<Student>()
        var id = 1
        fun loadStudent(studentMap: Map<String, String>) {
            for ((key, value) in studentMap) {
                if (key.length == 0 && value.length == 0) {
                    studentList.add(Student("First", "Last", id))
                    id++
                }
                else if(key.length > 0 && value.length > 0){
                    studentList.add(Student(key, value, id))
                    id++
                }else if(key.length > 0 && value.length == 0){
                    studentList.add(Student(key, "Last", id))
                    id++
                }else{
                    studentList.add(Student("First", value, id))
                    id++
                }

            }
        }
    }
}
