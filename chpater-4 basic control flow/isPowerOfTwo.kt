import kotlin.math.log2

fun isNumberPowerOfTwo(number: Double):Boolean {
    val log2OfNumber = log2(number)
    val decimalParts = log2OfNumber.toString().split('.')[1]
    if(decimalParts.toIntOrNull() == 0){
        return true;
    }
    return false
}
