public class Max {
    public static void main(String[] args) {
        int[] num={12,34,56,2,34,3};
        int max=num[0];
        for(int i=1;i<=num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
    
}
