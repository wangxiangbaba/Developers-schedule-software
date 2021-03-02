package com.team.domain;

public class Architect extends Desinger {
    private int stock;

    public Architect() {
        super();
    }

    public Architect(int id, int age, String name, double salary, Equipment equipment, double bonus, int stock) {
        super(id, age, name, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+stock+"\t"+getEquipment().getDescription();
    }
}
