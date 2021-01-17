/*
write a function that removes all occurrences of a given integer from a list of
integers.
 */
/*Old one
fun remove(item: Int, list:List<Int>):List<Int>{
    var myMutableList = list.toMutableList()
    var count = 0
    for(value in myMutableList){
        if(value == item) count++
    }
    for(i in 1..count){
        myMutableList.remove(item)
    }
    return myMutableList
}
*/
fun remove(item:Int, list:List<Int>):List<Int>{
    val newList = mutableListOf<Int>()
    for(element in list){
        if(element != item){
            newList.add(element)
        }
    }
    return newList
}

fun main(){
    var testList = listOf(1, 2, 2, 3)
    println(remove(2,testList).joinToString())
}
