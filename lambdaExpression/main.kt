// var lambda_name:data_type={paramter->body}



fun main(){
// methode One
var operationNumber:(Int,Int) -> Int = {a:Int,b:Int -> a+b}
println(operationNumber(5,5))
 
//Methode Two

var operationNumberTwo ={a:Int,b:Int-> a+b}
println(operationNumberTwo(5,5))

}