/* question :
    cette classe respecte-elle le principe de masquage des données ?
    Expliquez pourquoi les attributs ne peuvent pas être directement modifiés par une classe cliente
*/
open class Ouvrage(val titre: String, val auteur: String, private val numero: Int) {
    override fun toString() ="num=$numero:$titre:$auteur"
}