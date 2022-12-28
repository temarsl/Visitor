package site;

public interface Shape { // фигура
    void move(int x, int y); // передвижение
    void draw(); // рисовать
    String accept(Visitor visitor); // принимает посетителя
}