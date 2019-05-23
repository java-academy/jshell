public class Question {

    private static int nextId = 0;
    private int id;
    private String question;
    private Answers answers;
    private int goodAnswer;
    private String explanation;

    public Question(String question, Answers answers, int goodAnswer, String explanation) {
        this.question = question;
        this.answers = answers;
        this.goodAnswer = goodAnswer;
        this.explanation = explanation;
        this.id = nextId;
        nextId++;
    }

    public String getQuestion(){
        return question;
    }

    public List<String> getAnswers(){
        return answers.getAnswers();
    }

    public int getGoodAnswer(){
        return goodAnswer;
    }

    public String getExplanation() {
        return explanation;
    }
}

