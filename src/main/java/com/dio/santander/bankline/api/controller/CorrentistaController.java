package com.dio.santander.bankline.api.controller;

import com.dio.santander.bankline.api.dto.AtualizarCorrentista;
import com.dio.santander.bankline.api.dto.DeletarCorrentista;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{uid}")
    public List<Correntista> findAll(@PathVariable("uid") String uid){
        return repository.findByUid(uid);
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody DeletarCorrentista correntista) {service.delete(correntista);}

    @PutMapping("/{id}")
    public void update(@RequestBody AtualizarCorrentista correntista) {service.update(correntista);}

}
