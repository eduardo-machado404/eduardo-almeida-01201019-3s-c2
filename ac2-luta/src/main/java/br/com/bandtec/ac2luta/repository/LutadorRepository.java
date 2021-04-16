package br.com.bandtec.ac2luta.repository;

import br.com.bandtec.ac2luta.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {
}
