package com.ctorres.imageslider.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageSliderComponent(
    images: Array<Int> = arrayOf(),
    initialPage: Int = 0,
    modifier: Modifier = Modifier
) {
    // PagerState is experimental, can change in the future.
    val pagerState = PagerState(
        initialPage = initialPage
    )
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        HorizontalPager(
            modifier = modifier,
            pageCount = images.size,
            pageSize = PageSize.Fill,
            state = pagerState,
            key = {
                images.get(it)
            }
        ) { index->
            Image(
                painter = painterResource(id = images.get(index)),
                // Remember, Content Description is very importante for accesibility when we have
                // users with a disability
                contentDescription = "Image: ".plus(index + 1),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
