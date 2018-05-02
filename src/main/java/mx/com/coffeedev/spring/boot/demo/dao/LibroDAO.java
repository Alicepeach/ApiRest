package mx.com.coffeedev.spring.boot.demo.dao;

import mx.com.coffeedev.spring.boot.demo.dao.interfaces.ILibroDAO;
import mx.com.coffeedev.spring.boot.demo.dto.Libro;
import org.springframework.stereotype.Component;

@Component
public class LibroDAO implements ILibroDAO{
    @Override
    public Libro findById(Integer id){
        return new Libro(id, "Llano en llamas\"", "Juan Rulfo", "planeta", 10);
    }

}
