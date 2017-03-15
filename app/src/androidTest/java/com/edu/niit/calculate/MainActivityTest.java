package com.edu.niit.calculate;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void loginWithWrongPassword(){
        onView(withId(R.id.name)).perform(typeText("android"), closeSoftKeyboard());
        onView(withId(R.id.psd)).perform(typeText("wrong"),closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("登录失败")));
    }
    @Test
    public void loginWithRightPassword(){
        onView(withId(R.id.name)).perform(typeText("android"), closeSoftKeyboard());
        onView(withId(R.id.psd)).perform(typeText("123456"),closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("登录成功")));
    }
}