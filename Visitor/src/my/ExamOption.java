package my;

public class ExamOption implements TaskType{

    TaskType[] taskTypes;

    public ExamOption() {
        this.taskTypes = new TaskType[] {
                new Parameters(),
                new Stereometry(),
                new Trigonometry()
        };
    }

    @Override
    public void beWritten(Solving solving) {
        for (TaskType taskType: taskTypes) {
            taskType.beWritten(solving);
        }
    }
}
