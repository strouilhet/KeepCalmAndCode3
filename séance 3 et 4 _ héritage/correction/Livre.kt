/* question :
    dans une classe cliente, peut-on écrire Livre l1=Livre("Quart Livre", "Rabelais")
    Pourquoi, que faudrait-il ajouter pour que cela devienne possible ?
*/
class Livre(_titre: String, _auteur: String, _numero: Int, private val nbPages: Int) :Ouvrage(_titre, _auteur, _numero) {

    override fun toString(): String = super.toString() + ": nbpages=${nbPages}"
}
