fun main() {
//    val persona1 = Persona(68.7, 1.67)
//    val persona2 = Persona( "Benjamín",72.0, 1.72,)
//    val persona3 = Persona("Amancio", 120.0, 1.99)
//
//    println(persona1)
//    println(persona2)
//    println(persona3)
//    while (true) {
//        println("Introduce el nombre de la persona 1: ")
//        val nombre = readln()
//        if (nombre.isNotBlank()) {
//            persona1.nombre = nombre
//            break
//        }else{
//            print("Vuelve a intentarlo.")
//
//        }
//    }
//    println("${persona1.nombre} tiene un peso de ${persona1.peso}kg y una altura de ${persona1.altura}m")
//
//    println("Pesa ${persona3.peso}, mide ${persona3.altura} y tiene un IMC de ${persona3.calcularImc()}")
//    println("Introduce la altura de la persona 3: ")
//    val altura = readln().toDouble()
//    persona3.altura = altura
//    println("Pesa ${persona3.peso}, mide ${persona3.altura} y tiene un IMC de ${persona3.calcularImc()}")
//
//    persona2.altura = persona3.altura
//    println(persona2)
//    println(persona3)
val personas = listOf (
    Persona("Antonio", 68.7, 1.67),
    Persona("Benjamín",72.0, 1.72,),
    Persona("Amancio", 120.0, 1.99),
    Persona("David", 68.7, 1.67),
    Persona("Muriel", 72.0, 1.72,),
    Persona("Jazmín", 120.0, 1.99)
    )

    for (persona in personas){
        println(persona.obtenerDesc())
    }
}