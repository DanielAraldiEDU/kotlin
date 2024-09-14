fun isOdd(number: Int): Boolean {
    return number % 2 == 1
}

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    
    val sqrtValue = Math.sqrt(number.toDouble()).toInt()
    for (index in 2..sqrtValue) {
        if (number % index == 0) return false
    }
    
    return true
}

fun main() {
    println("Hello, world!!!")
    
    for (number in 1..20) {
        println("$number is odd? ${isOdd(number)}")
        println("$number is prime? ${isPrime(number)}")
    }
    
    val countries = listOf("Brazil", "Germany", "Peru", "Russia", "Uruguai", "Canada")
    countries.forEach{ print("$it ") }
}
