package racas

import Personagem

class Anao : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 2
    }

    override fun nomeRaca(): String {
        return "Anão"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 CON"
    }
}