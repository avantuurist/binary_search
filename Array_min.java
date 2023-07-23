package scr;

public class Array_min {
    public void findSmallest(int[] ar) {
        int smallest = ar[0];


        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < smallest) {
                smallest = ar[i];

            }
        }
        System.out.println("наименьший элемент: " + smallest);
    }

}

class man {
    public static void main(String args[]) {
        Array_min d = new Array_min();
        d.findSmallest(new int[]{32, 42, 1,0,32,2});
    }
}
