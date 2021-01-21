fun isNumberDivisible(number: Int, divisor: Int) = number % divisor == 0

fun isPrime(number :Int):Boolean{
    if(number <= 1) return false
    else if(number == 2) return true

    if(number % 2 == 0) return false
    
    val squareRootOfNumber = Math.ceil(Math.sqrt(number.toDouble())).toInt()
    for(x in 3..squareRootOfNumber step 2){
        if(isNumberDivisible(number, x)){
            return false
        }
    }
    return true
}
