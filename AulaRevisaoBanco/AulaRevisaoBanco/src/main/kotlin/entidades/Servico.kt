package org.example.entidades

import enumeradores.Ferramentas

class Servico (
    val ferramentas : Ferramentas,
    val profissional: Profissional,
    val valorInstalador : Double,
    val locomocao : String,
    val descricao : String,
    val limpeza : String,
    val equipamento : String,
    val qualidadeServico : String,
    val valorFrete : Double
)