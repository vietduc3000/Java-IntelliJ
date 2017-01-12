//Learning algorithm to reverse array

public class Main {

    public static void main(String[] args) {
	// write your code here

        int  arrayList[]={7,2,9,4,5};
        int variableSwap = arrayList.length - 1 ;

        /* WRONG !!! arrange array in reverse order WRONG !!! logic wrong
        for (int i=0 ; i < arrayList.length ; i++){
            arrayList[i]=arrayList[variableswap];
            variableswap --;

            System.out.print(" " + arrayList[i]); ---> {5,4,9,4,5} . Index [3],[4] use index 0 and 1 which are already 5 and 4
        } */

        //Create new array approach
        /* int reverseSwap[] = new int[arrayList.length];
        for (int i = 0; i < arrayList.length; i++ ){
            reverseSwap[i]=arrayList[variableSwap];
            variableSwap --;
        } */

        //Using a temporary approach
        for (int i =0 ; i < arrayList.length /2 ; i++){
            int temp = arrayList[i];
            arrayList[i]=arrayList[variableSwap];
            arrayList[variableSwap]=temp;
            variableSwap --;

        }
// {5,4,9,2,7} -> {7,2,9,4,5}
        int arr[] = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // if(arrayList[i]<arrayList[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                //}
            }
        }




    }


}
