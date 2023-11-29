package com.example.loginapp

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import com.example.loginapp.ui.login.LoginActivity
import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.internal.builders.JUnit4Builder
import org.junit.runner.RunWith


//@SmallTest
@RunWith(Cucumber::class)
@CucumberOptions(features = ["assets/features"],
    glue = ["helpers","com.exemple.loginapp"],
    dryRun = true,
    monochrome = true)
class LoginActivityTest {


    //@get:Rule val mActivity: ActivityScenarioRule<LoginActivity> = ActivityScenarioRule<LoginActivity>(LoginActivity::class.java)

    @Rule
    val mActivity: ActivityScenarioRule<LoginActivity> = ActivityScenarioRule(LoginActivity::class.java)



    @Given("I have a login Activity")
    fun i_have_a_login_activity() {
        print("ok")
        // Write code here that turns the phrase above into concrete actions
        //val mActivity: ActivityScenarioRule<LoginActivity> = ActivityScenarioRule(LoginActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.username)).perform(ViewActions.typeText("test"))
    }

    @When("I input email {string}")
    fun i_input_email(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("I input password {string}")
    fun i_input_password(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("I press login button")
    fun i_press_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("I should see status on the {string}")
    fun i_should_see_status_on_the(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }


}