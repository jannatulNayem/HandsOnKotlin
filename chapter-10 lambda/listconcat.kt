val nameList = listOf("nayem", "Rubel", "Shohel")

fun main(){
    val allNames = nameList.fold(""){
        a, b ->
        a + b + " "
    }
    println(allNames)
}
