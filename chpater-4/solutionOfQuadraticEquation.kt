fun findQuadraticSolution(a: Double, b: Double, c: Double): Any{
    val solution1: Any
    val solution2: Any

    val discriminant = b * b - 4 * a * c;

    if(discriminant < 0) {
        val positive_discriminant = discriminant * (-1);
        solution1 = "${-b/(2*a)} + ${Math.sqrt(positive_discriminant)/(2 * a)}i"
        solution2 = "${-b/(2*a)} - ${Math.sqrt(positive_discriminant)/(2 * a)}i"
    }else{
        solution1 = "${-b/(2 * a) + Math.sqrt(discriminant)/(2 * a)}"
        solution2 = "${-b/(2 * a) - Math.sqrt(discriminant)/(2 * a)}"
    }

    return Pair(solution1, solution2);
}
