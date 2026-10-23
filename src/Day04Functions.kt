fun cooking(){
    println("cook the food")
    println("food is very hot")
}
fun birthday() {
    println("mera kal birthday hai")
    println("i want a cake ")
}
    // return type wala function
    fun card():String {
        val message="happy birthday to u"
        return message
    }

fun main() {
    cooking()
    birthday()
println(card())// variable me save kr k print karaya hai
}