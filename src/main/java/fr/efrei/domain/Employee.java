package fr.efrei.domain;


public class Employee {
    private String empNumber;
    private Demographic_info demographicInfo;
    private Name name;
    private Identity_Type identityType;
    private Poste poste;
    private Emploie emploie;
    private Contact_Details contactDetails;
    private AddressDetails addressDetails;

    private Employee(Builder builder){
        this.empNumber = builder.empNumber;
        this.demographicInfo = builder.demographicInfo;
        this.name = builder.name;
        this.emploie = builder.emploie;
        this.identityType = builder.identityType;
        this.poste = builder.poste;
        this.contactDetails = builder.contactDetails;
        this.addressDetails = builder.addressDetails;
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

    public Identity_Type getIdentityType() {
        return identityType;
    }

    public Poste getPoste() {
        return poste;
    }

    public Contact_Details getContactDetails() {
        return contactDetails;
    }

    public Emploie getEmploie() {
        return emploie;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    @Override
    public String toString() {
        return "\nEmployee = \n[" +
                "Employee Number : " + empNumber
                + "\n["+ name +
                "[" + demographicInfo +
                "[" + identityType +
                "[" + contactDetails +
                "[" + addressDetails +
                "[" + emploie +
                "[" + poste +
                ']';
    }


    public static class Builder{
        private String empNumber;
        private Demographic_info demographicInfo;
        private Name name;
        private Identity_Type identityType;
        private Poste poste;
        private Emploie emploie;
        private Contact_Details contactDetails;
        private AddressDetails addressDetails;



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

        public Builder setIdentityType(Identity_Type identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setPoste(Poste poste) {
            this.poste = poste;
            return this;
        }

        public Builder setEmploie(Emploie emploie) {
            this.emploie = emploie;
            return this;
        }

        public Builder setContactDetails(Contact_Details contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder setAddressDetails(AddressDetails addressDetails) {
            this.addressDetails = addressDetails;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNumber = employee.empNumber;
            this.demographicInfo = employee.demographicInfo;
            this.name = employee.name;
            this.identityType = employee.identityType;
            this.contactDetails = employee.contactDetails;
            this.poste = employee.poste;
            this.emploie = employee.emploie;
            this.addressDetails = employee.addressDetails;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}

