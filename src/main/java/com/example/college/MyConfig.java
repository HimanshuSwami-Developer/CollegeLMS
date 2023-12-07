package com.example.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.college.service.AdminDetailServiceImp;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class MyConfig {

	@Bean
	public UserDetailsService getAdminDetailService() {
		return new AdminDetailServiceImp();
//		return null;
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		System.out.println("password");
		return new BCryptPasswordEncoder();
	}

	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider doaAuthenticationProvider = new DaoAuthenticationProvider();
		doaAuthenticationProvider.setUserDetailsService(this.getAdminDetailService());
		doaAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return doaAuthenticationProvider;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/admin/**").hasRole("ADMIN")
						.requestMatchers("/user/**").hasRole("USER").requestMatchers("/**").permitAll())
				.formLogin(formLogin -> formLogin.loginPage("/login").defaultSuccessUrl("/signin"));
		

		DefaultSecurityFilterChain build = http.build();
        System.out.println(build);

		return build;

	}

	@Bean
	public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration authenticationConfiguration)
			throws Exception {
		  System.out.println("success");
		return authenticationConfiguration.getAuthenticationManager();
	}

//   @Override
//   protected void configure(HttpSecurity http) throws Exception {
//       http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
//       .antMatchers("/user/**").hasRole("USER")
//       .antMatchers("/**").permitAll.and().fromLogin().and().csrf().disable();
//   }

//   @Override
//   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.authenticationProvider(authenticationProvider());
//   }

}

//.logout(logout->logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/signin").deleteCookies("JSESSIONID")
//		.invalidateHttpSession(true));
