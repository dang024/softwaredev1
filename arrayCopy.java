public class arrayCopy{
    public static void main(String[] args){
        
        int[] evensArr = {2,4,6,8};
        int[] oddsArr = {1,3,5,7};
        
        System.out.println("Evens: ");
        for (int even : evensArr) System.out.println(even);
        
        System.out.println("Odds: ");
        for (int odd : oddsArr) System.out.println(odd);
        
        oddsArr = evensArr;
        
        System.out.println("Evens: ");
        for (int even : evensArr) System.out.println(even);
        
        System.out.println("Odds: ");
        for (int odd : oddsArr) System.out.println(odd);
    }
}