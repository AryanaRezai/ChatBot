package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.Login.LoginRegTestCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { LoginRegTestCucumberTest.class})


public class Login {

}
