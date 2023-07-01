package com.example.presentation.ui.ui

sealed class Routes(val route: String) {

    object Home: Routes("home")
    object Filter: Routes("filter")
    object Search: Routes("search")
    object MyPage: Routes("myPage")
}
