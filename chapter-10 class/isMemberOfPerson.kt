class Person(var firstName: String, var lastName: String){
    val fullName
        get() = "$firstName $lastName"
}
//class SimplePerson(val name: String)

fun memberOf(person: Person, group: ArrayList<Person>):Boolean{
    return group.contains(person)
}

fun main() {
    val arr1 = arrayListOf<Person>()
    val arr2 = arrayListOf<Person>()

    arr1.add(Person("Md Jannatul", "Nayem"))
    arr1.add(Person("Rabeya", "Islam"))
    arr1.add(Person("Nasima", "Begum"))
    arr1.add(Person("Rushda", "Naik"))
    arr1.add(Person("Jumana", "Islam"))

    val john = Person("John", "Doe")

    arr2.add(Person("Makin", "Ahmed"))
    arr2.add(Person("Em", "Nayon"))
    arr2.add(john)
    arr2.add(Person("Taslima", "Sharif"))
    arr2.add(Person("Kushi", "Parvin"))

    println(memberOf(john, arr1))
    println(memberOf(john, arr2))

}
