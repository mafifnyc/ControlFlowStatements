
public class RemoveElement {
    public static void main(String[] args) {


    int arr1[] = {10,20,30,40,50,60,70,80,90,100};
    int index = 3;
    for(int i=index; i<arr1.length-1; i++) {
        arr1[i] = arr1[i+1];

    }
    for(int j =0; j<arr1.length; j++) {
        System.out.println(arr1[j]);
    }
    }
}
