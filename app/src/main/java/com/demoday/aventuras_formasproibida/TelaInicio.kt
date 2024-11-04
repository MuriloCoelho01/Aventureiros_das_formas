package com.demoday.aventuras_formasproibida

import android.icu.text.CaseMap.Title
import android.text.style.BackgroundColorSpan
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme

@Composable
fun TelaInicio(navController: NavController) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .paint(
                painter = painterResource(
                    R.drawable.fundo_2
                ),
                contentScale = ContentScale.Crop
            )
            .fillMaxSize()
            .padding(top = 185.dp),


        ) {

    }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState(0))
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .padding(top = 270.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("circulo") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.ellipse_2),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Circulo",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("quadrado") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.rectangle_15),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Quadrado",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("retangulo") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.rectangle_16),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Retângulo",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("triangulo") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.polygon_1),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Triângulo",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("losango") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.losango),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Losango",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("trapezio") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.trapazeio),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Trapézio",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .width(376.dp)
                    .height(87.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0x45FF16697A)),
                onClick = { navController.navigate("paralelogramo") }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp),
                        painter = painterResource(R.drawable.paralelogramo),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                            .padding(18.dp),
                        text = "Área do Paralelogramo",
                        fontSize = 23.sp,
                        color = Color(laranja),
                    )
                }

            }
        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Circulo(navController: NavHostController) {
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
            colors = CardDefaults.cardColors(containerColor = Color(laranja))

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
                    onClick = { navController.navigate("home") }) {
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
                .padding(top = 220.dp)
        ) {
            Row {
                Column {
                Image(
                    painter = painterResource(R.drawable.circuloapa),
                    contentDescription = "Circulo2",
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                )
                Text("ok")
            }

Column(modifier = Modifier
    .padding(start = 50.dp)) {
    Text("ok2")
    Text("ok3")
}
            }
        }
    }
}

@Preview
@Composable
fun Preview4() {
    Aventuras_FormasProibidaTheme {
        TelaInicio(rememberNavController())
    }

}

@Preview
@Composable
private fun Preview5() {
    Aventuras_FormasProibidaTheme {
        Circulo(rememberNavController())
    }
}
