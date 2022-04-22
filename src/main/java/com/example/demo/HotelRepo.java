package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customers", collectionResourceRel = "customers")
public interface HotelRepo extends JpaRepository<Hotel,Integer> {

}
