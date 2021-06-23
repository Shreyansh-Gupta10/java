public class CommandArg {
    public static void main(String[] arr) {
         
        
        int Sum = 0;
        for(int i=0;i<arr.length;i++ ){
            int number = Integer.parseInt(arr[i]);
            Sum = Sum+number;
             
        }
         
        System.out.println(Sum);
         

         
        
         
    }
}
