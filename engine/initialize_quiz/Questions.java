public class Questions {

    private List<Question> questions;

    public Questions(List<Question> questions) {
        this.questions = questions;
    }

    public String getQuestion(int id){
        Question question = questions.get(id);
        return question.getQuestion();
    }

    public String getAnswers(int id){
        Question question = questions.get(id);
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (String answer : question.getAnswers()) {
            counter++;
            stringBuilder.append(counter).append(". ").append(answer).append("\n");
        }
        return stringBuilder.toString();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public int getGoodAnswer(int id){
        Question question = questions.get(id);
        return question.getGoodAnswer();
    }

    public String getExplanation(int id) {
        Question question = questions.get(id);
        return question.getExplanation();
    }
}
