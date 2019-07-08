import java.util.Scanner;
	public class Digitar{
	public static void main(String []args){
		int digito;
	Scanner lee =new Scanner(System.in);
	
	System.out.printf("Ingrese el digito: ");
	digito=lee.nextInt();
	
	
Tablam obj=new Tablam(digito);
obj.Multi();
	}
}