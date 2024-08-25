package racas

import Personagem

class AnaoDaColina : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.sabedoria += 1
    }

    override fun nomeRaca(): String {
        return "Anão da Colina"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 SAB"
    }
}