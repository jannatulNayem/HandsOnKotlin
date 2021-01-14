fun findNthFiboNacciUsingRecursion(n:Int):Int{
    if(n == 1 || n == 2) return 1
    else return findNthFiboNacciUsingRecursion(n-1) +
            findNthFiboNacciUsingRecursion(n-2)
}
