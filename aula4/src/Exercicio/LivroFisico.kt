package Exercicio

class LivroFisico(
    nome: String,
    preco: Double,
    override val pesoEmKg: Double
) : Produto(nome, preco), EntregaFis


