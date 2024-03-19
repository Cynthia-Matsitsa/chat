fun main() {
num(25)
    myName("Cynthia","Hello")
    var result=sum(4,5)
    println(result)
}

fun num(age:Int){
    println(age)
}
fun myName(name:String,greeting:String){
    println("$greeting,my name is $name")

}
fun sum(a:Int, b:Int):Int{
    return(a+b)
}