public class Answers {

    private List<String> answers;

    public Answers(List<String> answers) {
        this.answers = answers;
    }

    public void add(String answer){
        answers.add(answer);
    }

    public List<String> getAnswers() {
        return answers;
    }
}
