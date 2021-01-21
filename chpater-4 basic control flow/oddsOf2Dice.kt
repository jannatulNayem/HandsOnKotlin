fun oddsOf2SixSidedDice():Unit{
    var i = 1
    var j = 1
    var count = 0
    while(i <= 6){
        while(j <= 6){
            if((i + j) % 2 == 1){
                println("i = $i, j = $j, (i + j) = ${i + j} ")
                count++
            }
            j++
        }
        i++
        j = 1;
    }
    println("$count")
    println("Fractions Of Outcome: ${count/36.0}")
}
