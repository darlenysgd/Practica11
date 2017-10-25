package quiz3.Configuraciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .antMatchers("/RegistroAlquiler").hasAnyRole("ADMIN")
                .antMatchers("/listaClientes").hasAnyRole("ADMIN")
                .antMatchers("/RegistroCliente").hasAnyRole("ADMIN")
                .antMatchers("/RegistroEquipos").hasAnyRole("ADMIN")
                .antMatchers("/familiaEquipos").hasAnyRole("ADMIN")
                .antMatchers("/listaClientes").hasAnyRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("1234").roles("ADMIN").and()
                .withUser("monti").password("monti").roles("USER");
    }
}