fun main(){
    val p0 = Point(0, 0)
    val p1 = Point(1, 1)
    val p2 = Point(1, 2)
    val p3 = Point(0, 3)
    val p4 = Point(-1, 2)
    val penta = Polygone(ArrayList(arrayListOf(p0, p1, p2, p3, p4)))
    // test de toString() de Polygone
    println("penta : $penta")  // Polygone de sommets : [(0,0), (1,1), (1,2), (0,3), (-1,2)]
    // perimetre du polygone
    println("perimetre de penta (doit être 7,47...) = ${penta.perimetre()}")  // 7.478708664619075
    //dimension
    println("dimension de penta = ${penta.dimension()}") // 2
    //nb cotes
    println("nb de cotes de penta = ${penta.nbCotes()}") // 5
}