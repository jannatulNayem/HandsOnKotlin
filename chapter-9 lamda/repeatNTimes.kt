fun repeatTask(times: Int, task: () -> Unit){
    repeat(times){
        task()
    }
}


fun main() {
    repeatTask(10, {
        println("Kotlin is just cool")
    })
}
