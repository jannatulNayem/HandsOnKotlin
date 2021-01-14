fun destructureOfPair(personInfo: Pair<String, Int>){
    val (name, age) = personInfo
    when(age){
        in 0..2 -> println("$name is an Infant")
        in 3..12 -> println("$name is a child")
        in 13..19 -> println("$name is a Teenager")
        in 20..39 -> println("$name is an adult")
        in 40..60 -> println("$name is a middle aged")
        else -> println("$name is elderly")
    }
}
