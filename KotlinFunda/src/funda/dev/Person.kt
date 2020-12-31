package funda.dev

interface Signatory {
    fun sign()
}

open class Person(val name :String, var age :Int, var isMarried :Boolean=false) : Signatory {
    
    var partnerName : String = ""
    
    //constructor(name :String, age :Int, isMarried :Boolean) : this(name, age){
    //    this.isMarried = isMarried
    //}
    
    override fun sign() = println("$name aged $age can sign the documents and married $isMarried");
    
    companion object {
        @JvmStatic
        fun main(args:Array<String>) {
        val p =  Person("Kevin", 11, true)
        p.sign()
            
        p.partnerName = "alice"
        
        println("Partner name is ${p.partnerName}")        
    }      
    }
}

class Student (name :String, age :Int) : Person(name, age)

//fun main(args:Array<String>) {
//    val p =  Person("Kevin", 11, true)
//    p.sign()   
//}