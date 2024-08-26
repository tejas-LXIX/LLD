package structuraldesignpatterns.proxy;

import structuraldesignpatterns.proxy.model.EmployeeDO;

public interface EmployeeDAO {
    public void create(String client, EmployeeDO emp);
    public void delete(String client, int empId);
    public EmployeeDO get(String client, int empId);
}
