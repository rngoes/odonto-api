package com.odonto.api.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PhonePacient> phones;

    @ManyToOne
    private Plan plan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PhonePacient> getPhones() {
        return phones;
    }

    public void setPhones(List<PhonePacient> phones) {
        this.phones = phones;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
