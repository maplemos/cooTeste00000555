package demo;
import graphics.*;

public class Teste {
	public static void main (String[] args){
		Shape circulo = new Circle (10);
		Shape retangulo = new Rectangle (10, 20);
		Shape triangulo = new Triangle (10, 20, 30);
		circulo.getArea();
		retangulo.getArea();
		triangulo.getArea();
	}
}
