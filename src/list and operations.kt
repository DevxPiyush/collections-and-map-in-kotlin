fun main(){
    // creating a list
    val Lengthis= listOf("cm" , "metre" , "inch")
    println(Lengthis)
    val ShoppingItems:List<String> = listOf("bananas","Apple","Mangoes")
    println(ShoppingItems)
    println(ShoppingItems.size)
    // adding items in a list
    val items = listOf("shampoo","conditioner","soap")
    println(items + listOf("kesar","badaam","pista")) // adding another item into the list
    println(items.size == 0)
    println(items.isEmpty())
    // empty list checkout
    val empty:Set<Int> = setOf()
    println(empty.size==0)
    println(empty.isEmpty())
    //checking the presence of any element in a list
    println("kesar" in items)
    println(items.contains("kesar"))
    println("kesar" !in items)
    //iterating over list
  for ( i in items){
      println(i)
  }
    // creating mutable list
    val dogs = mutableListOf("labrodor","pomrenian","chihuaha") // making list mutable
    dogs.add("golden retriver")
    println(dogs)
    dogs.remove("chihuaha")
    println(dogs)
    // changing an element at certain position
    dogs[1] = "husky"
    println(dogs)
}