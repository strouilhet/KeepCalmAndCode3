class Bibliotheque {
    private val lesOuvrages: MutableList<Ouvrage> = mutableListOf()

    val auteurs: MutableList<String> = mutableListOf()
        get() {
            for (ouv in lesOuvrages) {
                field.add(ouv.auteur)
            }
            return field
        }

    val nbDisques: Int
        get() {
            var res = 0
            for (ouv in lesOuvrages) {
                if (ouv is Disque) {
                    res++
                }
            }
            return res
        }

    /**
     * ajouter un ouvrage à la bibliothèque
     * @param ouv
     */
    fun ajouterOuvrage(ouv: Ouvrage) {
        lesOuvrages.add(ouv)
    }

    /**
     * retourner les titres des ouvrages d'un auteur
     * @param auteur
     * @return les titres de l'auteur demandé
     */
    fun getTitres(auteur: String): MutableList<String> {
        val liste:MutableList<String> = mutableListOf()

        for (ouv in lesOuvrages) {
            if (ouv.auteur == auteur)
                liste.add(ouv.titre)
        }
        return liste
    }

    override fun toString(): String {
        var desc=""
        for (ouv in lesOuvrages) desc+= "${ouv.toString()} \n"
        return desc
    }
}