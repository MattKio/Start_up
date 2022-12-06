package fr.efrei.domain;

public class Contact_details {
    private String PhoneNumber;
    private String Email;
    private String HomeNumber;

    private Contact_details (){}

    private Contact_details (Builder builder){
        this.PhoneNumber = builder.PhoneNumber;
        this.Email = builder.Email;
        this.HomeNumber = builder.HomeNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getHomeNumber() {
        return HomeNumber;
    }

    @Override
    public String toString() {
        return "Contact_details{" +
                "PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", HomeNumber='" + HomeNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String PhoneNumber;
        private String Email;
        private String HomeNumber;

        public Builder setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.Email = email;
            return this;
        }

        public Builder setHomeNumber(String homeNumber) {
            this.HomeNumber = homeNumber;
            return this;
        }

        public Builder copy (Contact_details contact_details){
            this.PhoneNumber = contact_details.PhoneNumber;
            this.Email = contact_details.Email;
            this.HomeNumber = contact_details.HomeNumber;
            return this;
        }

        public Contact_details build (){
            return new Contact_details(this);
        }
    }
}
