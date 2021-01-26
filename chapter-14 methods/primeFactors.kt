fun Int.primeFactors():List<Int>{
    var factor = 2
    var number = this
    var listOfPrimeFactors = mutableListOf<Int>();
    while(factor <= number){
       if(number % factor == 0){
           listOfPrimeFactors.add(factor)
           number = number / factor
       }else {
           factor++
       }
    }
    return listOfPrimeFactors
}

