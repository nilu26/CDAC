class LengthArray {
    public void LengthOfSubarray(int[] arr) {
        int s = 0;
        while (s + 1 < arr.length && arr[s] <= arr[s + 1]) {
            s++;
        }
        if (s == arr.length - 1) {
            System.out.println("Invalid");
        }

        int e = arr.length - 1;
        while (e > s && arr[e - 1] <= arr[e]) {
            e--;
        }
        int result = Math.min(arr.length - s - 1, e);

        int i = 0;
        int j = e;
        while (i <= s && j < arr.length) {
            if (arr[j] >= arr[i]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        System.out.println(result);
    }
	
	public static void main(String args[]){
		LengthArray la=new LengthArray();
		int arr[]={1,2,3,10,4,2,3,5};
		la.LengthOfSubarray(arr);
	}
}