package fr.efrei.domain;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;


    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "NAME {" +
                " Firstname : '" + firstName + '\'' +
                " | Middlename : '" + middleName + '\'' +
                " | Lastname='" + lastName + '\'' +
                "}\n";
    }

    public boolean isEmpty() {
        if (firstName == null && middleName == null && lastName == null)
        {
          return true;
        }

        return false;
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
