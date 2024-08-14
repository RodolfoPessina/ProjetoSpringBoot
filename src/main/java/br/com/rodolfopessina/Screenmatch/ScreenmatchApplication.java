package br.com.rodolfopessina.Screenmatch;

import br.com.rodolfopessina.Screenmatch.model.DadosSerie;
import br.com.rodolfopessina.Screenmatch.service.ConsumoApi;
import br.com.rodolfopessina.Screenmatch.service.ConvertDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=94a137eb");
		System.out.println(json);

		ConvertDados conversor = new ConvertDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
