package pl.dariuszwydra.musicbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.dariuszwydra.musicbooking.entity.Room;

@CrossOrigin("http://localhost:4200")
public interface RoomRepository extends JpaRepository<Room,Long> {
// abcdef
}
