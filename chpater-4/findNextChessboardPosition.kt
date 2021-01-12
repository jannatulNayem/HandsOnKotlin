fun calculateNextPosition(row: Int, col: Int): Pair<Int,
        Int> {
    var nextPosition = Pair(-1, -1);
    if (row == 7 && col == 7) {
        nextPosition = Pair(0, 0)
    } else if (col == 7) {
        nextPosition = Pair(row + 1, 0)
    } else {
        nextPosition = Pair(row, col + 1)
    }
    return nextPosition;
}
