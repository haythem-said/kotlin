// higher order fun est une fonction qui prend un autre fun comme parameter et return function 




fun operationType(a:Int,b:Int,operation:(Int,Int) -> Int) : Int {
   return operation(a,b)
}
fun addition(a:Int,b:Int):Int{
    return a+b
}
fun substraction(a:Int,b:Int):Int{
    return a-b
}

fun main(){
    var resultOne=operationType(5,5, ::addition)
    var resultTwo=operationType(5,5, ::substraction)
    println(resultOne)
    println(resultTwo)
}