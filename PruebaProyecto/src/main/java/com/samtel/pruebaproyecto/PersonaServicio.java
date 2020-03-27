
package com.samtel.pruebaproyecto;

import java.util.List;

public interface PersonaServicio {
    List<Persona>listar();
    Persona listarId(int id);
    Persona agregarPersona(Persona object);
    Persona eliminarPersona(int id);
}
