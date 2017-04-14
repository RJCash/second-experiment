package com.theironyard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Created by rickiecashwell on 4/12/17.
 */
@Component
public class AnimalRepository {
    @Autowired
    JdbcTemplate template;

    public List<Animal> animals() {
        return template.query("SELECT * FROM animals",
                new Object[]{},
                (ResultSet, row) -> new Animal(
                        ResultSet.getInt("animalid"),
                        ResultSet.getString("animal_name"),
                        ResultSet.getString("animal_breed"),
                        ResultSet.getString("animal_species"),
                        ResultSet.getString("animal_description")
                )
        );
    }

    public Object listAnimalName(String name) {
        return template.query("SELECT * FROM animals WHERE lower(animal_name) = lower(?)",
                new Object[]{name},
                (ResultSet, row) -> new Animal(
                        ResultSet.getInt("animalid"),
                        ResultSet.getString("animal_name"),
                        ResultSet.getString("animal_breed"),
                        ResultSet.getString("animal_species"),
                        ResultSet.getString("animal_description")
                )
        );
    }
}