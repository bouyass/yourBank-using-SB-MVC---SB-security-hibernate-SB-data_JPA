package com.lyes.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.lyes.entities.Client;

@Service
public interface ClientRepository extends JpaRepository<Client,Long>{

}
