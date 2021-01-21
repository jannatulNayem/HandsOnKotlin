fun filteredApps(appRating: Map<String, Array<Int>>){
    val averageRatings = mutableMapOf<String, Double>()

    appRating.forEach{
        val currentValue = it.value
        val totalRate = currentValue.reduce{
            a, b ->
            a + b
        }
        val averageRate = totalRate / currentValue.size.toDouble()
        averageRatings.put(it.key, averageRate)
    }

    val filteredApps = averageRatings.filter{
        it.value > 3
    }
    println(filteredApps)

}

fun main() {
    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

    filteredApps(appRatings)
}
