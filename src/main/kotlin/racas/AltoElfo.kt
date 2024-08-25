package racas

import Personagem

class AltoElfo :Raca{
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.inteligencia += 1
    }

    override fun nomeRaca(): String {
        return "Alto Elfo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 INT"
    }
}