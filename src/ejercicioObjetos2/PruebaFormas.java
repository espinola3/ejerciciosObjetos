package ejercicioObjetos2;


public class PruebaFormas {
	public static void main(String[] args) {
		Forma[] f = new Forma[3];
		f[0] = new Forma();
		f[1] = new Circulo();
		f[2] = new Cuadrado();

		for (int i = 0; i < f.length; i++)
		{
			f[i].queEs();
		}
	}
}