public class firstTenEven{
    public static void main(String[] args){
        
        int[] firstTen = new int[10];
        int num = 2;
            for(int i = 0; i < firstTen.length; i++){
                firstTen[i] = num;
                num += 2;
                
         }
        for(int i = 0; i < firstTen.length; i++){
            System.out.println(firstTen[i]);
        }
    }
}