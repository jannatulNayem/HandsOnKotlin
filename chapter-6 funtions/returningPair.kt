fun returningPair(firstName:String, lastName:String): Pair<String, Int>{
    val fullName = firstName + " " + lastName
    val nameLength = fullName.length
    return Pair(fullName, nameLength)
}
