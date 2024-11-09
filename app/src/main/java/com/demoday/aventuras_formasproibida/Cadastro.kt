package com.demoday.aventuras_formasproibida

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme


@Composable
fun Cadastro(navController: NavController) {
    var valor = ""

    var email = remember {
        mutableStateOf("")}

    var text:String by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ),
                contentScale = ContentScale.Crop
            )
            .fillMaxSize()
            .padding(top = 116.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(
                R.drawable.ativo_2_1
            ),
            contentDescription = "Home",
            modifier = Modifier
                .size(100.dp)
        )

        Column(
            modifier = Modifier
                .padding(top = 35.dp)
        ) {
            Text(
                text = "Nome de usuário",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { text = it.toString()},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(0xFFFD2B977)
                )

            )

        }
        Column(
            modifier = Modifier
                .padding(top = 35.dp)
        ) {
            Text(
                text = "E-mail",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { text = it.toString()},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(0xFFFD2B977)
                )

            )

        }
        Column(
            modifier = Modifier
                .padding(top = 35.dp)
        ) {
            Text(
                text = "Senha:",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { text = it.toString()},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(0xFFFD2B977)
                )

            )

        }
        Column(
            modifier = Modifier
                .padding(top = 35.dp)
        ) {
            Text(
                text = "Confirmar senha:",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { text = it.toString()},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(0xFFFD2B977)
                )

            )

        }

        Column(
            modifier = Modifier
                .padding(top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Button(
                onClick = { navController.navigate("enter") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFA62B),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .padding(top = 29.dp)
                    .height(65.dp)
                    .width(294.dp)
            ) {
                Text(
                    text = "Cadastrar",
                    fontSize = 35.sp,
                    color = Color(0xFFFF16697A)
                )
            }
            Text(
                text = "Já possui conta?",
                fontSize = 15.sp,
                color = Color(0xFFFFD2B977)
                )
        }

        Image(
            modifier = Modifier
                .size(200.dp),
            painter = painterResource(R.drawable.nomeapp),
            contentDescription = ""
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Preview1() {
    Aventuras_FormasProibidaTheme {
        Cadastro(rememberNavController())
    }
}