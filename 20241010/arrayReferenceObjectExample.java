public class arrayReferenceObjectExample {
    public static void main(String[] args){
        String[] strArry = new String[3];
        strArry[0] = "Java";
        strArry[1] = "java";
        strArry[2] = new String("java");

        System.out.println(strArry[0] == strArry[1]);

    }
}

