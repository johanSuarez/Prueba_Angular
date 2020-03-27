
package com.samtel.pruebaproyecto;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
    List<Persona>findall();
    Persona findOne(int id);
    Persona save(Persona object);
    void delete(Persona object);
}
