public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int arrayLength = arr.length;
        int[] reverseArray = new int[arrayLength];
        for(int i=0; i<arrayLength; i++){
            reverseArray[i] = arr[arrayLength - (i+1)];
        }
        return reverseArray;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest = -999;
        int secondLargest = -999;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if ((arr[i] < largest)&&(arr[i] > secondLargest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        
        double factor = (double)(arr[1]/arr[0]);
        for(int i = 2; i < arr.length; i++){
            if ((double) arr[i]/arr[i-1] != factor){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {2,4,8,16,32};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {2,-27,8,16,-5};
        
        System.out.println(reverse(arr1));
        System.out.println(reverse(arr2));
        System.out.println(reverse(arr3));

        System.out.println(secondLargest(arr1));
        System.out.println(secondLargest(arr2));
        System.out.println(secondLargest(arr3));

        System.out.println(isGeometric(arr1));
        System.out.println(isGeometric(arr2));
        System.out.println(isGeometric(arr3));
    }
}
