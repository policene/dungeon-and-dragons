package racas

import Personagem

class AnaoDaMontanha : Raca{
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.forca += 2
    }

    override fun nomeRaca(): String {
        return "Anão da Montanha"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 FOR"
    }
}