package br.edu.iftm.mvc_thymeleaf_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/sortear")
    public String sorteio(Model memoria) {
        int n1 = (int) Math.floor(Math.random() *60) + 1;
        int n2 = (int) Math.floor(Math.random() *60) + 1;
        int n3 = (int) Math.floor(Math.random() *60) + 1;
        int n4 = (int) Math.floor(Math.random() *60) + 1;
        int n5 = (int) Math.floor(Math.random() *60) + 1;
        int n6 = (int) Math.floor(Math.random() *60) + 1;
        memoria.addAttribute("n1", n1);
        memoria.addAttribute("n2", n2);
        memoria.addAttribute("n3", n3);
        memoria.addAttribute("n4", n4);
        memoria.addAttribute("n5", n5);
        memoria.addAttribute("n6", n6);
        return "numeros";
    }   
}
