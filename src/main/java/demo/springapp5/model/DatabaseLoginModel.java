package demo.springapp5.model;

import org.springframework.stereotype.Component;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Component
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class DatabaseLoginModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "database_username")
    private String username;

    @NotNull
    @Column(name = "database_password")
    private String password;


}
