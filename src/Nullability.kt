fun main(args: Array<String>) {
    //in kotlin when declaring a variable it must be initialize with a value or setting it to null
    var name: String = "JonnyB"
    //name = null  //compiler error null cannot be assigned to a variable that is not explicity declared as null

//    4 ways to make NPE
//    1.to make explicit call to throw NPE or a crash
//    2. usage of this operator: !! //this can happen
//    3. external java code causes NPE coz kt and java are
//            interoperable you can have java lib in kt
//            4. Data consistency

//    Declare a nullable variable
    var nullableName: String? = "Do I really exist?"

    //no null check, it is expected to throw compiler error
    //nullableName.length

    var length = 0
    //Null check will not generate compiler error
    if (nullableName != null){
        length = nullableName.length
    }
    println (length)

    //if we set nullableName = null
    nullableName = null
    if (nullableName != null){
        length = nullableName.length
    }
    else{
        length =-1
    }
    println(length)

    //immutable variable
    val l = if (nullableName != null) nullableName.length else -1//if - else: assign length to l if not null else assign -1
    println(l)

    //Second method Safe Call Operator ?
    println(nullableName?.length)//what this do? print the length if not null else print null

    //Third method Elvis Operation, before assigning value of a variable to another variable check that its not null else assign value to another variable
    val len = nullableName?.length ?: 1 //same as if-else: assign length to len if not null else if null assign -1

    val noName = nullableName ?: "No one knows me" //if nullableName is null then assign "No one knows me" to noName
    println (noName) //this print No one knows me coz nullableName is null
    println(nullableName) //prints null

    //Lastly if you want to introduce NPE to your app use !! operator
    //what this does is it returns a value of a variable if it exists else it returns NPE or App is going to crash

    //println(nullableName!!.length)//we are saying go to nullableName coz we know its there but its not there so our app will crash

    //its very important that we only use !! if you know 100% that a value exists for a variable

    //below we make nullableName not null
    nullableName = "this is not null"
    //now we use the !! operator this time our app does not throw NPE
    //first comment the code: println(nullableName!!.length)
    println(nullableName!!.length)


}