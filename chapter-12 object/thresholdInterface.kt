interface ThresholdChecker{
    val lower: Int
    val upper: Int
    
    fun isLit(value: Int): Boolean
    fun tooQuiet(value: Int):Boolean
}

val thresholdChecker = object :ThresholdChecker{
    override val lower: Int
        get() = 7

    override val upper: Int
        get() = 10

    override fun isLit(value: Int): Boolean {
        return value > upper
    }

    override fun tooQuiet(value: Int): Boolean {
        return value < lower
    }
}
