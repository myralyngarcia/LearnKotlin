open class Player (val name: String, val age: String, val gender: String){
    open fun attack(){
        println("Attak: Here I come!!!")
    }
    fun defend(){
        println("Defend: Move forward")
    }
    fun walk(){println("Walk: Slow Down...")}

}

class Warrior(name:String, age: String, gender: String, val weapon: String): Player(name, age, gender){
    override fun attack() {
        println("Attack with my $weapon")
    }
    fun properties(){
        println("My name is $name and $age yrs old holding a $weapon!")
    }
}

class Thief(name:String, age: String, gender: String, val speed: Int): Player(name, age, gender){
    override fun attack() {
        println ("I'm a thief that moves $speed km/hr")
    }
}

fun main(args: Array<String>) {
    val warrior = Warrior("Gideon", "32", "Male", "Sword")
    warrior.properties()
    warrior.attack()


    val thief = Thief("Massey", "21", "Male", 50)
    thief.attack()
    thief.defend()
    thief.walk()
}