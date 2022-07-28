package com.example.app1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1.ui.theme.*

@Composable
fun Login(){
    App1Theme{
        Surface(
            color = Color.Transparent,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color2, Color1),
                    )
                ),
            contentColor = ColorWhite,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(horizontal = 24.dp)
            ) {
                var text by rememberSaveable{
                    mutableStateOf("")
                }
                var password by rememberSaveable{
                    mutableStateOf("")
                }
                var isPasswordVisible by rememberSaveable{
                    mutableStateOf(false)
                }

                val visiblityIcon = if(isPasswordVisible)
                    Icons.Filled.Visibility
                else
                    Icons.Filled.VisibilityOff

                val desc = if(isPasswordVisible) "Hide Password" else "Show Password"

                Text(text = "Sign In",
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    fontWeight = FontWeight.ExtraBold
                )
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it},
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text("Login")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = ColorWhite,
                        unfocusedBorderColor = Color.Transparent,
                        backgroundColor = TransparentWhite,
                        focusedLabelColor = ColorWhite,
                        unfocusedLabelColor = TransparentGrey,

                    )
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text("Password")
                    },
                    trailingIcon = {
                        IconButton(onClick = {
                            isPasswordVisible  = !isPasswordVisible
                        }) {
                            Icon(
                                imageVector = visiblityIcon,
                                contentDescription = desc,
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = ColorWhite,
                        unfocusedBorderColor = Color.Transparent,
                        backgroundColor = TransparentWhite,
                        trailingIconColor = TransparentGrey,
                        focusedLabelColor = ColorWhite,
                        unfocusedLabelColor = TransparentGrey
                    ),
                    visualTransformation = if (isPasswordVisible)
                        VisualTransformation.None else PasswordVisualTransformation(),
                )
                Button(onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = TransparentWhite2,
                    )
                ) {
                    Text(
                        text = "Sign In",
                        fontSize = MaterialTheme.typography.h5.fontSize,
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text("Forgot your Password?")
                    Text("Sign Up",
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }

        }
    }
}


@Preview
@Composable
fun previewFun(){
    Login()
}