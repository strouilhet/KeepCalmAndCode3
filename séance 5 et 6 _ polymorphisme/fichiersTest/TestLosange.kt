fun main(){
    // creation d'un losange
    val p0 = Point(0, 0)
    val p1 = Point(1, 0)
    val p2 = Point(1, 1)
    val p3 = Point(0, 1)

    val losange = Losange(p0, p1, p2, p3)

    // test de toString()
    println("losange : $losange")

    // perimetre du parallelogramme
    println("perimetre de losange (doit être 4) = ${losange.perimetre()}")

    //dimension
    println("dimension de losange = ${losange.dimension()}")

    //nb cotes
    println("nb de cotes de losange = ${losange.nbCotes()}")

    //diagonales
    println(losange.diagonales()) //j'ai 2 diagonales qui se coupent en leur milieu et qui sont perpendiculaires
}