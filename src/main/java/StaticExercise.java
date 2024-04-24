public class StaticExercise {
    static int totalCount = 0;
    int instanceCount = 0;

    static void incrementTotalCount(){
        totalCount++;
    }

    void incrementInstanceCount(){
     instanceCount++;
    }

    @Override
    public String toString() {
        return "StaticExercise{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
