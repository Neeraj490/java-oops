 //*************** Q2 *****************/
 
 package Ass6Thread;


class SearchThread extends Thread {
    int[] array;
    int startIndex;
    int endIndex;
    int target;
    int threadNumber;

    public SearchThread(int[] array, int target, int startIndex, int endIndex, int threadNumber) {
        this.array = array;
        this.target = target;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.threadNumber = threadNumber;
    }

    public void run() {
        long startTime = System.currentTimeMillis();

        boolean found = false;

        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] == target) {
                System.out.println("Thread " + threadNumber + " found the element at index: " + i);
                found = true;
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Thread " + threadNumber + " finished in " + (endTime - startTime) + " ms");

        if (!found) {
            System.out.println("Thread " + threadNumber + " did not find the element.");
        }
    }
}

public class Q2_6 {
    public static void main(String[] args) {
        int size = 1000000;
        int[] array = new int[size];

        // Fill array with numbers 1 to size
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        int target = 999999; // Element to search for
        int numberOfThreads = 4;
        int chunkSize = size / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize;
            int end;

            
            if (i == numberOfThreads - 1) {
                end = size;
            } else {
                end = start + chunkSize;
            }

            SearchThread thread = new SearchThread(array, target, start, end, i);
            thread.start();
        }
    }
}
