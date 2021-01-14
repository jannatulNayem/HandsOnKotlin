// write a for loop to print the list of players name and their scores

fun showPlayersInfo(players: List<String>, scores:List<Int>):Unit{
    val range = 0..players.size-1
    for(index in range){
        println("${players[index]} Score: ${scores[index]}")
    }
}

fun main(){
    val players = listOf<String>("Makin", "Nayem", "Nuru", "Nayon", "Extra")
    val scores = listOf<Int>(8, 5, 3, 2, 7)
    showPlayersInfo(players, scores)
}
