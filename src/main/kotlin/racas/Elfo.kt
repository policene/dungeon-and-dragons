package racas

import Personagem

class Elfo : Raca {

    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 2
    }

    override fun nomeRaca(): String {
        return "Elfo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 DES"
    }
}