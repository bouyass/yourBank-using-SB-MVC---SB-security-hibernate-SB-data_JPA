package com.lyes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.lyes.dao.ClientRepository;
import com.lyes.entities.Client;

@EnableAutoConfiguration(exclude = {JndiConnectionFactoryAutoConfiguration.class,DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})


@SpringBootApplication(scanBasePackages= {"com.lyes","com.lyes.entities"})
public class YourBankApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(YourBankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client c1 = cr.save(new Client("lyes","lyes.makhloufi@outlook.fr"));
		Client c2 = cr.save(new Client("karim","karim.makhloufi@outlook.fr"));	
	}

}
