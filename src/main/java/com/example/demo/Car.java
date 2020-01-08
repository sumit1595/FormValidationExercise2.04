package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    static final String MIN="qwq";

    @NotNull
    @Min(1)
    private long garage;
    @NotNull
    @Size(min = 3, max = 10)
    private String name;
    @NotNull
    @Size(min = 5, max = 10)
    private String type;
    @NotNull
    @Size(min = 20, max = 50)
    private String description;

    public long getGarage() {
        return garage;
    }

    public void setGarage(long garage) {
        this.garage = garage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
