
class J1{
    public static void countnum(int arr[],int a){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == a){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int a = 3;
        int arr[] = {1,3,3,3,3};
        countnum(arr, a);
    }
}