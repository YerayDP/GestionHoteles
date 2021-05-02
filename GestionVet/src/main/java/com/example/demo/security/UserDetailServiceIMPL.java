package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Configuration
public class UserDetailServiceIMPL implements UserDetailsService{
	@Autowired
    UsuarioRepository repositorio;

    @Override
    public UserDetails loadUserByUsername(String nombreUsu) throws UsernameNotFoundException {
        Usuario Usu = repositorio.findFirstByUsername(nombreUsu);

        UserBuilder builder = null;

        if(Usu != null) {
            builder = User.withUsername(nombreUsu);
            builder.disabled(false);
            builder.password(Usu.getPassword());
            builder.authorities(new SimpleGrantedAuthority(Usu.getRole()));
        }else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        return builder.build();
    }
}
