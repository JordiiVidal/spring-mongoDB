package com.springmongo.springmongo;

import com.springmongo.springmongo.controller.ApplicationRepository;
import com.springmongo.springmongo.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationRepository applicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Team team = new Team(
				"Betis",
				200000,
				"Sevilla",
				"Angel",
				"Villa Marin"
		);
		Team team2 = new Team(
				"F.C.Barcelona",
				9990000,
				"Barcelona",
				"Bartu",
				"Camp Nou"
		);
		Team team3 = new Team(
				"Sevilla",
				46000,
				"Sevilla",
				"Nido",
				"Pizjuan"
		);
		Team team4 = new Team(
				"Chelsea",
				268000,
				"Londres",
				"Ima",
				"Stan"
		);
		Team team5 = new Team(
				"Juventus",
				20000,
				"Turin",
				"Pizza",
				"JuveS"
		);
		Team team6 = new Team(
				"Manchester United",
				1321454,
				"Manchester",
				"Fergu",
				"Old T"
		);
		Team team7 = new Team(
				"BVB",
				55400,
				"Dortmund",
				"Klose",
				"Induna"
		);
		this.applicationRepository.deleteAll();
		this.applicationRepository.save(team);
		this.applicationRepository.save(team2);
		this.applicationRepository.save(team3);
		this.applicationRepository.save(team4);
		this.applicationRepository.save(team5);
		this.applicationRepository.save(team6);
		this.applicationRepository.save(team7);

	}
}
