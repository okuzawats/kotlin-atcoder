package abc232

fun main() = println(readLine()!!.split('x').map(String::toInt).reduce { a, b -> a * b })