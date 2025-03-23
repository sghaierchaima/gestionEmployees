package tn.esprim.gestion_employes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestion_employes.model.Tarif;
import tn.esprim.gestion_employes.repository.TarifRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tarifs")
@CrossOrigin(origins = "*")
public class TarifController {
    @Autowired
    private TarifRepository tarifRepository;

    @GetMapping
    public List<Tarif> getAllTarifs() {
        return tarifRepository.findAll();
    }

    @PostMapping
    public Tarif createTarif(@RequestBody Tarif tarif) {
        return tarifRepository.save(tarif);
    }
}
