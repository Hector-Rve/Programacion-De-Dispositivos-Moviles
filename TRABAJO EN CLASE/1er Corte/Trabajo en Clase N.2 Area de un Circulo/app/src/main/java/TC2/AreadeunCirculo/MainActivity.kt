package TC2.AreadeunCirculo

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
import TC2.AreadeunCirculo.ui.theme.TrabajoEnClaseN2AreaDeUnCirculoTheme
import kotlin.math.pow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN2AreaDeUnCirculoTheme {
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
    TrabajoEnClaseN2AreaDeUnCirculoTheme {
        Greeting("Android")
    }
}

const val Pi = 3.1416F
const val PHI = 1.618f

fun main () {
    val radius = 4f
    val area = circleArea(radius)
    println("EL area del circulo es: $area")
    println(getPi())
    printPHI()
}

fun circleArea(radius:Float): Float{
    return Pi*radius.pow(2)
}

fun getPi(): Float{
    return Pi
}

fun printPHI(){
    println("El numero aureo vale $PHI")
}