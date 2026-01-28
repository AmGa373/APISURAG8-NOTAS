package com.example.APISURAG8NOTAS.repositorios;

import com.example.APISURAG8NOTAS.modelos.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioNota extends JpaRepository<Notas,Integer> {
}
