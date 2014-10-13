import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner id1=new Scanner(System.in);
		System.out.println("Introduce una nota(0-10)(Nota1): ");
		int nota1 =id1.nextInt();
		System.out.println("Introduce otra nota(0-10)(Nota2): ");
		int nota2= id1.nextInt();

//lehenengo zatia		
		if ((nota1 < 0) || (nota1 > 10 )) {
			System.out.println("Nota1 no es valida");
		}else{
			System.out.println("La nota1 es: "+nota1);
			if (nota1<5){
				System.out.println("Suspenso");
			}else{
				System.out.println("Aprobado");
				if (nota1==5){
					System.out.println("Nahiko");
				}
				if (nota1==6){
					System.out.println("Ongi");
				}
				if ((nota1>=7)&&(nota1<=8)){
					System.out.println("Oso Ongi");
				}
				if ((nota1>=9)&&(nota1<=10)){
					System.out.println("Bikain");
				}
				
			}
			
		}
				
		if (nota1 == 0){
			System.out.println("La nota1 es  0.");
		}else{

			if (nota1 % 2 == 0){
				System.out.println("La nota1 es par");
			}else{
				System.out.println("La nota1 es impar");
			}
		}

//bigarren zatia
		if ((nota2 < 0) || (nota2 > 10 )) {
			System.out.println("Nota2 no es valida");
		}else{
			System.out.println("La nota2 es: "+nota2);
			if (nota2<5){
				System.out.println("Suspenso");
			}else{
				System.out.println("Aprobado");
				if (nota2==5){
					System.out.println("Nahiko");
				}
				if (nota2==6){
					System.out.println("Ongi");
				}
				if ((nota2>=7)&&(nota2<=8)){
					System.out.println("Oso Ongi");
				}
				if ((nota2>=9)&&(nota2<=10)){
					System.out.println("Bikain");
				}
				
			}
			
		}
				
		if (nota2 != 0){

			if (nota2 % 2 != 0){
				System.out.println("La nota2 es impar");
			}else{
				System.out.println("La nota2 es par");
			}			
		}else{
			System.out.println("La nota1 es  0.");
		}

//Bi noten konparaketa
		if (nota1<nota2){
			System.out.println("La nota1 ("+nota1+"), es menor que la nota2 ("+nota2+")");
		}
		if (nota1==nota2){
			System.out.println("Las notas son iguales: "+nota1+" y "+nota2);
		}
		if (nota1>nota2){
			System.out.println("La nota1 ("+nota1+"), es mayor que la nota2 ("+nota2+")");
		}
		
	id1.close();//cierre del objeto Scanner
	}

}

