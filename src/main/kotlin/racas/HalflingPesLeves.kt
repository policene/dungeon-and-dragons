package racas

import Personagem

class HalflingPesLeves : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.carisma += 1
    }

    override fun nomeRaca(): String {
        return "Halfling Pés-Leves"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 CAR"
    }

}