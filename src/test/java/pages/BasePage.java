package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	public String tituloTela(String text) {
		return getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+text+"']")).getText();
	}
	
	public void clicarPorTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='"+ texto +"']")).click();
	}
	
}
