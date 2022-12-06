package fr.efrei.domain;

public class Emploie extends Poste{
    private String Title;

    public Emploie (){}

    private Emploie (Builder builder){
        this.Title = builder.Title;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return "Emploie{" +
                "Title='" + Title + '\'' +
                '}';
    }

    public static class Builder {
        private String Title;

        public Builder setTitle(String title) {
            this.Title = title;
            return this;
        }

        public Builder copy (Emploie emploie){
            this.Title = emploie.Title;
            return this;
        }

        public Emploie build (){
            return new Emploie(this);
        }
    }
}
