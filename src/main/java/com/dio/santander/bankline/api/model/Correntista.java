package com.dio.santander.bankline.api.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 20)
    private String cpf;
    
    @Column(length = 60)
    private String nome;
    
    @Column(length = 28)
    private String uid;

    @Column(name = "e_mail")
    private String email;
    
    
    @Embedded
    private Conta conta;
    
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUid() {
        return uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public Conta getConta() {
        return conta;
    }
    
    public void setConta(Conta conta){
        this.conta = conta;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
