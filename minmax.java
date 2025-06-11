public class minmax {
    public static void main(String[] args) {
        int[] scores={10,9,15,20,30,24};
        int min=scores[0];
        int max=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i]<min){
                min=scores[i];
            }
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("Minimum score is:"+min);
        System.out.println("Maximum score is:"+max);
    }
}