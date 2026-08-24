package Exercicio

class JogoTab(
    nome: String,
    preco: Double,
    override val pesoEmKg: Double
) : Produto(nome, preco), EntregaFis