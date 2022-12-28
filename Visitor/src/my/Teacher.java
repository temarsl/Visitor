package my;

public class Teacher implements Solving {
    @Override
    public void decide(Parameters parameters) {
        System.out.println("A quadratic equation has two roots when its discriminant is greater than zero");
    }

    @Override
    public void decide(Stereometry stereometry) {
        System.out.println("A straight line lying in a plane is perpendicular to an inclined line if and only if it is perpendicular to the projection of this inclined line on this plane");
    }

    @Override
    public void decide(Trigonometry trigonometry) {
        System.out.println("In 1 quarter, the cosine is greater than zero");
    }
}
