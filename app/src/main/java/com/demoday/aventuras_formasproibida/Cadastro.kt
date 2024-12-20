package com.demoday.aventuras_formasproibida

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cadastro(navController: NavController) {

    var senha by remember { mutableStateOf("") }
    var nome_usuario by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var confirmpassoword by remember { mutableStateOf("") }



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

            OutlinedTextField(
                value = nome_usuario,
                onValueChange = { newText -> nome_usuario = newText },
                label = {
                    Text(
                        "Nome de Usuário",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                    )
                },
                modifier = Modifier
                    .height(70.dp)
                    .width(342.dp),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFD2B977),
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )

        }
        Column(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {

            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = { Text("E-mail", fontSize = 16.sp, fontWeight = FontWeight.Medium) },
                modifier = Modifier

                    .height(70.dp)
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

        }
        Column(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = {
                    Text(
                        "Senha",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium

                    )
                },
                modifier = Modifier
                    .height(70.dp)
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

        }
        Column(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {

            OutlinedTextField(
                value = confirmpassoword,
                onValueChange = { newText -> confirmpassoword = newText },
                label = {
                    Text(
                        "Confirmar Senha",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                modifier = Modifier
                    .height(70.dp)
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
                color = Color(0xFFFFD2B977),
                modifier = Modifier
                    .clickable { navController.navigate("enter") }
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