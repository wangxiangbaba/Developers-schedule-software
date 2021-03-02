package com.team.service;
import static com.team.service.Data.*;

import com.team.domain.*;

public class NameListService {
    private Employee[] employees;

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    public NameListService(){
        employees=new Employee[EMPLOYEES.length];
        for(int i=0;i<employees.length;i++){
            //获取员工类型
                int type=Integer.parseInt(EMPLOYEES[i][0]);
                //获取Employee的4个基本信息
                int  id =Integer.parseInt(EMPLOYEES[i][1]);
                String  name =EMPLOYEES[i][2];
                int  age =Integer.parseInt(EMPLOYEES[i][3]);
                double  salary =Double.parseDouble(EMPLOYEES[i][4]);
                Equipment equipment;
                double bonus;
                int stock;
                switch (type){
                    case EMPLOYEE:
                         employees[i]=new Employee();
                            break;
                    case PROGRAMMER:
                        equipment=createEquipment(i);
                        employees[i]=new Programmer();
                        break;
                    case DESIGNER:
                        equipment=createEquipment(i);
                        bonus=Double.parseDouble(EMPLOYEES[i][5]);
                        employees[i]=new Desinger();
                        break;
                    case ARCHITECT:
                        equipment=createEquipment(i);
                        bonus=Double.parseDouble(EMPLOYEES[i][5]);
                        stock=Integer.parseInt(EMPLOYEES[i][6]);
                        employees[i]=new Architect();
                        break;
                }
        }
    }

    private Equipment createEquipment(int index) {//获取指定index位置上的员工的设备
        int key=Integer.parseInt(EQUIPMENTS[index][0]);
        String model=EQUIPMENTS[index][1];
        switch (key){
            case PC://21
                String display=EQUIPMENTS[index][2];
                return new PC(model,display);
            case NOTEBOOK://22
                double price=Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model,price);
            case PRINTER://23
                return new Printer(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);

        }
        return null;
    }

    public Employee[] getAllEmployees(){//获取当前所有员工
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException {//获取指定ID的员工对象
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId()==id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
