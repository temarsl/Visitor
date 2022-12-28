package my;

public class Stereometry implements TaskType{
    @Override
    public void beWritten(Solving solving) {
        solving.decide(this);
    }
}
