package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_11004 {
	
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
	

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] input = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < input.length; i++) {
			
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(input);
		
		System.out.println(input[m-1]);

	}
	
}
