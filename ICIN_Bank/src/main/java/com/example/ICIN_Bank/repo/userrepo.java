package com.example.ICIN_Bank.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ICIN_Bank.model.Users;

@Repository
public interface userrepo extends JpaRepository<Users,Integer> {

}