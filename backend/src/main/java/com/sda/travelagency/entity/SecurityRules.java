package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SecurityRules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String travelRestrictions;

    String insurance;
}