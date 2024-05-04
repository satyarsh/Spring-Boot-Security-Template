package demo.springapp5.model;

import org.springframework.stereotype.Component;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
public class personModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;

	@NotNull
	private String email;
	
	@NotNull
	private String phoneNumber;

}
