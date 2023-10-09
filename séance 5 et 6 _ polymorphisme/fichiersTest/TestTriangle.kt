fun main(){
    // creation d'un triangle
    val p0 = Point(0, 0)
    val p1 = Point(1, 1)
    val p2 = Point(1, 2)

    val triangle: Polygone = Triangle(p0, p1, p2)

    // test de toString()
    println("triangle : $triangle")

    // perimetre du triangle
    println("perimetre de triangle (doit être 4,65...) = ${triangle.perimetre()}")

    //dimension
   println("dimension de triangle = ${triangle.dimension()}")

    //nb cotes
    println("nb de cotes de triangle = ${triangle.nbCotes()}")
}