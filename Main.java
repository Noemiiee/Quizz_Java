import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Quizz Quizz = new Quizz();
       Quizz.remplirQuizz();
       System.out.println(Quizz);



        for (Questions Question: Quizz.getQuestionList()) {
            String isTrue = null;
            System.out.println(Question.getLabel());
            for (Reponses Reponse: Question.getReponsesList()) {
                System.out.println(Reponse.getLabel());
                if (Reponse.isVerite()==true){
                    isTrue = Reponse.getLabel();
                }

            }
            Scanner scanner = new Scanner(System.in);
            String valeur = scanner.nextLine();
            System.out.println(valeur);

            if(valeur.equalsIgnoreCase(isTrue)){
                System.out.println("Vrai !");
                System.out.println("");
                Quizz.setScore(Quizz.getScore()+1);
            }
            else {
                System.out.println("Faux !");
                System.out.println("");
            }
        }
        System.out.println("Vous avez fait un score de: " + Quizz.getScore() + "/" + Quizz.getQuestionList().size() );
    }
}
