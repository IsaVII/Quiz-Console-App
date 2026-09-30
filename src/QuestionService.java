public class QuestionService
{
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    } 

    public void displayQuestions() {

        System.out.println("Displaying all questions:");

        for (Question question : questions) {
            if (question != null) {
                System.out.println("ID: " + question.getId());
                System.out.println("Question: " + question.getQuestion());
                System.out.println("1. " + question.getOpt1());
                System.out.println("2. " + question.getOpt2());
                System.out.println("3. " + question.getOpt3());
                System.out.println("4. " + question.getOpt4());
                System.out.println("Answer: " + question.getAnswer());
                System.out.println();
            }
        }
    }
}
