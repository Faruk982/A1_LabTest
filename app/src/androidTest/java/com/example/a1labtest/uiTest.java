package com.example.a1labtest;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class uiTest {
    @Rule
    public ActivityScenarioRule<MainActivity>activityActivityScenarioRule=new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void testUI(){
        Espresso.onView(ViewMatchers.withId(R.id.InputShape)).perform(ViewActions.typeText("Square"));
        Espresso.onView(ViewMatchers.withId(R.id.InputColor)).perform(ViewActions.typeText("Red"));
        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.ShowShape)).check(ViewAssertions.matches(ViewMatchers.withText("Square")));

    }
}
