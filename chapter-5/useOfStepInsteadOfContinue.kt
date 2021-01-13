fun skipEvenRowWithoutContinue(){
    var sum = 0
    for(row in 1 until 8 step 2){

        for(column in 0 until 8){
            sum += row * column
            print("$sum ")
        }
        println()

    }
}
