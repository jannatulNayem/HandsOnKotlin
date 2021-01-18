val nameList = listOf("nayem", "Rubel", "Shohel", "Rana")

fun main(){
    val filterAndJoinedNames = nameList.filter{
        it.length > 4
    }.fold(""){
        a, b ->
        a + b + " "
    }
    println(filterAndJoinedNames)
}
