package org.example.entidades

import java.math.BigDecimal

class Conta (
    val numeroConta : Long,
    val titular: Pessoa,
    var saldo : BigDecimal,
    var receber : BigDecimal,
    var saque : Double,
    val agencia : Int
);