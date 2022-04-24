package assignment_dsa;

public class april_21 {
/*
 * 	"1. Given two sorted arrays, the task is to merge them in a sorted manner.

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 1.

2. In which scenario do you use linked list and arraylist?

3. Given an array of both positive and negative integers ‘arr[]’ which are sorted. 
The task is to sort the square of the numbers of the Array. 
Time complexity: O(n) 
space complexity: O(n) "
 */
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 5};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
     
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
        int arr[] = { -6, -3, -1, 2, 4, 5 };
        int n = arr.length;
     
        System.out.println("Before sort ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
     
        sortSquares(arr);
        System.out.println("");
        System.out.println("After Sort ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
	
	//1.
		public static void mergeArrays(int[] arr1, int[] arr2, int n1,int n2, int[] arr3)           
		{
		int i = 0, j = 0, k = 0;
		while (i<n1 && j <n2)
		{
		if (arr1[i] < arr2[j])
		arr3[k++] = arr1[i++];
		else
		arr3[k++] = arr2[j++];
		}
		while (i < n1)
		arr3[k++] = arr1[i++];
		while (j < n2)
		arr3[k++] = arr2[j++];
		}
	//2.
		/*
		 * linked list will be used in :-where modifications to a 
		 * collection are frequent like addition/deletion operations
		 */
		
	//3.
		public static void sortSquares(int arr[])
		{
		    int n = arr.length, left = 0,
		        right = n - 1;
		     
		    int result[] = new int[n];
		     
		    for(int index = n - 1; index >= 0; index--)
		    {
		        if (Math.abs(arr[left]) > arr[right])
		        {
		            result[index] = arr[left] * arr[left];
		            left++;
		        }
		        else
		        {
		            result[index] = arr[right] * arr[right];
		            right--;
		        }
		    }
		    for(int i = 0; i < n; i++)
		        arr[i] = result[i];
		}
}
