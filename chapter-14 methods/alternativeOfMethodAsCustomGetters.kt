val months = arrayOf(
    "January", "February", "March",
    "April", "May", "June", "July", "August",
    "September", "October", "November", "December"
)

class SimpleDate(var month: String) {
    val monthsUntilWinterBreak: Int
    get() = months.indexOf("December") - months.indexOf(this.month)
    /*
    fun monthsUntilWinterBreak():Int{
    return months.indexOf("December") - months.indexOf(this.month);
     */
}

fun main() {
    val date = SimpleDate("November")
    println(date.monthsUntilWinterBreak)
}