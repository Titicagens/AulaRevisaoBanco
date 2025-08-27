package org.example.entidades

import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class Profissional (
    nome : String,
    cpf : Long,
    sexo : Sexo,
    idade : Int,
    val salario : BigDecimal,
    val telefone : Int,
    val função : String,
    val experiencia : String,
    val setor: Setor

) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
) {
    //Comportamentos do Profissonal
    fun instalarCaixaDAgua(clt: Profissional) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional habilitado")
        } else {
            println("Profissional desqualificado")
        }
    }

    override fun receberConta(conta: Conta, aPagar : BigDecimal){
        conta.saldo = conta.saldo.subtract(aPagar)
    }
}