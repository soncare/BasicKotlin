//Constantes en kotlin la diferencia principal es que se debe crear fuera de las funciones
const val PI = 3.1416
fun main() {
    //Variables que pueden cambiar su valor
    var Dinero : Int = 10
    println(Dinero)
    Dinero = 5
    println(Dinero)

    //Variables que no pueden cambiar su valor ya que se manejan como objetos
    val edad : Int = 32
    println(edad)
    println(edad.minus(15))
    println(PI)
}