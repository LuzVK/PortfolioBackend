package com.portfolio.yoprogramo.Repository;

import com.portfolio.yoprogramo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luz
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
