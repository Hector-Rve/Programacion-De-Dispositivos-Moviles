package TC3.Login

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
import TC3.Login.ui.theme.TrabajoEnClaseN3LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoEnClaseN3LoginTheme {
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
    TrabajoEnClaseN3LoginTheme {
        Greeting("Android")
    }
}

fun login(user: String, password: String) : Boolean {
    fun validate(input: String) : Boolean{
        if (input.isEmpty()) {
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)
    return userValidated && passValidated
}

fun main() {
    val userValidated = login("Juanito","Navaja")
    println("Usuario loggeado? $userValidated")
}