package org.example.crud

import entidades.CaixaDAgua
import enumeradores.Material

fun criarTabelaCaixa(){
    val conectar = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/aula",
        usuario = "postgres",
        senha = "postgres"
    )
    conectar.conectarComBanco()
    /*
    *  val material: Material,
    val capacidade: Int,
    val cor: String,
    val peso: Double,
    val preco: Double,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val marca: String,*/
    //coloque o nome da tabela o mesmo nome da entidade
    val sql = " CREATE TABLE IF NOT EXISTS CaixaDAgua " +
            " (id serial NOT NULL PRIMARY KEY," +
            " material varchar(255)," +
            " capacidade integer," +
            " cor varchar(255)," +
            " peso float," +
            " preco varchar(255)," +
            " altura float," +
            " profundidade float," +
            " largura float," +
            " marca varchar(255)" +
            ")"
    val banco = conectar.conectarComBanco()
    val enviarParaBanco = banco!!.createStatement().execute(sql)
    println(enviarParaBanco)

    banco.close()

}

fun cadastrarCaixa(){
    /*
    *val material: Material,
    val capidade: Int,
    val cor: String,
    val peso: Double,
    val preco: Double,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val marca: String,
     */
    println("Digite o material do qual a caixa é composta")
    println("1 - Plástico")
    println("1 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")

    val opcao = readln().toInt()
    var material : Material
    when (opcao) {
        1 -> material = Material.PVC
        2 -> material = Material.PLÁSTICO
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
        else -> material = Material.PLÁSTICO
    }

    println("Digite a capacidade da caixa")
    val capacidade = readln().toInt()

    println("Digite a cor da caixa")
    val cor = readln().toString()

    println("Digite a peso da caixa")
    val peso  = readln().toDouble()

    println("Digite a preço da caixa")
    val preco = readln().toDouble()

    println("Digite a altura da caixa")
    val altura = readln().toDouble()

    println("Digite a profundidade da caixa")
    val profundidade = readln().toDouble()

    println("Digite a largura da caixa")
    val largura = readln().toDouble()

    println("Digite a marca da caixa")
    val marca = readln().toString()

//    Salvar váriaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,
        marca = marca
    )

}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}