package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testFetchJokeTask() throws ExecutionException, InterruptedException {
        MainActivity.EndpointsAsyncTask testJoke = new MainActivity.EndpointsAsyncTask();
        testJoke.execute(getApplication());
        String joke = testJoke.get();
//        Log.i("test", "testFetchJokeTask: " + joke);
        assertNotNull(joke);
    }
}