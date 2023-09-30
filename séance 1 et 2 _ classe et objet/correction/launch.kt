fun main() {
    val p0:Point =Point(-1,0)
    val tPoints:Array<Point> = Array<Point>(5, {Point(it+1, it+1)})

    println("p0 : point (${p0.abscisse},${p0.ordonnee})")
    p0.abscisse=0;
    println("p0 : point (${p0.abscisse},${p0.ordonnee})")

    println("tableau de points : ")
    for (i in 0..tPoints.lastIndex) print("${tPoints[i]} ")
    println()

    println("la distance entre le point (${p0.abscisse},${p0.ordonnee}) et le point (${tPoints[2].abscisse},${tPoints[2].ordonnee}) est ${p0.distance(tPoints[2])}")

}