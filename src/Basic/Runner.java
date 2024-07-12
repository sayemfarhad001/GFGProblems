package Basic;


public class Runner {
    public static void main(String[] args) {

        //ArraySubset
        ArraySubset arraySubset = new ArraySubset();
        long arr1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long arr2[] = {11, 3, 7, 1, 7};
        arraySubset.isSubset(arr1, arr2, arr1.length, arr2.length);


    }
}
