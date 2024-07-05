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
public class PersonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;

	@NotNull
	@Column(unique=true)
	private String email;
	
	@NotNull
	@Column(unique=true)
	@Pattern(regexp = "^[0-9]{3,11}$", message = "------------- Invaild Phone number! -------------")
	private String phoneNumber;

}
