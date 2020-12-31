

fun main(args : Array<String>) {
    
//    val allProviders = Providers.getProviders();
//    
//    val it =  allProviders.iterator();
//    while (it.hasNext()) {
//        //println(it.next().name);
//        val provider = it.next();
//        provider.forEach { key, value -> println("\t$key : $value") }
//    }
    
    //listProviders{
    //    key, value -> println("\t------ $key : $value")
    //}
    
      val providers = Providers()
    val details = providers.getAllProviders("random");
    details.forEach{
        println(it)
    }
}

fun listProviders(fn: (String, String) -> Unit) {
    
    val providers = getProviders()
    val it =  providers.iterator();
    while (it.hasNext()) {
        //println(it.next().name);
        val provider = it.next();
        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }  
        
}