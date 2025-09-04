package org.example.ui

import org.example.crud.cadastrarCaixa

fun menu(){
    do{
        println("1 - Cadastrar CaixaD'Água")
        println("2 - Editar CaixaD'Água")
        println("3 - Listar CaixaD'Água")
        println("4 - Editar CaixaD'Água")
        println("0 - Sair")

        val opcao = readln().toInt()

        when (opcao){
            1-> cadastrarCaixa()
            2-> println("Editando Caixa...")
            3-> println("Listar Caixas...")
            4-> println("Excluindo Caixa...")
            else -> println("Opção inválida!")
        }
    }while (opcao != 0)

}
