package sn.app.AppRole.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Approles")
public class AppRoleEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(length = 150,nullable = false)
    private String FirstName;
    @Column(length = 100,nullable = false)
    private String LastName;
    @Column(length = 200,nullable = false,unique = true)
    private String email;
    @Column(length = 250,nullable = false)
    private String password;
    @Temporal(TemporalType.DATE)
    private Date bitrhdate;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
