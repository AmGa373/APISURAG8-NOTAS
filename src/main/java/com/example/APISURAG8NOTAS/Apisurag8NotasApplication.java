package com.example.APISURAG8NOTAS;

import com.example.APISURAG8NOTAS.modelos.Notas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apisurag8NotasApplication {

	public static void main(String[] args) {

        //Como se usa una clase - Creando un objeto
        //Como se crea un objeto - Nombre de la clase - nombre del objeto - se iguala al constructor
        //Que es un modificador de acceso - la palabra reservada para proteger la integridad de los datos: private, prtotected y public
        //Que es encapsulamiento - es poder acceder a los atributos privados getter y setter

        //martes
        //que es una interface
        //que es una funcion
        //como se implementan las funciones de una interface

        //Prueba pruebaUno = new Prueba();
        //pruebaUno.setNombre("Alex");

        //Notas notasUno = new Notas();
        //notasUno.setNombreEstudiante("Alejandro");

        //System.out.println(pruebaUno.getNombre());
        //System.out.println(notasUno.getNombreEstudiante());

		SpringApplication.run(Apisurag8NotasApplication.class, args);
	}
}
