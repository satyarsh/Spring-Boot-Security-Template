package demo.springapp5.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.core.userdetails.User;

// @Configuration
// @EnableWebSecurity
public class WebSecurityConfig {
    
    // @Bean
    // SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //     return http
    //             .authorizeHttpRequests( auth -> {
    //                 auth.requestMatchers("/").permitAll();
    //                 auth.anyRequest().authenticated();
    //             })
    //             .httpBasic(Customizer.withDefaults()) //JS Style Pop Up Login 
    //             .build();
    // }

    /*
     * User.withDefaultPasswordEncoder() can still be used for demos, 
     * you don't have to worry if that's what you're doing - even if it's deprecated 
     * - but in production, you shouldn't have a plain text password in your source code.
     * 
     * https://stackoverflow.com/questions/49847791/java-spring-security-user-withdefaultpasswordencoder-is-deprecated
     */

    // @Bean
	// public UserDetailsService userDetailsService() {
	// 	UserDetails user =
	// 		 User.withDefaultPasswordEncoder()
	// 			.username("user")
	// 			.password("1234")
	// 			.roles("USER")
	// 			.build();
	// 	return new InMemoryUserDetailsManager(user);
	// }

}
