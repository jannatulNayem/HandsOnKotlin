fun reverse(array:Array<Int>):Array<Int>{
    val myReversedArray = arrayListOf<Int>()
    var lastIndex = array.size - 1
    for(index in lastIndex downTo 0){
        myReversedArray.add(array[index])
    }
    return myReversedArray.toTypedArray()
}

fun main(){
    val reversedArr = reverse(arrayOf(1, 2, 3,))
    println(reversedArr.joinToString())
}
