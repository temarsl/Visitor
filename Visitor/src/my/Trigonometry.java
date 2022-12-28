package my;

public class Trigonometry implements TaskType {
    @Override
    public void beWritten(Solving solving) {
        solving.decide(this);
    }
}
