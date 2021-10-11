import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class QuizRunner {

    public static void main(String args[]) {

        String quizRules = "Please select the correct answers using the num pad";

        HashMap<String, Boolean> testHM = new HashMap<String,Boolean>();
        testHM.put("Nachos", true);
        testHM.put("Spam",false);
        testHM.put("Turkey",false);
        testHM.put("PB Sando",false);
        MultipleChoice testQuestionOne = new MultipleChoice("What's the best food?", testHM);
        ArrayList<Question> testListOne = new ArrayList<>();
        testListOne.add(testQuestionOne);
        Quiz testQuizOne = new Quiz("test","type = remove this",testListOne);HashMap<String, Boolean> testHM2 = new HashMap<String,Boolean>();
        testHM2.put("False",true);
        testHM2.put("True",false);
        TrueFalse testQuestionTwo = new TrueFalse("True or False: Beans are fine on nachos.",testHM2 );
        testQuizOne.addQuestion(testQuestionTwo);

        System.out.println(quizRules);
        testQuizOne.runQuiz();
        testQuizOne.gradeQuiz();
    }

}