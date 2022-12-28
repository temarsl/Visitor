package my;

public class Student implements Solving {
    @Override
    public void decide(Parameters parameters) {
        System.out.println("I do not know when the roots in a quadratic equation are different");
    }

    @Override
    public void decide(Stereometry stereometry) {
        System.out.println("I can't apply the three-perpendicular theorem");
    }

    @Override
    public void decide(Trigonometry trigonometry) {
        System.out.println("I wonder what is the sign of the cosine in 1 quarter");
    }
}
