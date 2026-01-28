package com.example.APISURAG8NOTAS.servicios;


import com.example.APISURAG8NOTAS.modelos.Notas;
import com.example.APISURAG8NOTAS.repositorios.IRepositorioNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNota {

    //El servicio utiliza al repositorio
    //A este uso se le llama, "inyección de dependencia"

    @Autowired
    IRepositorioNota repositorio;

    //Se crean funciones publicas para activar cada consulta
    //que se quiera ofrecer

    public Notas guardar (Notas datos){
        return this.repositorio.save(datos);
    }

    public List<Notas> buscarTodos(){
        return this.repositorio.findAll();
    }

    public Notas buscarPorId(Integer id)throws Exception{
        //1. Para buscar por Id, primero debo utilizar la clase optional de Java
        Optional<Notas> notaBuscada = this.repositorio.findById(id);
        if (notaBuscada.isPresent()){
            return notaBuscada.get();
        } else {
            throw new Exception("No se encontro la nota buscada");
        }
    }
}
