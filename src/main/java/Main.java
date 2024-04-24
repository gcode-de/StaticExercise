public class Main {

    public static void main(String[] args) {

    //Static
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

    //Calculator
    System.out.println(Calculator.add(2,3));
    System.out.println(Calculator.subtract(2,3));
    System.out.println(Calculator.multiply(2,3));
    System.out.println(Calculator.divide(6,2));

    }


}
