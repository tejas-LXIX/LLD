package structuraldesignpatterns.proxy;

import structuraldesignpatterns.proxy.model.EmployeeDO;

public class Client {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOProxy();
        employeeDAO.create("USER", new EmployeeDO());
        System.out.println("Operation successful");
    }
}
