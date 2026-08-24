package Exercicio

class JogoDig(
    nome: String,
    preco: Double
) : Produto(nome, preco), entregaDig {
    override fun entregar(emailCliente: String): String {
        return "Jogo digital enviado para o e-mail: $emailCliente"
    }
}