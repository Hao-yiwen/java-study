package org.example

fun main(args: Array<String>) {
//    val favariteActor = null;
//    var favariteActor = "Tom Cruise"
//    favariteActor = "Meryl Streep"
//    println(favariteActor)

//    println(favoriteActor)
    var favoriteActor: String? = null
//    favoriteActor = null
//    println(favoriteActor)
//    println(favoriteActor?.length)
//    val lengthOfName =  if(favoriteActor != null) {
////        println("The number of characters in your favorite actor's name is ${favoriteActor.length}")
//        favoriteActor.length
//    } else {
////        println("You have not yet chosen a favorite actor.")
//        0
//    }
    val lengthOfName = favoriteActor?.length ?: 0
    println(lengthOfName)
}