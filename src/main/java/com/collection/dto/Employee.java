package com.collection.dto;

/**
 * Represent an employee in the department
 *
 * @author hao.e.chen
 * @date 21/01/2018
 */
public class Employee {
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", department=").append(department);
        sb.append('}');
        return sb.toString();
    }
}
