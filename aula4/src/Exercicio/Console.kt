package Exercicio

class Console(
    nome: String,
    preco: Double,
    override val pesoEmKg: Double
) : Produto(nome, preco), EntregaFis