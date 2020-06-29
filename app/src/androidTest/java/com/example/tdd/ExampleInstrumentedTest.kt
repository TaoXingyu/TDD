package com.example.tdd

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
/*@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.tdd", appContext.packageName)
    }

   @Test
    fun user_can_enter_the_first_name(){
        onView(withId(R.id.editText_firstName)).perform(typeText("Xingyu"))
    }
}*/

class SetOperationTest {
    private val setOperation = SetOperation()
    @Test
    fun getSize_test(){
        setOperation.addItem(1)
        assertEquals(1,setOperation.getSize())
    }
    @Test
    fun getCount_text(){
        setOperation.addItem(1)
        setOperation.addItem(1)
        assertEquals(1,setOperation.getCount())
    }
}

