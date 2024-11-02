package com.demoday.aventuras_formasproibida


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aventuras_FormasProibidaTheme {
                Inicio()
            }
        }
    }
}
val laranja = 0xFFFFA62B
val azul = 0xFFFF16697A

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inicio() {


    val navController = rememberNavController()

    Scaffold(

        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                NavHost(navController = navController, startDestination = "login") {
                    composable("Login") { Login(navController, innerPadding) }
                    composable("cadastro") { Cadastro(navController) }
                    composable("enter") { Entrar(navController) }
                    composable("home") { TelaInicio(navController) }


                }
            }
        },

        )
}


@Composable
fun Login(navController: NavController, innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ),
                contentScale = ContentScale.Crop
            )
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(R.drawable.ativo_2_1),
            contentDescription = "ok",
            Modifier.size(180.dp)
        )

        Button(

            modifier = Modifier
                .padding(top = 29.dp)
                .height(65.dp)
                .width(294.dp),

            onClick = { navController.navigate("enter") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(laranja),
                contentColor = Color.White
            ),
        ) {
            Text(
                text = "Login",
                fontSize = 40.sp,
                color = Color(azul))
        }

        Button(

            modifier = Modifier
                .padding(top = 29.dp)
                .height(65.dp)
                .width(294.dp),

            onClick = { navController.navigate("cadastro") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(laranja),
                contentColor = Color.White
            ),

        ) {
            Text(

                text = "Cadastrar",
                fontSize = 40.sp,
                color = Color(azul))
        }

        }
    }











@Preview(showBackground = true)
@Composable
fun Preview() {
    Aventuras_FormasProibidaTheme {
        Inicio()
    }
}