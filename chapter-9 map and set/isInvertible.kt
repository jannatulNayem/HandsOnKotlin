fun isInvertible(map: Map<String, Int>): Boolean{
    val myMapValues = map.values
    val mySet = myMapValues.toSet()
    return  myMapValues.size == mySet.size
}
fun main() {
    val myMap = mapOf("a" to 1, "b" to 1, "c" to 3)
    println(isInvertible(myMap))

}
