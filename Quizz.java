import java.util.ArrayList;

public class Quizz {
    private ArrayList<Questions> QuestionList;
    private int score;

    public Quizz() {
        QuestionList = new ArrayList<>();
        score = 0;
    }

    public void remplirQuizz(){
        ArrayList Reponses = new ArrayList<Reponses>();
        Reponses.add(new Reponses("vert", false));
        Reponses.add(new Reponses("rouge", false));
        Reponses.add(new Reponses("jaune", false));
        Reponses.add(new Reponses("bleu", true));

        ArrayList Reponses1 = new ArrayList<Reponses>();
        Reponses1.add(new Reponses("vert", false));
        Reponses1.add(new Reponses("rouge", true));
        Reponses1.add(new Reponses("jaune", false));
        Reponses1.add(new Reponses("bleu", false));


        Questions Question = new Questions("Quel est la couleur du ciel ?",Reponses);
        Questions Question1 = new Questions("Quel est la couleur de ma voiture ?",Reponses1);
        QuestionList.add(Question);
        QuestionList.add(Question1);
    }

    public ArrayList<Questions> getQuestionList() {
        return QuestionList;
    }

    public void setQuestionList(ArrayList<Questions> questionList) {
        QuestionList = questionList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
