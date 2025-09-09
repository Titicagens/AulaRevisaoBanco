package org.example.ui

import org.example.crud.cadastrarCaixa
import org.example.crud.editarCaixa
import org.example.crud.excluirCaixa
import org.example.crud.listarCaixas

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
            2-> editarCaixa()
            3-> listarCaixas()
            4-> excluirCaixa()
            else -> println("Opção inválida!")
        }
    }while (opcao != 0)

}
