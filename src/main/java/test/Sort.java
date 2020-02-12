package test;

public class Sort {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,1,0,6,9,8,7,11,19,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j<arr.length;j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;


                }
            }

        }
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/


       StringBuilder sb = new StringBuilder();
       sb.append("{");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("}");
            }else{
                sb.append(arr[i]).append(",");
            }

        }
        System.out.println(sb);


    }
}
