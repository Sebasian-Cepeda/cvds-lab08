package edu.eci.cvds.servlet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.eci.cvds.servlet.model.Configuration;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, String> {
    
}
