package steps_definition;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.*;
import utilities.Driver;

public class CommonHooks {
	@Before
	public void setup() {
		System.out.println("This is before hook!");
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();
	}

	@After
	public void teardown() {
		System.out.println("This is after hook!");
		Driver.quitDriver();
	}
}
