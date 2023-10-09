
fun main(args: Array<String>) {
    val p: Array<Point> = arrayOf(Point(-1, 0), Point(0, 0), Point(0, 1) , Point(1, 0),
        Point(1, 1), Point(2, 0), Point(2, 1), Point(3, 0) ,
        Point(4, 0), Point(2, -1))

    println("distance p1p4 = " + p[1].distance(p[4]))

    //creation de 5 figures
    val penta = Polygone(arrayListOf(p[0], p[1], p[2], p[3], p[4]))
    val paral = Parallelogramme(p[1], p[4], p[6], p[3])
    val losange = Losange(p[1], p[6], p[8], p[9])
   val triangle = Triangle(p[1], p[2], p[4])
    val cercle = Cercle(p[1], 1.0F)

    val figures = arrayOf(losange, paral, triangle, cercle, penta)

    println("***Dimensions de figures :")
    for (i in 0..figures.size-1) {
        println("${figures[i]} dimension ${figures[i].dimension()}")
    }

    println("***Périmètres de figures :")
    for (i in 0..figures.size-1) {
        println("perimetre de " + figures[i] + " = " + figures[i].perimetre())
    }

    println("***Diagonales de parallélogrammes :")
    val paras= arrayOf(losange, paral)
    for (i in 0..paras.size-1) {
        println("${paras[i]} : ${paras[i].diagonales()}")
    }

    println("***Côtés de polygones")
    val poly = arrayOf(losange, paral, triangle)
    for (i in 0..poly.size-1) {
        println("${poly[i]} : ${poly[i].nbCotes()}")
    }

}