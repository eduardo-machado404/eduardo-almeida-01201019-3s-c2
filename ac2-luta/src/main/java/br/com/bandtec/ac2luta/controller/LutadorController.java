package br.com.bandtec.ac2luta.controller;

import br.com.bandtec.ac2luta.dominio.Lutador;
import br.com.bandtec.ac2luta.repository.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {


    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutador() {
        List<Lutador> lutador = repository.findAll();

        if (lutador.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(lutador);
        }
    }

    @GetMapping("/Contagem-vivos")
    public ResponseEntity getContagem(){
        List<Lutador> lutador = repository.findAll();
        Integer vivos = 0;
        for (int i = 0; i< lutador.size(); i++){
            if(lutador.get(i).isVivo()) {
                vivos++;
            }
        }
        return ResponseEntity.status(201).body("Tem"+vivos+" lutadores vivos");
    }


}
