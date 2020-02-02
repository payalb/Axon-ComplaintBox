package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.ComplaintQueryObject;

@Repository
public interface ComplaintQueryRepository extends JpaRepository<ComplaintQueryObject, Integer>{

}
