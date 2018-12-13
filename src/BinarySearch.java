public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{12,45,65,67,654,2,423,234,234},654));
    }
    public static int search(int []mas,int key){
        int min = 0;
        int max = mas.length-1;
        while (min<=max){
            int middle = min + (max-min)/2;
            if(key<mas[middle]){
                max = middle-1;
            }
            else if(key>mas[middle]){
                min = middle+1;
            }
            else return middle;
        }
        return -1;
    }
}
