fun main(){
    // creation d'un parallélogramme
    val p0 = Point(0, 0)
    val p1 = Point(1, 1)
    val p2 = Point(3, 1)
    val p3 = Point(2, 0)

    val para = Parallelogramme(p0, p1, p2, p3)

    // test de toString()
    println("para : $para")

    // perimetre du parallelogramme
    println("perimetre de para (doit être 4,82...) = ${para.perimetre()}")

    //dimension
    println("dimension de para = ${para.dimension()}")

    //nb cotes
    println("nb de cotes de para = ${para.nbCotes()}")

    //diagonales
    println(para.diagonales())  // j'ai 2 diagonales qui se coupent en leur milieu
}