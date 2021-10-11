import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Map.Entry;

import static java.lang.Integer.parseInt;

public abstract class Question {

    //fields
    private String prompt;
    private HashMap<String, Boolean> answers;

    //constructor
    public Question(String prompt, HashMap<String, Boolean> answers) {
        this.prompt = prompt;
        this.answers = answers;
    }

    //getters & setters
    public String getPrompt() {
        return prompt;
    }
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public HashMap<String, Boolean> getAnswers() {
        return answers;
    }
    public void setAnswers(HashMap<String, Boolean> answers) {
        this.answers = answers;
    }
    //instance methods
    //display the question prompt
    public void askQuestion() {
        System.out.println(this.prompt);
    }
    //display all possible answers
    public void displayAnswers() {
        int answerNumber = 1;
        for(Map.Entry<String, Boolean> answer : answers.entrySet()) {
            System.out.println(answerNumber + ". " + answer.getKey());
            answerNumber++;
        }
    }
    //checks ONE response
    public boolean checkAnswer(String userAnswerNumberAsString) {
        StringBuilder correctAnswerNumber = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, Boolean> answer : answers.entrySet()) {
            i++;
            if(answer.getValue()) {
                //System.out.println("true fired off");
                correctAnswerNumber.append(i);
            }
        }
        //System.out.println(correctAnswerNumber + " " + userAnswerNumberAsString + " " + (userAnswerNumberAsString.equals(correctAnswerNumber.toString())));
        return (userAnswerNumberAsString.equals(correctAnswerNumber.toString()));
    }

}