public class PreludeArray {

    public static void main(String[] args) {
        //Deklarasi
        //Maksimal kumpulan data yang dapat ditampung berjumlah 10
        String[] users = new String[10];

        //Mengisi nilai array
        users[0] = "Seng Hansun";
        users[1] = "Arya Wicaksana";

        //Jumlah maksimal sesuai dengan kumpulan data yang ada di Array
        int[] numbers = {1,2,3,4,5};

        printArray(numbers);w

        numbers = setArray();

        printArray(numbers);
    }

    //Passing array ke method
    public static void printArray(int[] numbers) {
        //memproses array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //Returning array dari method
    public static int[] setArray() {
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
