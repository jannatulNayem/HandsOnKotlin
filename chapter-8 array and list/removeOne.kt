// Write a function that removes the first occurence of a given
// integer from a list of integers. 

fun removeOne(item: Int, list: List<Int>):List<Int>{
    var mutableList = list.toMutableList()
    for(value in mutableList){
        if(value == item){
            mutableList.remove(item)
            break
        }
    }
    return mutableList
}
fun main() {
    val newList = removeOne(2, listOf(1 ,2, 3))
    println(newList.joinToString())
}
