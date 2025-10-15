package com.example.jpapostgres;

import com.example.jpapostgres.dao.AlumnoDAO;
import com.example.jpapostgres.entity.Alumno;

public class Inicio {
  public static void main(String[] args) {
    AlumnoDAO alumnoDao = new AlumnoDAO();

    Alumno nuevo = new Alumno();
    nuevo.setNombre("Laura");
    nuevo.setEdad(5);

    alumnoDao.insertar(nuevo);
  }
}


