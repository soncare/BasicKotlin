fun main(){
    //Lista inmutable que no se le pueden ni agregar ni quitar elementos
    val listaDeNombre = listOf<String>("Juan","Enrrique","Camila")
    println(listaDeNombre)
    //Lista mutable a la cual le podemos ir agregando o eliminando elementos
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    //agregamos un valor a la lista usando el add
    listaVacia.add("Pedro")
    println(listaVacia)
    //obtenemos un valor de la lista usando el get
    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)
    //obtenemos un valor de la lista usando un operador
    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)
    //obtenemos un valor de la lista usando el operador first
    val primerValor = listaDeNombre.first()
    println(primerValor)
    //En caso de tener dudas si el primer valor es o no nulo se puede usar
    val primerValorNull = listaDeNombre.firstOrNull()
    println(primerValorNull)
    //Eliminamos uno de los valores de la lista mutable
    listaVacia.removeAt(0)
    println(listaVacia)
    //Eliminamos un elemento de la lista condicionado
    listaVacia.add("Carlos")
    println(listaVacia)
    listaVacia.removeIf{caracteres -> caracteres.length > 3}
    println(listaVacia)
    //Para crear array lo podemos hacer de la siguiente manera
    val myArray = arrayOf(1,2,3,4)
    println(myArray)
    println("Array como lista ${myArray.toList()}")
}