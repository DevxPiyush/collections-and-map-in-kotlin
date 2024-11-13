fun main(){
    val list = listOf("a","b")
    val newList = list +"c"
    println(list)
    println(newList)
    for (i in list) {
        println(i)
    }
    val mutableList = mutableListOf("a","b") // mutable list
    mutableList.addLast("c")
    println(mutableList)
}