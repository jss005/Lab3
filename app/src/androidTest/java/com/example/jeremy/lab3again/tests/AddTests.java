package com.example.jeremy.lab3again.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.jeremy.lab3again.MainActivity;

/**
 * Created by Jeremy on 4/17/2016.
 */
public class AddTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public AddTests(){
        super(MainActivity.class);
    }
    //this is a comment
    //this is another comment
    //this is a third comment
    MainActivity mainActivity;

    public void testAdd(){
        mainActivity = getActivity();

        int first = 0;
        int second = 0;
        assertEquals(mainActivity.sum(first, second), 0);

        first = 1; second = 2;
        assertEquals(mainActivity.sum(first, second), 3);

        first = -1; second = -2;
        assertEquals(mainActivity.sum(first, second), -3);

    }
}
