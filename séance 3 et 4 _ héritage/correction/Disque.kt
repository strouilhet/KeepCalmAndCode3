class Disque(_titre: String, _auteur: String, _numero: Int, private val duree: Int) : Ouvrage(_titre, _auteur, _numero) {

    override fun toString(): String = super.toString() + ":duree=${this.duree}"
}
