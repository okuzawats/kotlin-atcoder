package abc217

fun main() = (setOf("ABC", "ARC", "AGC", "AHC") - (0..2).map { readLine()!! }.toSet()).forEach(::println)