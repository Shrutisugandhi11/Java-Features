record Shape(String name, int area) {
}

public class RecordPatternPreview {
    public static void main(String[] args) {
        Shape shape = new Shape("Square", 4);

        if(shape instanceof Shape(String string,int i)){
            System.out.println("True");
        }
        else
            System.out.println("False");


    }


}

