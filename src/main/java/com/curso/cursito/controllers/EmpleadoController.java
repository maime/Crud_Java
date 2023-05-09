package com.curso.cursito.controllers;

import com.curso.cursito.dao.EmpleadoDao;
import com.curso.cursito.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoDao empleadoDao;

    @RequestMapping(value = "api/v1/empleados", method = RequestMethod.GET)
    public List<Empleado> getEmpleado() {
        return empleadoDao.getEmpleado();
    }


    @RequestMapping(value = "api/v1/empleados", method = RequestMethod.POST)
    public void crear(@RequestBody Empleado empleado) {
        empleadoDao.crear(empleado);
    }

    @RequestMapping(value = "api/v1/empleados/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {
        empleadoDao.eliminar(id);
    }

}
