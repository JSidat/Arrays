package exercise2;

public class ArrayLoop {

	public static void main(String[] args) {

		int value = 1;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			System.out.println(arr[i]);
		}

		System.out.println();

		for (int j = 0; j < arr.length; j++) {
			arr[j] *= 10;
			System.out.println(arr[j]);
		}

	}

}
