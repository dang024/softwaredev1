public class linearSearch{
    public static void main(String[] args){
        int[] list = {1,4,4,2,5,-3,6,2};
        int i = linearSearch(list, 4);
        System.out.println("4 was found at index " + i);
        int j = linearSearch(list, -4);
        System.out.println("-4 was found at index " + j);
        int k = linearSearch(list, -3);
        System.out.println("-3 was found at index " + k);
    }
    
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i ++){
            if (key == list[i]){
                return i;
            }
        }
        return -1;
    }
}