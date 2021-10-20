public class Reponses {
    private String label;
    private boolean verite;

    public Reponses(String label, boolean verite) {
        this.label = label;
        this.verite = verite;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVerite() {
        return verite;
    }

    public void setVerite(boolean verite) {
        this.verite = verite;
    }
}
