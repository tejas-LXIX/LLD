package structuraldesignpatterns.proxy;

import structuraldesignpatterns.proxy.model.EmployeeDO;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(String client, EmployeeDO emp) {
        System.out.println("Created new row in the employee table");
    }

    @Override
    public void delete(String client, int empId) {
        System.out.println("Deleted row in the employee table");
    }

    @Override
    public EmployeeDO get(String client, int empId) {
        return new EmployeeDO();
    }
}
