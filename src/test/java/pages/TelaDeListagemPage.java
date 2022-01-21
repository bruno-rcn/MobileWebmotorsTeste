package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class TelaDeListagemPage extends BasePage {

	public void clicarFotoAnuncio() {
		getDriver().findElement(By.xpath("//android.widget.FrameLayout[@index='0']")).click();
	}
	
	public String cmpPreco() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[@index='1']")).getText();
	}
	
	public String cmpNome() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[@index='2']")).getText();
	}
	
	public String cmpAnoKM() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[@index='3']")).getText();
	}
}
