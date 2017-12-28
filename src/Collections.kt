fun main(args: Array<String>) {
    //this lecture we are only covering collections: arrays and maps
    //there are other collections like: queues, sets

    //collections has 2 types: mutable and immutable
//    IMMUTABLE ARRAY TYPE WE USE listOf

    //a list is essentially an array
    val imperials= listOf("Emperor","Darth Vader","Boba Fett","Tarken")
    println(imperials) //print out will be in square bracket, if you see an square bracket it is an array
    //above is an immutable array therefore we cannot add into it, we cannot modify

    //however there are other things we can do
    println(imperials.sorted()) //this displays sorted elements in array

    //access elements in the list
    println(imperials[2])// this prints Boba Fett

    //can access first
    println(imperials.first())

    //can access last
    println(imperials.last())

    //can return boolean to check if an string exists in the list
    println(imperials.contains("Emperor"))


//    MUTABLE ARRAY TYPE, WE use arrayListOf
    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")//initialize
    println(rebels.size) //print size of the mutable array
    rebels.add("Chewbacca") //adds as last element
    rebels.add(0, "Lando") // as element in index 0
    println(rebels)
    //we can also find the index of Luke
    println(rebels.indexOf("Luke"))//this returns 2

    //we can also remove elements in the list
    rebels.remove("Han Solo")
    println(rebels)

    //MAPS: is a collection of unordered key/value pair

    //IMMUTABLE MAPS
    //rebeVehiclesMap is a Map of <String> <String> pair
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"]) //  Solo is the key one way to access
    println(rebelVehiclesMap.get("Solo"))// one way to access using get function
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))//if key Leiah does not exist we avoid throwing exception by displaying default value

    println(rebelVehiclesMap.get("Sol1"))//this returns null

    //we can also print all keys or values
    println(rebelVehiclesMap.keys)
    println(rebelVehiclesMap.values)
    //remember rebelVehiclesMap is an immutable map therefore we cannot modify it
    //W MAP we start declaring with hashMapOf, the immutable we only use mapOf

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    //change value of Luke since this is mutable map
    rebelVehicles["Luke"] = "XWing"
    //add value to mutable hashMap
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)
    //we can also remove entry in hashMap
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    //rebelVehicles.clear() - this will clear up all the entris in the hasmap
    rebelVehicles.isEmpty() //returns boolean whether or not hashMap is empty

    //Note is very important topic, list/or array holds messages in chat
    //map, hashMap as well



}