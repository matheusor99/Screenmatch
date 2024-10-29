package com.example.matheus.Screenmatch;

import com.example.matheus.Screenmatch.model.DadosEpisodio;
import com.example.matheus.Screenmatch.model.DadosSerie;
import com.example.matheus.Screenmatch.model.DadosTemporada;
import com.example.matheus.Screenmatch.principal.Principal;
import com.example.matheus.Screenmatch.service.ConsumoApi;
import com.example.matheus.Screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
