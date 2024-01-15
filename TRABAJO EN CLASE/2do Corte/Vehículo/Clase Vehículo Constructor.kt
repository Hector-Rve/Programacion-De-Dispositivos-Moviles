class Vehiculo constructor(val marca:String, val modelo:String, val color:String = "Negro") {

    var placas=""
    var gasolina=0f
    var encendido=false

    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }

    init{
        println("""Los datos del coche son:
    marca: $marca
    modelo: $modelo
    color: $color""")
    }

    constructor(marca:String, modelo:String, color:String, placas:String): this(marca,modelo,color){
        this.placas = placas
        println("las placas son : ${this.placas}")
    }
}

fun main(){
    val miVehiculo = Vehiculo("Ford","Focus","Verde","REM-4123")
    val golNegro = Vehiculo("Volkswagen","Gol")
    val pointer = Vehiculo(
        color = "Azul",
        marca = "Volkswagen",
        modelo = "Pointer"
    )

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche esta prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene: ${miVehiculo.gasolina}")
}
