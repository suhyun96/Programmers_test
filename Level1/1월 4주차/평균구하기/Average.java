public class Average {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        double answer = 0;
        double sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        answer=sum/arr.length;
        //return answer;
    }
}
