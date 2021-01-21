fun sampleUseOfWhen(age: Int){
    when(age){
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        else -> println("Elderly")
    }
}
