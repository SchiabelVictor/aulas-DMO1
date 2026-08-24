import Exercicio.Cliente
import Exercicio.EntregaFis
import Exercicio.Produto
import Exercicio.entregaDig

class Pedido(
    val cliente: Cliente,
    val itens: MutableList<Produto> = mutableListOf(),
    var percentualDesconto: Double = 0.0
) {
    fun adicionarProduto(produto: Produto) {
        itens.add(produto)
    }

    fun calcularSubtotal(): Double {
        return itens.sumOf { it.preco }
    }

    fun calcularFreteTotal(): Double {
        return itens.filterIsInstance<EntregaFis>().sumOf { it.calcularFrete() }
    }

    fun calcularValorDesconto(): Double {
        return calcularSubtotal() * (percentualDesconto / 100.0)
    }

    fun calcularValorFinal(): Double {
        return (calcularSubtotal() - calcularValorDesconto()) + calcularFreteTotal()
    }

    fun exibirResumo() {
        println("========== RESUMO DO PEDIDO ==========")
        println("Cliente: ${cliente.nome} (${cliente.email})")
        println("\nItens Adquiridos:")

        itens.forEach { item ->
            val detalhes = when (item) {
                is EntregaFis -> "(Físico - Peso: ${item.pesoEmKg}kg | Frete: R$ ${item.calcularFrete()})"
                is entregaDig -> "(Digital - ${item.entregar(cliente.email)})"
                else -> ""
            }
            println("- ${item.nome}: R$ ${item.preco} $detalhes")
        }

        val subtotal = calcularSubtotal()
        val frete = calcularFreteTotal()
        val desconto = calcularValorDesconto()
        val total = calcularValorFinal()

        println("\n--------------------------------------")
        println("Subtotal: R$ $subtotal")
        if (percentualDesconto > 0) {
            println("Desconto (${percentualDesconto.toInt()}%): -R$ $desconto")
        }
        println("Frete Total: R$ $frete")
        println("VALOR FINAL: R$ $total")
        println("======================================\n")
    }
}