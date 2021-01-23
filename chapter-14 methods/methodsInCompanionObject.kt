class MyMath{
    companion object{
        fun factorial(number: Int):Int{
            return (1..number).fold(1){a, b -> a * b}
        }
        fun nthTringleNumber(number: Int):Int{
            return (1..number).fold(1){a, b -> a + b}
        }
    }
}