package Exercicio

class FilmeDigital(nome: String, preco: Double) : Produto(nome, preco), entregaDig {


    override fun entregar(emailCliente: String): String {
        return "Disponível no player online da plataforma (não enviado por e-mail)."
    }
}