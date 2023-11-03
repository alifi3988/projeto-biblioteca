package br.com.biblioteca.projetobiblioteca;

import br.com.biblioteca.projetobiblioteca.view.LoginView;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjetoBibliotecaApplication {

	public static void main(String[] args) {
            try{
		//SpringApplication.run(ProjetoBibliotecaApplication.class, args);
                ApplicationContext context = new SpringApplicationBuilder(ProjetoBibliotecaApplication.class).headless(false).run(args);
                LoginView login = context.getBean(LoginView.class);
                login.setVisible(true);
            }catch (BeansException e){
                System.out.print("Erro ao iniciar o sistema: " + e.getMessage());
            }
             
	}
}
