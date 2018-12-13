package com.example.ykamikawa.sampleforcircleci

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun check_caluculate_bmi() {
        onView(withId(R.id.heightEditText)).perform(typeText("100"))
        onView(withId(R.id.weightEditText)).perform(typeText("10"))
        onView(withId(R.id.computeButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("10.0"))).check(matches(isDisplayed()))
    }
}
