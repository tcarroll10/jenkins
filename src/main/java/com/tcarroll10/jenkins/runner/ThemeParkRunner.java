package com.tcarroll10.jenkins.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcarroll10.jenkins.model.ThemeParkRide;
import com.tcarroll10.jenkins.repository.ThemeParkRideRepository;

@Component
public class ThemeParkRunner implements CommandLineRunner {

	@Autowired
	ThemeParkRideRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(ThemeParkRide.builder().name("Rollercoaster").description("Train ride that speeds you along.")
				.thrillFactor(5).vomitFactor(3).build());
		repository.save(ThemeParkRide.builder().name("Log flume").description("Boat ride with plenty of splashes.")
				.thrillFactor(3).vomitFactor(2).build());
		repository.save(ThemeParkRide.builder().name("Teacups").description("Spinning ride in a giant tea-cup.")
				.thrillFactor(2).vomitFactor(4).build());

	};

}
