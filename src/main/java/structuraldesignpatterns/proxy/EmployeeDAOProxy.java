package structuraldesignpatterns.proxy;

import structuraldesignpatterns.proxy.model.EmployeeDO;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    EmployeeDAOProxy() {
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, EmployeeDO emp) {
        if (client.equals("ADMIN")) {
            employeeDAO.create(client, emp);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public void delete(String client, int empId) {
        if (client.equals("ADMIN")) {
            employeeDAO.delete(client, empId);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public EmployeeDO get(String client, int empId) {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDAO.get(client, empId);
        }
        throw new RuntimeException("Access Denied");
    }
}
