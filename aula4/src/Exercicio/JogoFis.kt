package Exercicio

class JogoFis(
    nome: String,
    preco: Double,
    override val pesoEmKg: Double
) : Produto(nome, preco), EntregaFis