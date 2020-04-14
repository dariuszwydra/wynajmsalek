package pl.dariuszwydra.musicbooking.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="owner")
@Data

public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tel_number")
    private String telNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Room> rooms;

}
