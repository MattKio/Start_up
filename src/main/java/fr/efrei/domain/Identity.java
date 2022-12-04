package fr.efrei.domain;

public class Identity {

    private String Passport_id;
    private String NIC_id;

    private Identity (){}

    private Identity (Builder builder){
        this.NIC_id = builder.NIC_id;
        this.Passport_id = builder.Passport_id;
    }

    public String getPassport_id() {
        return Passport_id;
    }

    public String getNIC_id() {
        return NIC_id;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "Passport_id='" + Passport_id + '\'' +
                ", NIC_id='" + NIC_id + '\'' +
                '}';
    }

    public static class Builder {
        private String Passport_id;
        private String NIC_id;

        public Builder setPassport_id(String passport_id) {
            this.Passport_id = passport_id;
            return this;
        }

        public Builder setNIC_id(String NIC_id) {
            this.NIC_id = NIC_id;
            return this;
        }

        public Builder copy (Identity identity) {
            this.NIC_id = identity.NIC_id;
            this.Passport_id = identity.Passport_id;
            return this;
        }

        public Identity build (){
            return new Identity(this);
        }
    }
}
