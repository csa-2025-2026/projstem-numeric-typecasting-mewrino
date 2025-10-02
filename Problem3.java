public class Problem3
{
    public static void main(String[] args)
    {
        double num = 867.5309;
        int truncNum = (int) (num * 1000); // 867530
        System.out.println(truncNum % 10); // 0
        truncNum = truncNum / 10; // 86753
        System.out.println(truncNum % 10); // 3
        truncNum /= 10; // 8675
        System.out.println(truncNum % 10); // 5
        truncNum /= 10; // 867

        // get every digit algorithm (backwards)
        // mod 10 -> divide 10

    }

}
