class Persona(val peso: Double, var altura: Double) {
    var nombre: String = "PersonaX"

    fun calcularImc() : Double = peso/(altura * altura)

    fun saludar(): String = "$nombre saluda."

    fun alturaEncimaMedia(): Boolean = altura >= 1.75

    fun pesoEncimaMedia(): Boolean = peso >= 70

    fun obtenerDescImc(): String{
        return when{
            calcularImc() < 18.5 -> "peso insuficiente"
            calcularImc() in 18.5..24.9 -> "peso saludable"
            calcularImc() in 24.9..29.9 -> "sobrepeso"
            calcularImc() >= 30.0 -> "obesidad"
            else -> "ERROR"

        }
    }


    fun obtenerDesc(): String{
        val imcDesc = obtenerDescImc()
        val imcValor = calcularImc()
        return "${saludar()} $nombre con una altura de ${altura}m (${if (alturaEncimaMedia()) "encima de la media" else "debajo de la media"}) y un peso de ${peso}kg (${if(pesoEncimaMedia()) "encima de la media" else "debajo de la media"}) tiene un IMC de ${"%.2f".format(imcValor)}($imcDesc)"
    }

    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$nombre, con peso $peso y altura $altura, tiene un IMC de ${calcularImc()}"
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Persona) return false
        return this.nombre == other.nombre && this.peso == other.peso && this.altura == other.altura
    }
}