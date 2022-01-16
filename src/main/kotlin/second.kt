//READ LINE
//fun main(){
//    val userInput = readLine()
// //   println("Hekko ! $userInput")
////    println(userInput ?.toUpperCase())
//    if(userInput != null)
//        println(userInput.toInt() - 5) // input a number for subtraction and typecasting
//}
//
//hw
//fun main(){
//    println("PLease enter your age : ")
//    val age = readLine()?.toInt()
//
//    if(age != null){
//        if(age < 18){
//            println("You are underage")
//        }
//        else if(age >= 18 && age <= 60){
//            println("youre an adult")
//        }
//        else{
//            println("you are physically old")
//        }
//    }
//}


////ARRAYS
//fun main(){
//    val myArray = arrayOf("hello","guys" , " yo ")
//    println(myArray[2])
//}

//WHILELOOP
//fun main(){
//    var x = 4
//    while(x>0){
//        println("hello")
//        x--
//    }
//    println("out")
//}


//fun main(){
//    val myArray = arrayOf("hello","my","people")
//    val arraylength = myArray.size
//    var i = 0
//    while(i<arraylength){
//        println(myArray[i])
//        i++
//    }
//}

//hw
//fun main() {
//    var i = readLine()?.toInt()
//    if (i != null && i>=0) {
//        while (i >= 0) {
//            println(i)
//            i--
//        }
//    }
//}
//
//fun main(){
//    println("Enter the no 1 : ")
//    var x = readLine()?.toInt()
//    println("Enter the power :")
//    var y = readLine()?.toInt()
//    var result = 1
//    var i = 0
//    while(x != null && y!= null && i<y){
//        result*= x
//        i++
//    }
//
//    println("$x to the power $y Is : $result")
//
//}

//MAX ARRAY
//fun main() {
//    val myArray = arrayOf(1,2,3)
//    for(i in myArray){
//        println(i)
//
//    }
//
//    for (i in 10 downTo  0) {
//        println(i)
//    }
//    for (i in 'a'..'z') {
//        println(i)
//    }
//    val myArray = arrayOf(4,5,6,7,8,89,7)
//    var max = myArray[0]
//    for(i in myArray){
//        if(i > max){
//            max = i
//        }
//    }
//    println(max)
//}

////hw
//fun main(){
//    val myArray = arrayOf(4,5,6,7,8,89,7)
//    var sum =0
//    for(i in myArray){
//        sum = sum + i
//    }
//    println("$sum")
//}

//fun main(){
//    println("Enter 5 Number: ")
//    var avg = 0.0
//    for(i in 1..5){
//        var input = readLine()?.toInt()
//        if(input != null) {
//            avg += input / 5.0
//        }
//    }
//    println("The Average Value Is : $avg")
//}

//LIST
//fun main(){
//    val array = arrayOf(1,2,3) // value of array can be changed during runtime
//    val list = mutableListOf(1,2,3) // value of list cannot be changed during runtime
//    array[0]=3
//    list[0]=4 // immutable but using mutablelistof its possible
//    list.add(5) // adds at the end
//    println(list) // it doesnot require loop ffor printing all values
//    list.remove(2)
//    list.removeAt( 2)
//    println(list)
//
//}
//
//fun main(){
//    //adding value in list
//    val list = mutableListOf<Int>()
//    for(i in 1..5){
//        val x = readLine()?.toInt()
//        if (x != null) {
//            list.add(x)
//        }
//    }
//    println(list.reverse())
//}
//
//


