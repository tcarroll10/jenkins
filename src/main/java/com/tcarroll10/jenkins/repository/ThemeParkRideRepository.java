package com.tcarroll10.jenkins.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcarroll10.jenkins.model.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
	List<ThemeParkRide> findByName(String name);
}