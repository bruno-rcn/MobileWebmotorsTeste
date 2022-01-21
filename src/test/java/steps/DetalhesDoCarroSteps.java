package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalhesDoCarroPage;
import pages.TelaDeListagemPage;

public class DetalhesDoCarroSteps {
	
	private TelaDeListagemPage telaListagemPage = new TelaDeListagemPage(); 
	private DetalhesDoCarroPage detalhesDoCarroPage = new DetalhesDoCarroPage();

	@Given("que eu clique no anuncio")
	public void que_eu_clique_no_anuncio() throws InterruptedException {
		Assert.assertEquals("Carros", telaListagemPage.tituloTela("Carros"));
		Thread.sleep(1000);
		telaListagemPage.clicarFotoAnuncio();
	}
	
	@When("for direcionado para tela de detalhes do carro")
	public void for_direcionado_para_tela_de_detalhes_do_carro() {
		Assert.assertEquals("Detalhes do Carro", detalhesDoCarroPage.tituloTela("Detalhes do Carro"));
	}
	
	@Then("verifico se os campos na tela de detalhes nao estao vazios")
	public void verifico_se_os_campos_na_tela_de_detalhes_nao_estao_vazios() {
		Assert.assertFalse(detalhesDoCarroPage.obterDetalheNome().isEmpty());
		Assert.assertFalse(detalhesDoCarroPage.cmpModelo().isEmpty());
		Assert.assertFalse(detalhesDoCarroPage.cmpPreco().isEmpty());
		Assert.assertTrue(!detalhesDoCarroPage.obterDetalhesAno().isEmpty());
		Assert.assertTrue(!detalhesDoCarroPage.obterDetalhesKM().isEmpty());
		Assert.assertTrue(!detalhesDoCarroPage.obterDetalhesCor().isEmpty());
	}
	
}
