package com.example.navigationbasics.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screen(var route: String) {
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
/*        fun passId(id: Int): String {
            // not good enough as we have to hardcode the string "detail_screen"
            // return "detail_screen/$id"
            return this.route.replace(oldValue = DETAIL_ARGUMENT_KEY, newValue = id.toString())
        }*/
        fun passIdAndName(
            id: Int,
            name: String
        ): String {
            return "detail_screen/$id/$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}
