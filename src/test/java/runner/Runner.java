package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Projects\\MobileWebmotorsTeste\\src\\test\\resources\\features",
		glue = "steps",
		tags ="@CT06",
		monochrome = true)

public class Runner {

	@AfterClass
	public static void killDriver() {
		DriverFactory.killDriver();
	}
}
