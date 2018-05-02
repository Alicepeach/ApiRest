package mx.com.coffeedev.spring.boot.demo.dao.interfaces;
import mx.com.coffeedev.spring.boot.demo.dto.Libro;

public interface ILibroDAO {
    Libro findById(Integer id);
}
