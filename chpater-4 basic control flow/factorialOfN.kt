fun factorial(inputNumber:Int):Int{
    var factorial = 1;
    var i = 1
    while(i <= inputNumber){
        factorial *= i
        i++
    }
    return factorial
}
