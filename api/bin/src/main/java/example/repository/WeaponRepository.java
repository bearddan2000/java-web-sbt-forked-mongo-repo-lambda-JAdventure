package example.repository;

import example.model.Weapon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data!
// MongoRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()
public interface WeaponRepository extends MongoRepository<Weapon, String> {

    @Query("{ 'name' : ?0 }")
    Weapon findByName(String name);
}
