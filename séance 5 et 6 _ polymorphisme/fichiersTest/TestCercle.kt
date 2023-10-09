fun main(){
    // creation d'un cercle
    val p1 = Point(1, 2)
    val c1 = Cercle(p1, 2.0F)

    // test de toString() de Cercle
    println("cercle c1 : $c1")

    // perimetre du cercle
    println("perimetre de c1 (doit être 12,56...)= ${c1.perimetre()}")

    //dimension
    println("dimension de p1 = ${c1.dimension()}")
}