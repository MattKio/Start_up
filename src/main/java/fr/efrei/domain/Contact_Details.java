package fr.efrei.domain;

public class Contact_Details {

    private String phone_number;
    private String email;
    private String homeNumber;

    public Contact_Details() {
    }

    public String getPhone_number() {
        return phone_number;
    }

    private Contact_Details(Contact_Details.Builder builder) {
        this.phone_number = builder.phone_number;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Contact_Details{" +
                "Phone Number :'" + phone_number + '\'' +
                ", Email : " + email + '\'' +
                ", Home Number : '" + homeNumber + '\'' +
                "}\n";
    }

    public boolean isEmpty (){
        if (phone_number == null && email == null && homeNumber == null){
            return true;
        }
        return false;
    }

    public static class Builder{

        private String phone_number;
        private String email;
        private  String homeNumber;


        public Builder setPhone_number(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHome_Number(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder copy(Contact_Details contact) {

            this.phone_number = contact.phone_number;
            this.email = contact.email;
            this.homeNumber = contact.homeNumber;

            return this;
        }

        public Contact_Details build(){
            return new Contact_Details(this);

        }
    }
}
