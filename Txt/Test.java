public class Test{
    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        System.out.println(findMax(arr));
    }
}
