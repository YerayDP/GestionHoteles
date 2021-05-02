package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

@Controller
public class UsuarioCont {
	@Autowired
	UsuarioService UsuServ;
	@GetMapping("/auth/login")
    public String welcome(Model model) {
		model.addAttribute("usuario",new Usuario());
        return "Login";
    }
	@PostMapping("/auth/DoLogin")
	public String PostLog() {
        return "redirect:/";
    }
	@GetMapping("/")
	public String Home() {
		return "Public";
	}
	@GetMapping("/auth/Register")
    public String Register(Model model) {
		model.addAttribute("usuario",new Usuario());
        return "Register";
    }
	@PostMapping("/auth/DoReg")
	public String PostReg(@ModelAttribute Usuario Usu) {
		Usu.setRole("ROLE_CLIENTE");
		Usu.setActivado(false);
		UsuServ.Registrar(Usu);
        return "redirect:/auth/login";
    }
	
}
