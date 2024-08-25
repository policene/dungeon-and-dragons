import criacao_fichas.*
import java.util.Scanner

fun main() {

    var atributos = Atributos()
    var personagem = Personagem("", atributos)
    val scanner = Scanner(System.`in`)



    println("\n" +
            "                                       \n" +
            "                                       \n" +
            "`7MM\"\"\"Yb.    ,gM\"\"bg     `7MM\"\"\"Yb.   \n" +
            "  MM    `Yb.  8MI  ,8       MM    `Yb. \n" +
            "  MM     `Mb   WMp,\"        MM     `Mb \n" +
            "  MM      MM  ,gPMN.  jM\"'  MM      MM \n" +
            "  MM     ,MP ,M.  YMp.M'    MM     ,MP \n" +
            "  MM    ,dP' 8Mp   ,MMp     MM    ,dP' \n" +
            ".JMMmmmdP'   `YMbmm'``MMm..JMMmmmdP'   \n" +
            "                                       \n" +
            "---------------------------------------")

    var resposta : String = ""
    while (resposta != "s"){
        println("\nBem-vindo ao criador de fichas para D&D.\n" +
                "\nPara começar, digite o NOME do personagem: ")

        personagem.nome = scanner.nextLine()
        println("\nO nome do seu personagem é \'${personagem.nome}\', certo? (S/N)")
        resposta = scanner.nextLine().lowercase()
    }



    val seletorRaca = SeletorRaca()
    personagem.raca = seletorRaca.selecionarRaca()


    val distribuicao = DistribuidorPontos()
    distribuicao.distribuidorPadrao(atributos)

    personagem.aplicarBonusRaca()
    personagem.exibirTabelaAtributos()


}



