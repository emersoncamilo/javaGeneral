package br.com.adopets;

import br.com.adopets.client.ClientHttpConfiguration;
import br.com.adopets.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}
