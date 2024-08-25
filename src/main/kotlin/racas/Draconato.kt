package racas

import Personagem

class Draconato : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.forca += 2
        personagem.atributos.carisma += 1
    }

    override fun nomeRaca(): String {
        return "Draconato"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 FOR, +1 CAR"
    }


}