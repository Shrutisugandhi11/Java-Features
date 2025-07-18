package sealedclass;

public sealed interface Shape permits Rectangle,Circle,Square{
    public int area();
}
