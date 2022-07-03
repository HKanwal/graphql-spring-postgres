package com.sapient.api.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
