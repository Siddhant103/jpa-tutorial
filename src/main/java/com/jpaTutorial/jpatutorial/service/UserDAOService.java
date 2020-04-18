package com.jpaTutorial.jpatutorial.service;

import com.jpaTutorial.jpatutorial.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional //this will ensure each method inside this class will be involved in a transaction
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager; //Used to persist entity to the database

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }

}

