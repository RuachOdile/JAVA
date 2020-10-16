
package Homework;

public class SelectionSort {

	public static void main(String[] args) {
		
		int array[]= {6,65,1,68,7};
		int lenght= array.length;
		for(int i=0;i<lenght-1;i++) {
			
			int min_index=i;
			for(int j=i;j<lenght;j++) {
				
				if(array[min_index]>array[j]) {
					min_index=j;
				}
				
				int temp=array[i];
				array[i]=array[min_index];
				array[min_index]=temp;
				
			}
			
		}


		for(int w:array) {
			System.out.print(w+" ");
		}
	}

}
