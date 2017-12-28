//Kotlin will make a getter only for the car class coz the property make and model are immutable
//the constractor is setting the car make and model
//a class is a blueprint and it becomes an object when instantiated. below is Car blueprint
//class Car(val make: String, val model: String, var color: String){
//    //what can a car do?
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//
////below is truck blueprint or class
//class Truck (val make: String, val model: String, val towingCapacity: Int){
//    fun tow(){
//        println("taking the horses to the rodeo")
//    }
//
//    fun details(){
//        println("The $make $model has towing capacity of $towingCapacity lbs")
//    }
//
//}

//we declare vehicle class to be inherited by car and truck and put open coz by default all classes in kotin are final and cannot be inherited
//both car and truck has make and model properties so we put in constructor
//Vehicle is a parent class and has a primary constructor
open class Vehicle (val make: String, val model: String){
    //following is what vehicles can do
    open fun accelerate(){ //open means it allows us to overwrite the function in one of the children classes
        println ("vroom vroom")
    }

    fun brake (){
        println ("STOPPED")
    }

    fun park(){
        println ("parking the vehicle")
    }

}

//now create a child car class which inherits Vehicle class
//since the Vehicle car has primary constructor we need to initialize when we are declaring the child class
//also we need to pass the make and model to the parent class
//we will also add a color for the class car
class Car(make: String, model: String, val color: String): Vehicle(make, model){
    override fun accelerate() {
        println ("we are going ludicrous mode!") //next time testla.accelerate is call this is printed instead of vroom vroom
        super.accelerate()//we can still call the parent function in the child class
    }

}

//lets create another child class Truck that inherits the parent class Vehicle
class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model){
    //we can also add new functions in child classes that is specific
    fun tow(){
        println("Truck headed out to the mountains!!!")
    }

}

//Note: if a class has no methods/fun we can remove the curly braces ie. class Truck (make: String, model:String): Vehicle(make, model)

fun main(args: Array<String>) {
    //now lets go ahead and create a class car
    val tesla = Car("tesla", "modelS", "red")
    //as we see above Car does not have functions but we can still call the following fun coz car inherited from parent class vehicle
    tesla.accelerate()
    tesla.brake()
    tesla.park()

    val ram = Truck ("RAM", "1500", 10000)
    ram.tow()


//    //create instance of a car, send to the factory and give blueprint to create a car
//    val car = Car("Toyota", "Avalon", "red")
//    println(car.model)
//    println(car.make)
//    println(car.accelerate())
//    println(car.details())
//
//    //send blueprint of the truc to the factory to create a truck
//    val truck = Truck("Ford", "FX-150", 10000)
//    truck.tow()
//    truck.details()

    //as we can see both car and truck has common properties like make and model
    //also they have the same operation, details
    //so we can make a vehicle class that has the common properties and operation
    //so the both car and truck class can inherit from vehicle class
    //do lets comment both the car and truck classed above and some of the code in main
    //not by default in kotlin a class is final which cannot be inherited.
    //so to create a class that can be inherited we need to declare open class <className>
}