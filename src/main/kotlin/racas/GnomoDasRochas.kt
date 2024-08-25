package racas

import Personagem

class GnomoDasRochas : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Gnomo das Rochas"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 CON"
    }
}