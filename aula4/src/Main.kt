//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val p1 = Pessoa("444.444.444-44","tengolengo","tengo@email.sahur")

    println(p1)

    val c1 = Crianca()
    c1.nome = "Jose"
    c1.cpf = "111111111111"
    c1.reuPrimario = false
    c1.dentesDeLeite = 2


    p1.andar()
    c1.andar()


}