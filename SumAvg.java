public class SumAvg {
    public static void main(String[] args) {
        int[] scores={10,9,15,20,30,24};
        int sum=0;
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        int avg=sum/scores.length;
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+avg);
    }
}