public class Main {

    public static void main(String[] args) {

    StaticExercise ex1 = new StaticExercise();
    StaticExercise ex2 = new StaticExercise();

    ex1.incrementInstanceCount();
    ex1.incrementInstanceCount();

    ex2.incrementInstanceCount();

    StaticExercise.incrementTotalCount();
    StaticExercise.incrementTotalCount();
    StaticExercise.incrementTotalCount();
        System.out.println(ex1);
        System.out.println(ex2);
    }
}
