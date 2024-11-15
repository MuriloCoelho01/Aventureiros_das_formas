package com.demoday.aventuras_formasproibida

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme

@Composable
fun Circulo(navController: NavHostController) {

    var raio by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_circulo = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do círculo é calculada com a fórmula A = π * r²," + " onde r é o raio. Multiplicamos π pelo raio ao quadrado para obter o" + " espaço ocupado pelo círculo.",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 30.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 34.dp, start = 25.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(150.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_circulo,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.circuloapa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(150.dp)
                    )
                }


                Column(
                    modifier = Modifier.padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(value = raio, onValueChange = {
                        raio = it
                    }, label = {
                        Text(
                            "Raio:",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }, colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0xFFFD2B977),
                        focusedContainerColor = Color(0xFFFD2B977)
                    ), keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ), modifier = Modifier
                        .width(150.dp)
                        .fillMaxWidth(), textStyle = TextStyle(
                        fontSize = 16.sp, textAlign = TextAlign.Start
                    ), singleLine = true

                    )
                    Button(
                        onClick = {
                            area =
                                if (raio.isNotEmpty()) Math.PI * raio.toFloat() * raio.toFloat() else 0.0
                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }

}

@Composable
fun Quadrado(navController: NavController) {

    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_quadrado = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                        .padding(start = 17.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "O quadrado é uma figura com quatro lados iguais. Para calcular sua área, " + "multiplica-se o comprimento de um lado por ele mesmo: Área = lado².",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 30.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 34.dp, start = 25.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(150.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_quadrado,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.quadradopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(150.dp)
                    )
                }


                Column(
                    modifier = Modifier.padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(value = lado, onValueChange = {
                        lado = it
                    }, label = {
                        Text(
                            "Lado:",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }, colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0xFFFD2B977),
                        focusedContainerColor = Color(0xFFFD2B977)
                    ), keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ), modifier = Modifier
                        .width(150.dp)
                        .fillMaxWidth(), textStyle = TextStyle(
                        fontSize = 16.sp, textAlign = TextAlign.Start
                    ), singleLine = true

                    )
                    Button(
                        onClick = {
                            area = if (lado.isNotEmpty()) lado.toDouble() * lado.toDouble() else 0.0
                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }

}

@Composable
fun Retangulo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_retangulo = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                    text = "Área do Retângulo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do retângulo é obtida multiplicando a base pela altura. " + "Use a fórmula: Área = base × altura. Simples e eficaz para medir espaços",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 30.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 34.dp, start = 20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(160.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_retangulo,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.retangulopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(width = 160.dp, height = 150.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .width(180.dp)
                        .padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        OutlinedTextField(value = base,
                            onValueChange = {
                                base = it
                            },
                            label = {
                                Text(
                                    "Base:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                        Spacer(
                            modifier = Modifier.padding(start = 15.dp)
                        )

                        OutlinedTextField(value = altura,
                            onValueChange = {
                                altura = it
                            },
                            label = {
                                Text(
                                    "Altura:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }
                    Button(
                        onClick = {
                            area =
                                if (base.isNotEmpty() && altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0

                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }

}

@Composable
fun Triângulo(navController: NavController) {
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var altura by remember { mutableStateOf("") }
    var area_triangulo = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                    text = "Área do Triângulo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do triângulo é calculada pela fórmula: Área = (base × altura)" + " ÷ 2. Basta multiplicar a base pela altura e dividir o resultado por dois.",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 30.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 25.dp, start = 20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 55.dp)
                            .width(160.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_triangulo,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.triangulopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(width = 160.dp, height = 150.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .width(180.dp)
                        .padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        OutlinedTextField(value = base,
                            onValueChange = {
                                base = it
                            },
                            label = {
                                Text(
                                    "Base:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                        Spacer(
                            modifier = Modifier.padding(start = 15.dp)
                        )

                        OutlinedTextField(value = altura,
                            onValueChange = {
                                altura = it
                            },
                            label = {
                                Text(
                                    "Altura:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }
                    Button(
                        onClick = {
                            area =
                                if (base.isNotEmpty() && altura.isNotEmpty()) altura.toDouble() * base.toDouble() / 2 else 0.0

                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }

}

@Composable
fun Losângo(navController: NavController) {
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var altura by remember { mutableStateOf("") }
    var area_losango = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                    text = "Área do Losângo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do losango é calculada pela fórmula: Área = (diagonal maior " + "× diagonal menor) ÷ 2. Multiplica-se as diagonais e divide-se o resultado por dois.",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 25.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 17.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 55.dp)
                            .width(170.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_losango,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.losangopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(width = 170.dp, height = 180.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        OutlinedTextField(value = base,
                            onValueChange = {
                                base = it
                            },
                            label = {
                                Text(
                                    "D.menor:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(80.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                        Spacer(
                            modifier = Modifier.padding(start = 15.dp)
                        )

                        OutlinedTextField(value = altura,
                            onValueChange = {
                                altura = it
                            },
                            label = {
                                Text(
                                    "D.maior:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(80.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }
                    Button(
                        onClick = {
                            area =
                                if (base.isNotEmpty() && altura.isNotEmpty()) altura.toDouble() * base.toDouble() / 2 else 0.0

                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }
}

@Composable
fun Trapézio(navController: NavController) {
    var base1 by remember { mutableStateOf("") }
    var base2 by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var altura by remember { mutableStateOf("") }
    var area_losango = "%.2f".format(area)
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
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
                    text = "Área do Trapézio",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do trapézio é calculada pela fórmula: Área = (base maior + base menor) " + "× altura ÷ 2. Soma as bases, multiplica pela altura e divide por dois.",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 25.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 25.dp, start = 10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 55.dp)
                            .width(160.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_losango,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.trapazeiopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(160.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(start = 20.dp, top = 15.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        OutlinedTextField(value = base1,
                            onValueChange = {
                                base1 = it
                            },
                            label = {
                                Text(
                                    "B.menor:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(80.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                        Spacer(
                            modifier = Modifier.padding(start = 15.dp)
                        )

                        OutlinedTextField(value = base2,
                            onValueChange = {
                                base2 = it
                            },
                            label = {
                                Text(
                                    "B.maior:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(80.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }

                    OutlinedTextField(value = altura,
                        onValueChange = {
                            altura = it
                        },
                        label = {
                            Text(
                                "Altura:",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.White
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFFD2B977),
                            focusedContainerColor = Color(0xFFFD2B977)
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                        modifier = Modifier
                            .width(80.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally),
                        textStyle = TextStyle(
                            fontSize = 14.sp, textAlign = TextAlign.Start
                        ),
                        singleLine = true
                    )
                    Button(
                        onClick = {
                            area =
                                if (base1.isNotEmpty() && altura.isNotEmpty() && base2.isNotEmpty()) (base1.toDouble() + base2.toDouble()) * altura.toDouble() / 2
                                else 0.0


                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


                }

            }
        }

    }
}

@Composable
fun Paralelogramo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(0.0) }
    var area_retangulo = "%.2f".format(area)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.tela_de_fundo
                ), contentScale = ContentScale.Crop

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
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                IconButton(modifier = Modifier.size(40.dp),
                    onClick = { navController.popBackStack() }) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "voltar a tela de inicio"
                    )
                }
                Spacer(
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "Área do Paralelogramo",
                    fontSize = 23.sp,
                    modifier = Modifier
                        .padding(start = 8  .dp)
                        .align(Alignment.CenterVertically)
                )
            }

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 159.dp)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Text(
                text = "A área do paralelogramo é calculada pela fórmula: Área = base × altura." +
                        " Multiplica-se a base pela altura perpendicular para obter o resultado.",
                fontSize = 16.5.sp,
                color = Color(0xFFFD2B977),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 30.dp)
            )

        }
    }
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
                .height(220.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFF16697A))

        ) {
            Row(
                modifier = Modifier.padding(top = 1.dp), verticalAlignment = Alignment.Top


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(top = 20.dp, start = 20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 52.dp)
                            .width(170.dp)
                    ) {
                        Text(
                            text = "Área:",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(laranja),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = area_retangulo,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterHorizontally)

                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.paralelogramopa),
                        contentDescription = "Quadrado",
                        modifier = Modifier.size(170.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .width(180.dp)
                        .padding(start = 30.dp, top = 35.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        OutlinedTextField(value = base,
                            onValueChange = {
                                base = it
                            },
                            label = {
                                Text(
                                    "Base:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                        Spacer(
                            modifier = Modifier.padding(start = 15.dp)
                        )

                        OutlinedTextField(value = altura,
                            onValueChange = {
                                altura = it
                            },
                            label = {
                                Text(
                                    "Altura:",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color(0xFFFD2B977),
                                focusedContainerColor = Color(0xFFFD2B977)
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number
                            ),
                            modifier = Modifier
                                .width(70.dp)
                                .fillMaxWidth(),
                            textStyle = TextStyle(
                                fontSize = 14.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }
                    Button(
                        onClick = {
                            area =
                                if (base.isNotEmpty() && altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0

                        },
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFFA62B), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .height(45.dp)
                            .width(120.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Confirmar",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFF16697A)
                        )
                    }


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

@Preview
@Composable
private fun preview8() {
    Aventuras_FormasProibidaTheme {
        Triângulo(rememberNavController())
    }
}

@Preview
@Composable
private fun preview9() {
    Aventuras_FormasProibidaTheme {
        Losângo(rememberNavController())
    }
}

@Preview
@Composable
private fun preview10() {
    Aventuras_FormasProibidaTheme {
        Trapézio(rememberNavController())
    }
}

@Preview
@Composable
private fun preview11() {
    Aventuras_FormasProibidaTheme {
        Paralelogramo(rememberNavController())
    }
}