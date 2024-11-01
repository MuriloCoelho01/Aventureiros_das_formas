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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.navigation.compose.rememberNavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme


var nome ="Murilo Coelho"
@Composable
fun Entrar(navController:NavController) {
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
                .padding(top = 146.dp)
        ) {
            Text(
                text = "E-mail/usuário:",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            TextField(
                modifier = Modifier
                    .padding()
                    .height(31.dp)
                    .width(342.dp), shape = RoundedCornerShape(25.dp),
                value = "", onValueChange = { nome},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0xFFFD2B977)
                )
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 63.dp)
        ) {
            Text(
                text = "Senha:",
                fontSize = 20.sp,
                color = Color(0xFFFFD2B977)
            )
            TextField(
                modifier = Modifier
                    .padding()
                    .height(31.dp)
                    .width(342.dp), shape = RoundedCornerShape(25.dp),
                value = "", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0xFFFD2B977)
                )
            )
        }

        Button(
            onClick = { navController.navigate("home")  },
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

