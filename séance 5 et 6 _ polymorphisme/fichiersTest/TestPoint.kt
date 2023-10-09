fun main(){
    val p1 = Point(1, 2)
    val p2 = Point(2, 3)
    // test de toString() de Point
    println("p1 : $p1")  // (1,2)
    println("p2 : $p2")  // (2,3)
    // distance entre deux points
    println("distance p1p2 = ${p1.distance(p2)}")  // 1.4142
    //dimension
    println("dimension de p1 = ${p1.dimension()}")  // 0
}