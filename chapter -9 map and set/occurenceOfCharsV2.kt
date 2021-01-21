fun occurenceOfCharacters(text: String): Map<Char, Int>{
    var myMap = mutableMapOf<Char, Int>()


    //with Bonus
    for(char in text){
        var intialValue = myMap.getOrDefault(char, 0)
        myMap.put(char, ++intialValue)
    }
    for((key, value) in myMap){
        println("$key -> $value")
    }
    return myMap
}

fun main() {
    val myString = "apple"
    occurenceOfCharacters(myString)
}
