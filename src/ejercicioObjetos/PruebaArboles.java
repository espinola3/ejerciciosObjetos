package ejercicioObjetos;


public class PruebaArboles // Uso de solo constructores
{
	public PruebaArboles() // Constructor no tiene parámetros
	{
		System.out.println("Un árbol genérico");
	}

	public PruebaArboles(int a) // Constructor recibe un entero
	{
		System.out.println("Un árbol de " + a);
	}

	public PruebaArboles(String r) // Constructor recibe un carácter
	{
		System.out.println("Un árbol tipo " + r);
	}

	public PruebaArboles(int b, String p) // construc recibe un entero y un
											// caracter
	{
		System.out.println("Un " + p + " de " + b + " metros");
	}
}
