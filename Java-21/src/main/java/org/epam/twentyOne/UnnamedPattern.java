import org.epam.twenty.RecordPatternPreview;
import org.epam.twenty.Shape;

import java.util.List;

void main() {
    var shape = new Shape("Name", 20);

    if (shape instanceof Shape(_, int y)) {
        System.out.println(STR."y = \{y}");
    }
    List<Integer> list = List.of(1, 2, 3, 4, 5);

    for (int _ : list) {
        System.out.println("Repeat something....!");
    }
}


