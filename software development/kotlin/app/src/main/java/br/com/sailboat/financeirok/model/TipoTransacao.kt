package br.com.sailboat.financeirok.model

import br.com.sailboat.financeirok.R

enum class TipoTransacao(val titulo: Int, val categorias: Int) {
    RECEITA(R.string.adiciona_receita, R.array.categorias_de_receita),
    DESPESA(R.string.adiciona_despesa, R.array.categorias_de_despesa)
}