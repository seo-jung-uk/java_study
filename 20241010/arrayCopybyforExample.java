public class arrayCopybyforExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2,3 };
        int[] newIntarray = new int[5];
        for(int i=0; i<oldIntArray.length;i++) {
            newIntarray[i] = oldIntArray[i];
        }

    }
}
