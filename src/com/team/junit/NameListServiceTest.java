package com.team.junit;
//对NameListService的测试

import com.team.domain.Employee;
import com.team.service.NameListService;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service=new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService service=new NameListService();
        int id=10   ;
        try {
            Employee employee=service.getEmployee(id);
            System.out.println(employee);
        } catch (Exception e) {
            System.out.println("e.getMessgae()");
        }
    }
}
