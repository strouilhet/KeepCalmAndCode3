fun main() {
    val bibli = Bibliotheque()

    bibli.ajouterOuvrage(Livre("Le cid", "corneille", 11, 245))
    bibli.ajouterOuvrage(Livre("Cinna", "corneille", 2, 123))
    bibli.ajouterOuvrage(Livre("Polyeucte", "corneille", 3, 145))
    bibli.ajouterOuvrage(Livre("Horace", "corneille", 10, 566))
    bibli.ajouterOuvrage(Livre("Les mains sales", "sartre", 5, 245))
    bibli.ajouterOuvrage(Livre("La nausée", "sartre", 6, 233))
    bibli.ajouterOuvrage(Livre("Huis clos", "sartre", 8, 240))

    bibli.ajouterOuvrage(Disque("the dream of the blue turtle", "sting", 7, 67))
    bibli.ajouterOuvrage(Disque("the soul cages", "sting", 9, 87))
    bibli.ajouterOuvrage(Disque("bring on the night", "sting", 4, 72))
    bibli.ajouterOuvrage(Disque("les copains d'abord", "brassens", 1, 89))

    println("les ouvrages sont : \n$bibli")
    println("les auteurs sont : \n${bibli.auteurs}\n")
    println("nombre de disques = ${bibli.nbDisques}\n")
    println("les titres des ouvrages de Sting sont : ${bibli.getTitres("sting")}")
}