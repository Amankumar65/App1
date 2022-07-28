package com.example.app1.Repository

import androidx.compose.ui.res.painterResource
import com.example.app1.Models.Info
import com.example.app1.R

class AllDetails {
    fun getAllDetails(): List<Info>{
        return listOf(
            Info(
                heading = "Ferrari",
                desc = "Super Car",
                pic = R.drawable.p1
            ),
            Info(
                heading = "McLaren",
                desc = "Sports car",
                pic = R.drawable.p2
            ),
            Info(
                heading = "Ford Mustang",
                desc = "Muscle Car",
                pic = R.drawable.p3
            ),
            Info(
                heading = "Chervolette",
                desc = "Super Car",
                pic = R.drawable.p4
            ),
            Info(
                heading = "Porsche",
                desc = "Super Fast Car",
                pic = R.drawable.p5
            ),
            Info(
                heading = "Ferrari",
                desc = "Super Fast Model Car",
                pic = R.drawable.p6
            ),
            Info(
                heading = "Lamborghini",
                desc = "Super Stylish Car",
                pic = R.drawable.p7
            ),
            Info(
                heading = "BMW",
                desc = "Classic Car",
                pic = R.drawable.p8
            ),
            Info(
                heading = "Audi",
                desc = "Heavy Car",
                pic = R.drawable.p9
            )
        )
    }
}