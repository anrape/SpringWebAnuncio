package com.example.demo.repository;

import java.io.Serializable;
import com.example.demo.entity.Log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("logRepository")
public interface LogRepository extends JpaRepository<Log, Serializable> {
	

}
