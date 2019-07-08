public class Tablam{
	private int digito;

	public Tablam(int digito){
		this.digito=digito;
	}

	public void setDigito(int digito){
		digito=digito;
	}
	public int getDigito(){
		return digito;
	}

	public void Multi(){

	int m;
	int i;
	m= (i*digito);
	for( i=0;i<=digito;i++){
	System.out.printf("la tabla es"+m);
	}
}
	}