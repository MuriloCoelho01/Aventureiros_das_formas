package com.demoday.aventuras_formasproibida

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme


var nome = "Murilo Coelho"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Entrar(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

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
                .padding(top = 140.dp)
        ) {

            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = { Text("Nome de usuário / Email", fontSize = 16.sp, fontWeight = FontWeight.Medium) },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .padding(top = 12.dp)
                    .height(56.dp)
                    .width(342.dp),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFD2B977)
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )


            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = { Text("Senha", fontSize = 16.sp, fontWeight = FontWeight.Medium) },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector1),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                            .clickable {  }
                    )
                },
                modifier = Modifier
                    .padding(top = 12.dp)
                    .height(56.dp)
                    .width(342.dp),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFD2B977)
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )
            Text("Esqueci a senha",
                fontSize = 15.sp,
                color = Color(0xFFFFD2B977),
                modifier = Modifier
                    .padding(top = 5.dp, start = 10.dp)
                    .clickable { navController.navigate("enter") }
            )

        }
        Button(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFA62B),
                contentColor = Color.White
            ),
            modifier = Modifier
                .padding(top = 90.dp)
                .height(65.dp)
                .width(294.dp)
        ) {
            Text(
                text = "Confirmar",
                fontSize = 35.sp,
                color = Color(0xFFFF16697A)
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

@Preview
@Composable
fun Preview3() {
    Aventuras_FormasProibidaTheme {
        Entrar(rememberNavController())
    }

}

