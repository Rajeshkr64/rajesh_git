package com.eon.repositories; // Step 2-To perform CRUD operation

import org.springframework.data.jpa.repository.JpaRepository;

import com.eon.entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> { 

}
