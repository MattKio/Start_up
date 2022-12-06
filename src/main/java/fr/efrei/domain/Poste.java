package fr.efrei.domain;

public class Poste{
    private String CodePostal;
    private String PosteName;
    private boolean Statut;

    public Poste (){}

    public Poste (Builder builder) {
        this.CodePostal = builder.CodePostal;
        this.PosteName = builder.PosteName;
        this.Statut = builder.Statut;
    }



    public String getCodePostal() {
        return CodePostal;
    }

    public String getPosteName() {
        return PosteName;
    }

    public boolean getStatut() {
        return Statut;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "CodePostal='" + CodePostal + '\'' +
                ", PosteName='" + PosteName + '\'' +
                ", Statut='" + Statut + '\'' +
                '}';
    }

    public static class Builder {
        private String CodePostal;
        private String PosteName;
        private boolean Statut;

        public Builder setCodePostal(String codePostal) {
            this.CodePostal = codePostal;
            return this;
        }

        public Builder setPosteName(String posteName) {
            this.PosteName = posteName;
            return this;
        }

        public Builder setStatut(boolean statut) {
            this.Statut = statut;
            return this;
        }

        public Builder copy (Poste poste){
            this.CodePostal = poste.CodePostal;
            this.PosteName = poste.PosteName;
            this.Statut = poste.Statut;
            return this;
        }

        public Poste build (){
            return new Poste(this);
        }
    }
}
