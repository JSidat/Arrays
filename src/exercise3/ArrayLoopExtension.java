package exercise3;

public class ArrayLoopExtension {

	public static void main(String[] args) {
		int value = 1;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			System.out.println(arr[i] + ", " + arr[i] * 10);

		}

	}

}

// [1,2,3,4,5,6,7,8,9,10]