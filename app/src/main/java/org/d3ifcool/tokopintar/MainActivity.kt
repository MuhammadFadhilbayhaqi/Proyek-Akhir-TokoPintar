package org.d3ifcool.tokopintar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.d3ifcool.tokopintar.navigation.NavGraph
import org.d3ifcool.tokopintar.ui.screen.dashboard.HomeScreen
import org.d3ifcool.tokopintar.ui.theme.TokoPintarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TokoPintarTheme(darkTheme = false) {
                NavGraph()
            }
        }
    }
}
