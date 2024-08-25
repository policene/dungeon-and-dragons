package racas

import Personagem

class Gnomo : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.inteligencia += 2
    }

    override fun nomeRaca(): String {
        return "Gnomo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 INT"
    }
}