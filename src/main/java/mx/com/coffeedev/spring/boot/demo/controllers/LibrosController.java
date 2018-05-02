package mx.com.coffeedev.spring.boot.demo.controllers;

import mx.com.coffeedev.spring.boot.demo.dto.Libro;
import mx.com.coffeedev.spring.boot.demo.dao.interfaces.ILibroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/libro")

public class LibrosController {

    @Autowired
    private ILibroDAO libroDAO;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Libro getLibro(@PathVariable Integer id){
        return libroDAO.findById(id);
    }
}
