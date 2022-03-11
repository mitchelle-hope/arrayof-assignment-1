fun main (){
    cars("tesla","bmw","voxwagen","lamboghini")
    cities("harare","dodoma","mumbai","jakarata")
    values(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    people("mitchelle","fardosa","lucy")

}
//reate a function that takes in 4 strings  and creates an array out of them
//then prints out the array                (2 points)
 fun cars (a:String,b:String,c:String,d:String){
     var mobiles = arrayOf(a,b,c,d)
        println(mobiles.contentToString())
}
//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities (a:String,b:String,c:String,d:String){
    var town = arrayOf(a,b,c,d)
    town.forEach{ town->
        println(town.capitalize())
    }
}
//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements(1 point)
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order
fun values (number:Array<Int>){
    var sum = number[1]+number[3]
    println(sum)
    println(number.indexOf(158))
    var sortednumber=number.sortedArray()
    println(sortednumber.contentToString())
}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names
fun people (a:String,b:String,c:String){
    var friends = arrayOf(a,b,c)
    println(friends.contentToString())
}



