import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app1.Models.Info
import com.example.app1.R
import com.example.app1.Repository.AllDetails
import com.example.app1.ui.theme.ColorWhite


@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String = "",
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .width(80.dp)
            .height(80.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
    ) {
        Image(painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun CustomItem(data: Info){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            ImageCard(painterResource(id = data.pic))
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = data.heading,
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = data.desc,
                    fontSize = MaterialTheme.typography.body1.fontSize,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
        FloatingActionButton(
            onClick = {},
            backgroundColor = Color.Black,
            contentColor = ColorWhite,
        ) {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    }
}

@Preview
@Composable
fun PreviewRow(){
    val repo = AllDetails()
    val getList = repo.getAllDetails()
    CustomItem(getList[0])
}