package ejercicioObjetos;

public class Principal {
	public static void main(String[] args) {
		PruebaArboles arbol1;
		arbol1 = new PruebaArboles(4); // new llamada directa al constructor
		PruebaArboles arbol2;
		arbol2 = new PruebaArboles("Roble"); // dato un caracter
		PruebaArboles arbol3;
		arbol3 = new PruebaArboles(); // no recibe nada
		PruebaArboles arbol4;
		arbol4 = new PruebaArboles(5, "Pino"); // dato un entero y caracter
	}
}
