package com.drmuller.stepDef;

import com.drmuller.utilities.ConfigurationReader;
import com.drmuller.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
