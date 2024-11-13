package com.example.boardingapp.onBoardViews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.boardingapp.data.PageData
import com.example.boardingapp.R
import com.example.boardingapp.dataStore.StoreBoarding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class)
@Composable
fun MainOnBoarding(navController: NavController, store:StoreBoarding)
{
    val items= ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Titulo 1",
            "Description 1",
        )
    )
    items.add(
        PageData(
        R.raw.page2,
        "Titulo 2",
        "Descripcion 2"
        )
    )
    items.add(
        PageData(
            R.raw.page3,
            "Titulo 3",
            "Descripcion 3"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items, pagerState = pagerState, modifier = Modifier
        .fillMaxWidth()
        .background(Color.White), navController, store
    )

}
