package sheridan.bajajku.flowershop.ui.flower_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sheridan.bajajku.flowershop.domain.Flower
import coil.compose.AsyncImage


@Composable
fun ListBody(
    flowerList: List<Flower>,
    modifier: Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp, horizontal = 16.dp
        ), modifier = modifier
    ) {
        items(flowerList) { flower ->
            FlowerListItem(flower)
        }
    }

}

@Composable

fun FlowerListItem(flower: Flower) {
    var visible by remember {
        mutableStateOf(false)
    }
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray, //Card background color
            contentColor = Color.White  //Card content color,e.g.text
        )
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ){
            AsyncImage(
                model = "file:///android_asset/${flower.image}",
                contentDescription = "${flower.id} ${flower.label}"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = flower.label,
                        fontSize = 22.sp,
                        color = Color.Cyan,
                        fontWeight = FontWeight.Bold                    )
                }
                Text(text = "${flower.price}$", fontSize = 16.sp)
                Text("Show/Hide Description", modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        visible = !visible
                    }
                )
                if(visible) {
                    Text(text = "${flower.description}")
                }

            }
        }
    }
}
