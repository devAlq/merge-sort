public class Main {

  public static void main(String[] args){

  int[] array = {
    66,22,33,11,44
  };

int [] mergedArray = merge(array);
for(int x = 0; x < mergedArray.length; x++){
  System.out.println(mergedArray[x]);
}


  
	
  }

  public static int[] merge(int[] array){
    if(array.length <= 1){
      return array;}
    int mid = array.length/2;

    int [] left = new int[mid];
    int[] right = new int[array.length - mid];
    System.arraycopy(array, 0, left, 0, mid);
    System.arraycopy(array, mid, right, 0, array.length - mid);


    left = merge(left);

    right = merge(right);



    return sort(left, right);
    
     }
  public static int[] sort(int[] left, int[] right){
    int[] mergedArray = new int[left.length + right.length];
    int i = 0;

    int j = 0;
    int k = 0;
    while(i < left.length && j< right.length){
      if(left[i] <= right[j]){
        mergedArray[k] =left[i];
        i++;
    }else{
      mergedArray[k] = right[j];
      j++;
    }k++;


    
  }
  while (i < left.length) {
    mergedArray[k] = left[i];
    i++;
    k++;
  }while (j < right.length) {
    mergedArray[k] = right[j];
    j++;
    k++; 
  }  return mergedArray;
}}
