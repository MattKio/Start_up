package fr.efrei.domain;

public class Employee {
    private String empNumber;
    private Name name;

    private Employee(Builder builder){
        this.empNumber = builder.empNumber;
        this.name = builder.name;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpNumber=" + empNumber +
                ", name=" + name +
                '}';
    }


    public static class Builder{
        private String empNumber;
        private Name name;

        public Builder setEmpNumber(String empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNumber = employee.empNumber;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}

