package org.example.entidades

import enumeradores.Sexo
import java.math.BigDecimal

open class Pessoa (
    val nome : String,
    val cpf : Long,
    val sexo : Sexo,
    val idade : Int
)

{
    open fun receberConta(conta: Conta, aReceber : BigDecimal) {
        conta.saldo = conta.saldo.add(aReceber)
    }
}
