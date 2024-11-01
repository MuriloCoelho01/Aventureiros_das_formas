package com.demoday.aventuras_formasproibida

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.demoday.aventuras_formasproibida.ui.theme.Aventuras_FormasProibidaTheme
import java.lang.reflect.Modifier

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
            .padding(top = 220.dp),


    ) {

        Text(
            text = "Olá $nome",
            fontSize = 30.sp,
            color = Color(0xFFFFA62B)
        )

Column(
    modifier = androidx.compose.ui.Modifier
        .padding(top = 60.dp)) {
        Button(
            onClick = {}
        ) { }
    }

    }
}