package TC7.RepeticiondeNombres

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
import TC7.RepeticiondeNombres.ui.theme.TrabajoEnClaseN7RepeticionDeNombresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN7RepeticionDeNombresTheme {
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
    TrabajoEnClaseN7RepeticionDeNombresTheme {
        Greeting("Android")
    }
}

val nombres = listOf("Pedro", "Juan", "Maria", "Romero", "Ernesto", "Juan", "Ariadna", "Mireya", "Ana", "Jose Delgado Riivera alias tu abueito")
val nombreBuscar= "Juan"

fun main(){
    fun contarRepeticiones(nombre:String, listaNombres: List<String>): Int{
        var contador=0
        for (nombreActual in listaNombres){
            if (nombreActual==nombre){
                contador++
            }
        }
        return contador
    }
    val repeticiones=contarRepeticiones(nombreBuscar,nombres)
    println("El nombre '$nombreBuscar' se repite $repeticiones veces en la lista.")
}