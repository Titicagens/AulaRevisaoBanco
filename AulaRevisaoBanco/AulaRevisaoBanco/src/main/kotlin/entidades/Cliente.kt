package org.example.entidades

import enumeradores.Sexo
import java.math.BigDecimal

class Cliente (
    nome : String,
    cpf : Long,
    sexo : Sexo,
    idade : Int,
    val logradouro : String,
    val telefone : Long,
    val formaPagamento : String,
    val valorServico: BigDecimal
) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
)

