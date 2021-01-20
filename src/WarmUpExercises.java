public class WarmUpExercises {
    public static void main(String[] args) {
        for (int i=100;i>=0;i-=5)
            System.out.println(i);

        // challenge 2 & 3
        for (int i=0;i<=100;i +=10)
        {
            System.out.println(i%20 == 0 ? i + " Java":i);
        }
    }
}