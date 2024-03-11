package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ciudad;

@Repository
public interface ICiudad extends CrudRepository<Ciudad, String> {

}
