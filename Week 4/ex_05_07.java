public class ex_05_07 {
    public static void main(String[] args) {
       
        int tuition = 10000;
        int fourYrs = 0;
        int tenthYr = 0;
        
        for (int year = 1; year <= 14; year ++){
            tuition += (tuition * 0.05);
            
            if (year > 10)
                fourYrs += tuition;
            
            if (year == 10)
                tenthYr = tuition;
        }
        
        System.out.println("The cost of tuition after ten years will be: " + tenthYr);
        System.out.println("The cost of four years' worth of tuition after the tenth year will be: " +fourYrs);
    }
    
}   