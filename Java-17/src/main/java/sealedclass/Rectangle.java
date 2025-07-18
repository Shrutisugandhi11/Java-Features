package sealedclass;

public sealed abstract class Rectangle implements Shape permits Rhombus {
    @Override
    public int area() {
        return 0;
    }
    public abstract boolean isSealed();
}
