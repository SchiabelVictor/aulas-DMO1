package Exercicio

import Pedido

fun main() {
    val cliente = Cliente("Victor Silva", "victor@email.com")
    val pedido = Pedido(cliente, percentualDesconto = 10.0)

    pedido.adicionarProduto(LivroFisico("Clean Code", 85.0, 0.6))
    pedido.adicionarProduto(LivroDig("Kotlin em Ação", 45.0))
    pedido.adicionarProduto(Console("PlayStation 5", 3800.0, 4.5))
    pedido.adicionarProduto(FilmeDigital("Interestelar", 29.90))
    pedido.adicionarProduto(JogoDig("Cyberpunk 2077", 199.90))

    pedido.exibirResumo()
}