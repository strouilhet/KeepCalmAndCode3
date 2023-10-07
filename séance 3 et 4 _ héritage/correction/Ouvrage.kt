open class Ouvrage(val titre: String, val auteur: String, private val numero: Int) {

    override fun toString() ="num=$numero:$titre:$auteur"
}