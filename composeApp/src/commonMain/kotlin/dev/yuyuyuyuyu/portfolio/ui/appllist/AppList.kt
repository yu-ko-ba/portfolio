package dev.yuyuyuyuyu.portfolio.ui.appllist

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppList(state: AppListScreen.State, modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier, topBar = { TopAppBar(title = { Text("portfolio") }) }) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(state.apps) { app ->
                Text(app)
            }
        }
    }
}
