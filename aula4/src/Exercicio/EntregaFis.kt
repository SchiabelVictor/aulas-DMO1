package Exercicio

interface EntregaFis {

        val pesoEmKg: Double

        fun calcularFrete(): Double {
            return pesoEmKg * 5.0 // R$ 5,00 por kg
        }

}