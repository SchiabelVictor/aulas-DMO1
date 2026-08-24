class Crianca: Pessoa(), SerVivo {


    override var temCoracao: Boolean = true
    override var categoria: String = "Onivoro"
    override var habitat: String = "END City"
    var dentesDeLeite: Int = 0
    var reuPrimario: Boolean= true

    override  fun andar(){
        println("Engatinhando...")
    }

    override fun som() {
        println("buaaa...")
    }

    override fun respirar() {
        println("respiree")
    }

    override fun mover() {
        println("o bixin anda fi")
    }
}

