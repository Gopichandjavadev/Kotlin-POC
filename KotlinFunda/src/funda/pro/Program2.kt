package funda.pro

import javaprog.Person

class Program2 {
    
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val p = Person()
           
            p.name = "kevin"
            p.age = 50
           
            println("${p.name} is ${p.age} years old")
            
            try {
                p.name = "kevin2"
            } catch (e:Exception) {
                println(e.message)
            }
            
            val partner = p.partner
            println(partner?.name)
            
        }
    }
}