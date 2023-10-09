fun main(args: Array<String>) {
    // creation de quelques points

    val p: Array<Point> = arrayOf(Point(-1, 0), Point(0, 0), Point(0, 1) , Point(1, 0),
        Point(1, 1), Point(2, 0), Point(2, 1), Point(3, 0) ,
        Point(4, 0), Point(2, -1))

    // distance entre deux points
    println("distance p1p4 = " + p[1].distance(p[4]))

    //creation d'un losange,  parallelogramme, polygone a 5 cotes, cercle
    val losange = Losange(p[1], p[6], p[8], p[9])
    val paral = Parallelogramme(p[1], p[4], p[6], p[3])
   val triangle = Triangle(p[1], p[2], p[4])

    val cercle = Cercle(p[1], 1.0F)

    val penta = Polygone(arrayOf(p[0], p[1], p[2], p[3], p[4]))

    //creation d'un tableau de figures
    val figures = arrayOf(p[1], losange, paral, triangle, cercle, penta)

    // affichage des caracteristiques de ces figures et de la dimension
    for (i in 0..5) {
        println("${figures[i]} dimension ${figures[i].dimension()}")
    }

    //creation d'un tableau de figures2D
    val figures2D= arrayOf(losange, paral, triangle, cercle)

    // perimetre de ces figures2D
    for (i in 0..3) {
        println("perimetre de " + figures2D[i] + " = " + figures2D[i].perimetre())
    }

    //creation d'un tableau de parallelogrammes
    val para= arrayOf(losange, paral)

    // diagonales de ces parallelogrammes
    for (i in 0..1) {
        println("${para[i]} : ${para[i].diagonales()}")
    }

    //creation d'un tableau de polygones
    val poly = arrayOf(losange, paral, triangle)

    // nombre de cotes de ces polygones
    for (i in 0..2) {
        println("${poly[i]} : ${poly[i].nbCotes()}")
    }

}