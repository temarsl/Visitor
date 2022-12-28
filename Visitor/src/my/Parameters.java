package my;

public class Parameters implements TaskType {
    @Override
    public void beWritten(Solving solving) {
        solving.decide(this);
    }
}
