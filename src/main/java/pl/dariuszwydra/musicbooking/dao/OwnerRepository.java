package pl.dariuszwydra.musicbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.dariuszwydra.musicbooking.entity.Owner;

@CrossOrigin("http://localhost:4200")
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
