public class CourseOfQuiz {

    private Questions questions;
    private int questionNumber = 0;

    public void startQuiz(String name){
        JsonConverter converter = new JsonConverter(new Gson());
        questions = converter.readFromFile("../../questions/" + name);
        System.out.println("If you're ready, type readQuestion()");
    }

    public void readQuestion(){
        System.out.println(questions.getQuestion(questionNumber));
        questionNumber++;
    }
}
