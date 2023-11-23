package TC4.AreadeunRectangulo

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
import TC4.AreadeunRectangulo.ui.theme.TrabajoEnClaseN4AreaDeUnRectanguloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN4AreaDeUnRectanguloTheme {
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
    TrabajoEnClaseN4AreaDeUnRectanguloTheme {
        Greeting("Android")
    }
}

fun main() {

    println("Area con valores por defecto: ${rectangleArea()}")
    println("Area con valores por defecto: ${rectangleArea(10.0)}")
    println("Area con valores por defecto: ${rectangleArea(altura = 10.0)}")
    println("Area con datos determinados con named arguments: ${rectangleArea(altura = 2.0, base = 3.5, ancho = 4.0)}")
}

fun rectangleArea(base:Double = 20.0, altura: Double = 30.0, ancho: Double = 10.0):Double{
    return base*altura*ancho
}