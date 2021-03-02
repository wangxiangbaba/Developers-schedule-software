package com.team.domain;

public class Desinger extends Programmer {
    private double bonus;//奖金

    public Desinger() {
        super();
    }

    public Desinger(int id, int age, String name, double salary, Equipment equipment, double bonus) {
        super(id, age, name, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }
}
