package graphics;

import java.util.InputMismatchException;

public class Circle extends Shape {
	
	/**
	* Classe concreta para computar a area de uma figura circular: conhece
	* o seu raio e a formula para calcular sua area.
	**/
	private double _raio;
	/**
	* Initializa esse objeto Circle com um raio dado.
	**/
	public Circle(double raio)
	{
		try{
			_raio = raio;
		}
		catch (InputMismatchException inputMismatchException)
		{
			System.err.printf( "\nException: %s\n", inputMismatchException ); 
			System.out.println("Os valores devem ser do tipo double " );
		}
	}
	/**
	* @retorna a area desse objeto Circle.
	*/
	public double getArea()
	{ 
		return Math.PI * _raio * _raio;
	}
	
}
