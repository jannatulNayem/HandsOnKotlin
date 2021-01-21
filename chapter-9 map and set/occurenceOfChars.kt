fun occurenceOfCharacters(text: String): Map<Char, Int>{
    var myMap = mutableMapOf<Char, Int>()

    // without bonus
    for(char in text){
        if(myMap.get(char) == null){
            myMap[char] = 1
        }else{
            var oldValue = myMap.get(char)
            if(oldValue != null){
                oldValue++
                myMap.set(char, oldValue)
            }
        }
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
