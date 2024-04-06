public class SelectionSort {
  public static void main(String[] args) {
    int[] selcetionSort = new int[]{1,-9,20,90,-56,45,34,59,50};
    int min = Integer.MAX_VALUE;
    for(int i =0;i<selcetionSort.length;i++){
      if(selcetionSort[i]<min){
        min =selcetionSort[i];
      }
    for(int j =4;j>i-1;j--){
        selcetionSort[i]=selcetionSort[i-1];

      }
    }


  }
}
