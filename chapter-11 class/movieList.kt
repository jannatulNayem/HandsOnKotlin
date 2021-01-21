class User(val name: String){

    fun addList(movieList:MovieList): MutableMap<String, MutableList<String>> {
        val myMap = mutableMapOf(name to movieList.listOfMovies)
        return myMap
    }
}

class MovieList(){


    val listOfMovies = mutableListOf<String>()
    fun print(){
        for(movie in listOfMovies){
            println(movie)
        }
    }
}

fun main() {
    val movieList = MovieList()
    val aList = listOf("a", "b", "c")
    movieList.listOfMovies.addAll(aList)

    val jane = User("jane")
    var r1 = jane.addList(movieList)
    println(r1)

    val john = User("john")
    var r2 = john.addList(movieList)
    println(r2)
    movieList.listOfMovies.add("d")
    println(r2)


}
