public class find_min_value {
    public static void main(String[] args) {
        int arr[] = {4,1,5,6,2,8,9,3};
        int minValue = minValue(arr);
        System.out.println("Min value of array is: " + arr[minValue]);
    }
    public static int minValue(int arr[]){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
