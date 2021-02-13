package com.ashwin.android.instrumentation

import android.view.View
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule<MainActivity>(MainActivity::class.java)

    var mainActivity: MainActivity? = null

    @Before
    fun setUp() {
        mainActivity = activityTestRule.activity
    }

    @Test
    fun testLaunch() {
        val view = mainActivity?.findViewById<View>(R.id.welcome_textview)
        assertNotNull(view)
    }

    @After
    fun tearDown() {
        mainActivity = null
    }
}
