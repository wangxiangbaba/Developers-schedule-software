package com.team.domain;

import com.team.service.Status;

public class Programmer extends Employee{
    private int memberId;//开发团队中的ID
    private Status status=Status.FREE;
    private Equipment equipment;

    public Programmer() {
        super();
    }

    public Programmer(int id, int age, String name, double salary,Equipment equipment) {
        super(id, age, name, salary);
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return getDetails()+"\t程序员\t"+status+"\t\t\t"+equipment.getDescription();
    }
}
