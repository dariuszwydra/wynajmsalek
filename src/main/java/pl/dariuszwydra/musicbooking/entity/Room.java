package pl.dariuszwydra.musicbooking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="object")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

}
