package com.portfolio.yoprogramo.Interface;

import com.portfolio.yoprogramo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar pesona
    public void savePersona (Persona persona);
    
    //Buscar un objeto por ID
    public Persona findPersona(Long id);
}
