package com.curso.cursito.dao;

import com.curso.cursito.model.Empleado;

import java.util.List;

public interface EmpleadoDao {
    List<Empleado> getEmpleado();

    void eliminar(int id);

    void crear(Empleado empleado);

}
