package Exercicio

    class LivroDig(
        nome: String,
        preco: Double
    ) : Produto(nome, preco), entregaDig {
        override fun entregar(emailCliente: String): String {
            return "Livro digital enviado para o e-mail: $emailCliente"
        }
    }
