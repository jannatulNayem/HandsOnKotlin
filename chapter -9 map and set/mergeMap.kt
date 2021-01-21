fun mergeMaps(map1: Map<String, String>, map2:Map<String, String>)
:Map<String, String>{
    val mergedMap = mutableMapOf<String, String>()

    for((key, value) in map1){
        mergedMap.put(key, value)
    }
    for((key, value) in map2){
        mergedMap.put(key, value)
    }
    return mergedMap

}
fun main() {
    val map1 = mapOf("Bangladesh" to "Dhaka", "Iraq" to "Bagdad")
    val map2 = mapOf("Saudi Arabia" to "Riyad", "Bangladesh" to
            "Faridpur")

    val mergedMap = mergeMaps(map1, map2)
    println(mergedMap)

}
