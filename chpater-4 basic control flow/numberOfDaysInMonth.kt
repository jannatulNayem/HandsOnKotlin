fun calculateNumberOfDaysInMonth(month: String, year: Int) = when(month.toLowerCase()){
    "january", "march", "may", "july", "august", "october", "december" -> 31
    "april", "june", "september", "november" -> 30
    else -> daysInFebruary(year)
}
fun daysInFebruary(year: Int) = if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 29 else 28
