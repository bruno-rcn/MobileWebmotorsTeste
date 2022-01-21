package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DetalhesDoCarroPage extends BasePage {

	public String obterDetalheNome() {
		return getDriver().findElement(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@index='1'])[2]")).getText();
	}
	
	
	public String obterDetalhesAno() {
		return getDriver().findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@index='1']")).getText();
	}
	
	public String obterDetalhesKM() {
		return getDriver().findElement(By.xpath("(//android.widget.LinearLayout/android.widget.TextView[@index='1'])[2]")).getText();
	}
	
	public String obterDetalhesCor() {
		return getDriver().findElement(By.xpath("(//android.widget.LinearLayout/android.widget.TextView[@index='1'])[3]")).getText();
	}
}
