object Threshold {
    val thresholdValue:Int = 5
    fun isAboveThreshold(value: Int):Boolean{
        return value > thresholdValue
    }
}