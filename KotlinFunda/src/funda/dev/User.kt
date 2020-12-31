package funda.dev

data class User (val name :String, val age :Int){
    
}

 fun main(args:Array<String>) {
       val kevin = User("kevin", 1)
       println(kevin)
     
     val otherUser = kevin.copy();
     println(otherUser)    
 }     