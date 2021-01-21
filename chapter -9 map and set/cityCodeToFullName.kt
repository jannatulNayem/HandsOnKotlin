fun shortNameToFullName(codeNameToFullName: Map<String, String>){
    for(fullName in codeNameToFullName.values){
        if(fullName.length > 8){
            println("$fullName")
        }
    }
}
fun main() {
    val stateInfo = mapOf("NY" to "Ney Work", "CA" to "California")
    shortNameToFullName(stateInfo)
}
