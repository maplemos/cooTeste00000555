package graphics;
import java.util.InputMismatchException;

public class Rectangle extends Shape {


	/** Classe concreta para computar a area de uma figura rectangular:
	* conhece a sua largura e altura e a formula para calcular a sua
	area.
	**/
	private double _altura;
	private double _largura;
	/**
	* Inicializa esse objeto Rectangle com os valores dados para a sua
	* largura e altura.
	*/
	public Rectangle(double largura, double altura)
	{
		try{
			_altura = altura;
			_largura = largura;			
		}
		catch (InputMismatchException inputMismatchException)
		{
			System.err.printf( "\nException: %s\n", inputMismatchException ); 
			System.out.println("Os valores devem ser do tipo double " );
		}
	}
	/**
	* retorna a area desse objeto Rectangle.
	*/
	public double getArea()
	{ return _altura * _largura;
	}
	
}
