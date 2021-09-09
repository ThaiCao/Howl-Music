import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.looker.ui_player.MiniPlayer
import com.looker.ui_player.Player
import com.looker.ui_player.R

@Preview
@Composable
fun PlayerPreview() {
    Player(
        songName = "Test Name",
        artistName = "Test Artist 1, Test Artist 2",
        albumArt = R.drawable.error_image
    )
}

@Preview(showBackground = true)
@Composable
fun MiniPlayerPreview() {
    MiniPlayer(
        songName = "Name",
        artistName = "Name",
        albumArt = R.drawable.error_image
    )
}