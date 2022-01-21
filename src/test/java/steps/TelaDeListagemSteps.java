package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalhesDoCarroPage;
import pages.TelaDeListagemPage;

public class TelaDeListagemSteps {
	
	private TelaDeListagemPage telaListagemPage = new TelaDeListagemPage(); 
	private DetalhesDoCarroPage detalhesDoCarroPage = new DetalhesDoCarroPage();

	@Given("que estou na tela de listagem")
	public void que_estou_na_tela_de_listagem() {
		Assert.assertEquals("Carros", telaListagemPage.tituloTela("Carros"));
	}
	
	@Then("verifico se os campos nao estao vazios")
	public void verifico_se_os_campos_nao_estao_vazios() {
		Assert.assertFalse(telaListagemPage.cmpPreco().isEmpty());
		Assert.assertFalse(telaListagemPage.cmpNome().isEmpty());
		Assert.assertTrue(!telaListagemPage.cmpAnoKM().isEmpty());
	}
	
	@When("clico na imagem do anuncio")
	public void clico_na_imagem_do_anuncio() {
		telaListagemPage.clicarFotoAnuncio();
	}
	
	@When("clico no preco do anuncio")
	public void clico_no_preco_do_anuncio() {
		telaListagemPage.clicarPorTexto(telaListagemPage.cmpPreco());
	}
	
	@When("clico no nome do anuncio")
	public void clico_no_nome_do_anuncio() {
		telaListagemPage.clicarPorTexto(telaListagemPage.cmpNome());
	}
	
	@When("clico no ano e km do anuncio")
	public void clico_no_ano_e_km_do_anuncio() {
		telaListagemPage.clicarPorTexto(telaListagemPage.cmpAnoKM());
	}
	
	@Then("verifico se foi direcionado para a tela de detalhes do carro")
	public void verifico_se_foi_direcionado_para_a_tela_de_detalhes_do_carro() {
		Assert.assertEquals("Detalhes do Carro", detalhesDoCarroPage.tituloTela("Detalhes do Carro"));
	}
	
}
