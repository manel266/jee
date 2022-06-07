package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("O")
public class Retrait extends Operation{

}
