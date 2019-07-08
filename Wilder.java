public class Wilder {


    private String firstName;
    private boolean aware;


    // constructeurs
    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    // accesseurs (getters)
    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    // mutateurs (setters)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // méthode instanciée
    public String whoAmI() {
        return "Je m'appelle " + this.getFirstName() + " et je suis " + this.isAware();
    }
}