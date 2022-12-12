package fr.efrei.domain;

public class Poste{
    private String CodePoste;
    private String PosteName;
    private boolean Statut;

    public Poste (){}

    public Poste (Builder builder) {
        this.CodePoste = builder.CodePoste;
        this.PosteName = builder.PosteName;
        this.Statut = builder.Statut;
    }



    public String getCodePoste() {
        return CodePoste;
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
                "Code Postal : '" + CodePoste + '\'' +
                "| PosteName : '" + PosteName + '\'' +
                "| Statut : '" + Statut + '\'' +
                "}\n";
    }

    public boolean isEmpty() {
        if (CodePoste == null && PosteName == null)
        {
            return true;
        }

        return false;
    }


    public static class Builder {
        private String CodePoste;
        private String PosteName;
        private boolean Statut;

        public Builder setCodePostal(String codePoste) {
            this.CodePoste = codePoste;
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
            this.CodePoste = poste.CodePoste;
            this.PosteName = poste.PosteName;
            this.Statut = poste.Statut;
            return this;
        }



        public Poste build (){
            return new Poste(this);
        }
    }
}
