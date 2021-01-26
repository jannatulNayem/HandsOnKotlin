class SimpleDate(var month:String, var day: Int = 0) {
    fun advance() {
        if(month == "December" && day == 31){
            month = "January"
            day = 1
        }
        else if(isMonthOf31() && day == 31){
            var nextMonthIndex=  months.indexOf(month) + 1
            month = months[nextMonthIndex]
            day = 1
        }else if(isMonthOf30() && day == 30){
            var nextMonthIndex = months.indexOf(month) + 1
            month = months[nextMonthIndex]
            day = 1
        }else if (month == "February" && (day == 28 || day == 29) ){
            // leap year is not identified
            month = "March"
            day = 1
        }else{
            day = day + 1
        }
    }
    fun isMonthOf30():Boolean{
        return when(month.toLowerCase()){
            in arrayOf("april", "june", "september", "november") ->
                true
            else -> false
        }
    }

    fun isMonthOf31():Boolean{
        return when(month.toLowerCase()){
            in arrayOf("january", "march", "may", "july", "august",
                "october", "december") -> true
            else -> false
        }
    }
}

fun main() {
    var date = SimpleDate(month = "December", day = 30)
    date.advance()
    date.month // December; should be January!
    date.day // 32; should be 1!

    println("month: ${date.month}")
    println("day: ${date.day}")


}
