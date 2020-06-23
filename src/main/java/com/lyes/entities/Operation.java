package com.lyes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_compte",discriminatorType = DiscriminatorType.STRING,length = 1)
public abstract class Operation implements Serializable {
    @Id
    @GeneratedValue
    private Long numero;
    private Date dateOperation;

    public Operation() {
    }

    private double montant;

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    @ManyToOne
    @JoinColumn(name = "code_compte")
    private Compte compte;

    public Operation(Long numero, Date dateOperation, double montant, Compte compte) {
        this.numero = numero;
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.compte = compte;
    }
}
