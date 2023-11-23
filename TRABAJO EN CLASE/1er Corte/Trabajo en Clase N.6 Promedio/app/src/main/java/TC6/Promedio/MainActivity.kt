package TC6.Promedio

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
import TC6.Promedio.ui.theme.TrabajoEnClaseN6PromedioTheme
import kotlin.math.ceil
import kotlin.math.floor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN6PromedioTheme {
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
    TrabajoEnClaseN6PromedioTheme {
        Greeting("Android")
    }
}


fun main() {
    val promedio = promedio(n3 = 10.0)
    println("Tu promedio es: $promedio")

    val roundedNumber = if (promedio > 6) {
        if (promedio - promedio.toInt() >= 0.5) {
            ceil(promedio)
        } else {
            floor(promedio)
        }
    } else {
        promedio
    }

    println("Número redondeado: $roundedNumber")
}

fun promedio(n1: Double = 8.0, n2: Double = 8.0, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}