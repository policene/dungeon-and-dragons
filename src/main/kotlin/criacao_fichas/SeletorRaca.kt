package criacao_fichas

import racas.*
import java.util.Scanner


class SeletorRaca {

    fun selecionarRaca(): Raca {
        val scanner = Scanner(System.`in`)
        val racas = listOf(
            Humano(), AltoElfo(), Elfo(), ElfoDaFloresta(), Drow(),
            Anao(), AnaoDaColina(), AnaoDaMontanha(),
            Draconato(), Gnomo(), GnomoDaFloresta(), GnomoDasRochas(),
            Halfling(), HalflingPesLeves(), HalflingRobusto(),
            MeioElfo(), MeioOrc(), Tiefling()
        )

        while (true) {
            /* LISTA DE RAÇAS */
            for ((i, raca) in racas.withIndex()) {
                println("${i + 1}. ${raca.nomeRaca()}")
            }

            /* PERGUNTA UM NÚMERO BASEADO NA LISTA */
            println("\nEscolha a raça desejada: ")
            val escolha = scanner.nextInt()

            /* Esse scanner é necessário devido a um problema do Kotlin e Java,
            *  que deixa um /n após o nextInt, então precisamos usar esse nextLine
            *  para limpar o código e evitar que esse caractére seja detectado no
            *  próximo nextLine */
            scanner.nextLine()

            /* VERIFICA SE O NÚMERO ESTÁ NOS PADRÕES DA LISTA
            *  E RETORNA A RAÇA RELACIONADA AO NÚMERO.  */
            if (escolha in 1..racas.size) {
                println(
                    "\nDeseja escolher a raça ${racas[escolha - 1].nomeRaca().lowercase()}? (S/N) \n" +
                            racas[escolha - 1].exibirBonus()
                )
                val resposta = scanner.nextLine().lowercase()

                /* PERGUNTA SE O USUÁRIO DESEJA PROSSEGUIR COM A RAÇA ESCOLHIDA */
                if (resposta == "s") {
                    return racas[escolha - 1]
                } else {
                    println("\n")
                }
            } else {
                println("Escolha inválida.")
            }
        }
    }

    fun distribuirPontos(){
        var pontosDisponiveis: Int = 27
    }


}