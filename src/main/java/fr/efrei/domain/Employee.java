package fr.efrei.domain;


import org.jetbrains.annotations.NotNull;

public class Employee {
    private String empNumber;
    private Demographic_info demographicInfo;
    private Name name;

    private Employee(Builder builder){
        this.empNumber = builder.empNumber;
        this.demographicInfo = builder.demographicInfo;
        this.name = builder.name;
    }

    public Demographic_info getDemographicInfo() {
        return demographicInfo;
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
                " Demographic Info=" + demographicInfo +
                '}';
    }


    public static class Builder{
        private String empNumber;
        private Demographic_info demographicInfo;
        private Name name;

        public Builder setEmpNumber(String empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setDemographicInfo(Demographic_info demographicInfo) {
            this.demographicInfo = demographicInfo;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNumber = employee.empNumber;
            this.demographicInfo = employee.demographicInfo;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}

