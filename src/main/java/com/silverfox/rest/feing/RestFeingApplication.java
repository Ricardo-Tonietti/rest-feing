package com.silverfox.rest.feing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class RestFeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFeingApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(ViaCEPClient client){
        return args -> {
            if (args.length > 0) {
                String cep = args[0];
 
                Endereco endereco = client
                                     .buscaEnderecoPor(cep);
 
                System.out.println(endereco);
            }
        };
    }

}
