package com.cdac.BookYourCookies.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.BookYourCookies.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{
	Optional<Restaurant> findByRestaurantName(String name);
}