package scr;

public class  Binary_search {
    int[] array = {1,2,3,4,5};

    public int binarySearch(int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == item)
                return mid;

            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}

class main_binary {
    public static void main(String args[]) {
        Binary_search A = new Binary_search();
        int g = A.binarySearch(1);
        System.out.println(g);
    }
}

