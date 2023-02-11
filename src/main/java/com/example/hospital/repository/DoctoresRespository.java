package com.example.hospital.repository;

import com.example.hospital.entities.Doctores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoresRespository extends CrudRepository<Doctores,Long> {
}
