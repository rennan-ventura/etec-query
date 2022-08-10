package br.com.etechoracio.etecquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.etechoracio.etecquery.dao")
@EntityScan({"br.com.etechoracio.etecquery.model", "br.com.etechoracio.etecquery.enums"})
public class EtecQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtecQueryApplication.class, args);
	}

}
