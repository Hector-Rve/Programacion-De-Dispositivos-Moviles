package TC9.Vehiculo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import TC9.Vehiculo.ui.theme.TrabajoEnClaseN9VehiculoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN9VehiculoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrabajoEnClaseN9VehiculoTheme {
        Greeting("Android")
    }
}

class `Vehiculo` {
    var color=""
    var marca=""
    var modelo=""
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
}

fun main(){
    val miVehiculo = `Vehiculo`()
    miVehiculo.color="verde"
    miVehiculo.marca="Vs Marca"
    miVehiculo.modelo="Focus"
    miVehiculo.placas="REM-4123"

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche esta prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene: ${miVehiculo.gasolina}")
}