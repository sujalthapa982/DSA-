class J1{
    public static void main(String[] args) {
        int arr [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int key = 3;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==key){
                    System.out.println("element found at: i="+i+"and j="+j);
                }
            }
        }
    }

}
    
