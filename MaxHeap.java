import java.util.*;

class FindKSmallestElementUsingMaxHeap{
	public static void main(String[] args){
		int arr[]={7,10,4,3,20,15};
		int k=3;
		int size=6;
		System.out.println(findKthSmallestElement(arr,k,size));
	
	}
private static int findKthSmallestElement(int[] arr, int k, int size) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int i = 0; i < size; i++) {
      maxHeap.add(arr[i]);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
    return maxHeap.peek();
 }
 }