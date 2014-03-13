package ejercicioObjetos2;

public class Forma {

	public String Forma = "generica";
	public Forma(){
	}
	public Forma(String Forma){
		this.Forma = Forma;
	}
	public void queEs() {
		System.out.println("Un objeto de Forma: " + this.Forma);
	}

}
