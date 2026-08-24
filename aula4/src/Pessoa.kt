open class Pessoa {
    var cpf: String = ""
    var nome: String= ""
    var email: String= ""

    constructor(cpf: String, nome: String, email: String) {
        this.cpf = cpf
        this.nome = nome
        this.email = email
    }


    constructor(){

    }

    open fun andar(){
        println("Andando...")
    }


    override fun toString(): String {
        return "Pessoa(cpf='$cpf', nome='$nome', email='$email')"
    }


}