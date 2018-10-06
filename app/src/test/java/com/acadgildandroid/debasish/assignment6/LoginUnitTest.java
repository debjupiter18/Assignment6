package com.acadgildandroid.debasish.assignment6;

import android.content.Context;

import org.junit.Test;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginUnitTest {

    private static final String FAKE_STRING = "Login was successful";


    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        MainActivity myObjectUnderTest = new MainActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("user","user1");

        // ...then the result should be the expected one.
       // assertThat(result, is(FAKE_STRING));
       assertEquals(result,1);
        //assertEquals();
    }
}
