package com.backend.Backend;

import com.backend.Backend.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;





public interface DataRepository extends JpaRepository<Employee, Long>{



}
