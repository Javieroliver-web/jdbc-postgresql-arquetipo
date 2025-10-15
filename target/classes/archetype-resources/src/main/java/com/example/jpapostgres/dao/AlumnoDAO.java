package com.example.jpapostgres.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.example.jpapostgres.entity.Alumno;

public class AlumnoDAO {
  private final EntityManagerFactory entityManagerFactory =
      Persistence.createEntityManagerFactory("alumnosPU");

  public void insertar(Alumno alumno) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(alumno);
    entityManager.getTransaction().commit();
    entityManager.close();
  }
}


