package com.demoday.aventuras_formasproibida

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme

@Composable
fun Circulo(navController: NavHostController) {
    var rememberMe by remember { mutableStateOf(false)}

        var raio by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ),
                contentScale = ContentScale.Crop

            )
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .padding(top = 17.dp),
            colors = CardDefaults.cardColors(containerColor = Color(laranja)),
            elevation = CardDefaults.cardElevation(15.dp)

        ) {
            Row(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(
                    modifier = Modifier
                        .size(40.dp),
                    onClick = { navController.popBackStack() }) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "voltar a tela de inicio"
                    )
                }
                Spacer(
                    modifier = Modifier.padding(20.dp)
                )
                Text(
                    text = "Área do Circulo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 22.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 275.dp)
                .height(260.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier =  Modifier
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.Top

            ) {
                Column(
                    modifier = Modifier
                        .padding(30.dp)
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.circuloapa),
                        contentDescription = "Circulo2",
                        modifier = Modifier
                            .size(110.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.espa_odecalculo),
                        contentDescription = "Espaço Calculo")
                    Text(text = "Área: $area",
                        fontSize = 17.sp)
                }

                Column(modifier = Modifier
                    .padding(start = 60.dp)
                    .padding(top = 45.dp)
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "Valor do Raio:",
                        fontSize = 20.sp,
                        color = Color(0xFFFD2B977)
                    )
                    OutlinedTextField(
                        value = raio,
                        onValueChange = {raio = it
                            area = if (raio.isNotEmpty()) Math.PI * raio.toDouble() * raio.toDouble() else 0.0
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFFD2B977)
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        modifier = Modifier
                            .padding(end = 35.dp)
                            .fillMaxWidth()

                    )


                }

            }
        }
    }
}

@Composable
fun Quadrado(navController: NavController) {

    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ),
                contentScale = ContentScale.Crop

            )
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .padding(top = 17.dp),
            colors = CardDefaults.cardColors(containerColor = Color(laranja)),
            elevation = CardDefaults.cardElevation(15.dp)

        ) {
            Row(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(
                    modifier = Modifier
                        .size(40.dp),
                    onClick = { navController.popBackStack() }) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "voltar a tela de inicio"
                    )
                }
                Spacer(
                    modifier = Modifier.padding(20.dp)
                )
                Text(
                    text = "Área do Quadrado",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 22.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 275.dp)
                .height(260.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier =  Modifier
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.Top

            ) {
                Column(
                    modifier = Modifier
                        .padding(30.dp)
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.quadradopa),
                        contentDescription = "Quadrado2",
                        modifier = Modifier
                            .size(100.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.espa_odecalculo),
                        contentDescription = "Espaço Calculo")
                    Text(text = "Área: $area",
                        fontSize = 17.sp)
                }

                Column(modifier = Modifier
                    .padding(start = 60.dp)
                    .padding(top = 45.dp)
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "Valor do Lado:",
                        fontSize = 20.sp,
                        color = Color(0xFFFD2B977)
                    )

                    OutlinedTextField(
                        value = lado,
                        onValueChange = {lado = it
                            area = if (lado.isNotEmpty()) lado.toDouble() * lado.toDouble() else 0.0
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFFD2B977)
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        modifier = Modifier
                            .padding(end = 35.dp)
                            .fillMaxWidth()

                    )


                }
            }
        }
    }

}

@Composable
fun Retangulo(navController: NavController) {

    var raio by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ),
                contentScale = ContentScale.Crop

            )
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .padding(top = 17.dp),
            colors = CardDefaults.cardColors(containerColor = Color(laranja)),
            elevation = CardDefaults.cardElevation(15.dp)

        ) {
            Row(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(
                    modifier = Modifier
                        .size(40.dp),
                    onClick = { navController.popBackStack() }) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "voltar a tela de inicio"
                    )
                }
                Spacer(
                    modifier = Modifier.padding(20.dp)
                )
                Text(
                    text = "Área do Retangulo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 22.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 275.dp)
                .height(260.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier =  Modifier
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.Top

            ) {
                Column(
                    modifier = Modifier
                        .padding(30.dp)
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.retangulopa),
                        contentDescription = "retangulo",
                        modifier = Modifier
                            .size(95.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.espa_odecalculo),
                        contentDescription = "Espaço Calculo")
                    Text(text = "Área: $area",
                        fontSize = 17.sp)
                }

                Column(modifier = Modifier
                    .padding(start = 60.dp)
                    .padding(top = 25.dp)
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "Valor da Base:",
                        fontSize = 20.sp,
                        color = Color(0xFFFD2B977)
                    )

                    OutlinedTextField(
                        value = raio,
                        onValueChange = {raio = it
                            area = if (raio.isNotEmpty()) Math.PI * raio.toDouble() * raio.toDouble() else 0.0
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFFD2B977)
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        modifier = Modifier
                            .padding(end = 35.dp)
                            .fillMaxWidth()

                    )
                    Spacer(modifier = Modifier
                        .padding(10.dp))
                    Text(text = "Valor da Altura:",
                        fontSize = 20.sp,
                        color = Color(0xFFFD2B977)
                    )

                    OutlinedTextField(
                        value = raio,
                        onValueChange = {raio = it
                            area = if (raio.isNotEmpty()) Math.PI * raio.toDouble() * raio.toDouble() else 0.0
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFFD2B977)
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        modifier = Modifier
                            .padding(end = 35.dp)
                            .fillMaxWidth()

                    )


                }

            }
        }
    }

}

@Preview
@Composable
private fun Preview5() {
    Aventuras_FormasProibidaTheme {
        Circulo(rememberNavController())
    }
}

@Preview
@Composable
private fun Preview6() {
    Aventuras_FormasProibidaTheme {
        Quadrado(rememberNavController())
    }
}

@Preview
@Composable
private fun Prview7() {
    Aventuras_FormasProibidaTheme {
        Retangulo(rememberNavController())
    }
}