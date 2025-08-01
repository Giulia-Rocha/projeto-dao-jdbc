package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Testing findById ===");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n\n=== Testing findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department d : list){
            System.out.println(d);
        }

        System.out.println("\n\n=== Testing insert ===");
        Department newDep = new Department(null, "Financeiro");
        departmentDao.insert(newDep);
        System.out.println("Insert successful! Id =" + newDep.getId());


        System.out.println("\n\n=== Testing update ===");
        Department updatedDep = departmentDao.findById(1);
        updatedDep.setName("Computadores");
        departmentDao.update(updatedDep);
        System.out.println("Update successful! ");


        System.out.println("\n\n=== Testing deleteById ===");
        departmentDao.deleteById(6);
        System.out.println("Delete completed!");

    }
}
