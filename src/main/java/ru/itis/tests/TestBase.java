package ru.itis.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.itis.ApplicationManager;

public class TestBase {
    protected static ApplicationManager applicationManager;

    @Before
    public void setUp(){
        applicationManager = ApplicationManager.getInstance();
    }

    @BeforeClass
    public static void site_test_1() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @AfterClass
    public static void tearDown() {
        applicationManager.closeBrowser();
    }

}
