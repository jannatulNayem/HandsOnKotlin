fun nthFibonacci(givenNumber: Int):Int{
    if(givenNumber == 1 || givenNumber == 2){
        return 1
    }
    var n1 = 1
    var n2 = 1
    var i = 3
    var nthFibo:Int = -1
    while(i <= givenNumber){
        nthFibo = n1 + n2;
        n1 = n2;
        n2 = nthFibo
        i++
    }
    return nthFibo;
}
