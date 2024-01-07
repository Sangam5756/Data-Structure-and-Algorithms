public class SumOfnatural{

    public static int sumOfnatural(int number){

        if(number == 1){
            return 1;
        }
        int fnm1 =sumOfnatural(number -1);
        int sum= number + fnm1;
        return sum;
    }

    public static void main(String args[]){
        int n = sumOfnatural(5);

        System.out.println(n);
        
    }
}