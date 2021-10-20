import java.util.ArrayList;

public class Questions {
    private String label;
    private ArrayList<Reponses> ReponsesList;

    public Questions(String label, ArrayList<Reponses> reponsesList) {
        this.label = label;
        ReponsesList = reponsesList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<Reponses> getReponsesList() {
        return ReponsesList;
    }

    public void setReponsesList(ArrayList<Reponses> reponsesList) {
        ReponsesList = reponsesList;
    }
}
