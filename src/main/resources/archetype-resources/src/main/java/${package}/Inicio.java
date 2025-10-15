package ${package};

import ${package}.dao.AlumnoDAO;
import ${package}.entity.Alumno;

public class Inicio {
    public static void main(String[] args) {
        AlumnoDAO dao = new AlumnoDAO();

        Alumno nuevo = new Alumno();
        nuevo.setNombre("Laura");
        nuevo.setEdad(5);

        dao.insertar(nuevo);
    }
}