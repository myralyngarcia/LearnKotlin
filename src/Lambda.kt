fun main(args: Array<String>) {
    //lambda expression exists within the curly bracket and it is a function literal which means they are not declared.
    //the input to lambda expression is at the left of the right arrow and the right is the return
    val printMessage = { message: String -> println(message)}

    //why don't we just create a function instead of using lambda
    //here we will show what we can do with lambda

    printMessage("hello world")//this will print hello world

    val sumA = {x: Int, y: Int -> x+y}
    println(sumA(5,3))
    //we can clean sumA like below
    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    //above is some ways to use lambda function

    //we can also use lambda for asynchronous web request
    //example we only execute lambda function when we get the response
    fun downloadData (url: String, completion: ()-> Unit){
        //Unit is void in kotlin so completion returns nothing

        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }

    //call downloadData function
    //the string in println will be displayed coz completion() was ran
    //but if we comment out completion() in the function the string will not be displayed
    //coz completion() was not ran.
    downloadData("fakeUrl.com", {println("The code in this block, " +
            "will only run after the completion()")})

    //create another function that uses lambda. The Car class is from file: Classes.txt
    fun downloadCarData(url: String, Completion: (Car)-> Unit){
        //we sent download request
        //we got back carData
        val car = Car("Tesla", "Modelx", "Blue")
        Completion(car)//lambda is only executed once we got back data
    }
    //now lets call downloadCarData function
    //we can put the lambda outside the parenthesis
    //and we have access to the instance of car from the function
    //and lambda only gets execute once we got the data
    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
    }
    //if there is only one argument for the lambda we can re-write using it
    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
    }

    //lets make another function with lambda
    fun downloadTruckData(url: String, completion: (Truck)->Unit){
        //we sent download request
        //we got Truck data
        val truck = Truck("RAM","1500", 1000)
        completion(truck)//since we get the truck data we can complete

    }

    //now lets call downloadTruckData
    //and we have access to the instance for truck from the function
    downloadTruckData("fakeUrl.com"){truck ->
        truck.tow()
        truck.park()
    }

    //another function that uses truck
    //we do not know if we ever get truck data from download hence it could be null, Truck?
    fun downloadTruckD (url: String, completion: (Truck?, Boolean)->Unit){
        //we pretend we are sending we request
        //we pretend that we got success on web request
        val webRequestSuccessful=true
        if(webRequestSuccessful){
            //then we got the truck data, so we create truck data
            val truck = Truck("RAM", "1500", 10000)
            completion(truck, true)
        }else{//if not successful then we get a null Truck and boolean is false
            completion(null, false)
        }
    }
    //call function downloadTruckD
    downloadTruckD("fakeUrl.com"){truck, success ->
        if(success == true){//do something with our truck
            //use null safe operator ?
            truck?.accelerate()
        }else{//we did not get truck data, handle web request failure
            println("something went wrong!!")
        }
    }
}