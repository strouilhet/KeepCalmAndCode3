class Livre(_titre: String, _auteur: String, _numero: Int, private val nbPages: Int) :Ouvrage(_titre, _auteur, _numero) {

    override fun toString(): String = super.toString() + ": nbpages=${nbPages}"
}
