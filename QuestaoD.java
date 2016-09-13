package treinando;

import java.util.Date;
import java.util.Scanner;

public class QuestaoD {
	public static void main(String[] args) {
		Date start = new Date();
		Scanner ler = new Scanner(System.in);
		String[] entrada = ler.nextLine().split(" "); 
		int a = Integer.parseInt(entrada[0]);
		int b = Integer.parseInt(entrada[1]);
		int c = Integer.parseInt(entrada[2]);
		int d = Integer.parseInt(entrada[3]);
		
		if(	
			   a>0 && b>0 && c>0 && d>0 && 
			   a<=Math.pow(10, 9) && b<=Math.pow(10, 9) &&
			   c<=Math.pow(10, 9) && d<=Math.pow(10, 9) 
		  ){
			if(c%a==0){
				boolean sucesso = false;
				int aux = c/a;
				for(int i = a;i<=aux;i = i+a){
					if(i%a == 0 && i%b != 0 && c%i == 0 && d%i != 0){
						System.out.println(i);
						sucesso = true;
						break;
					}
				}
				if(!sucesso) System.out.println("-1");
				
			}else System.out.println("-1");
		}
		Date now = new Date();
		long millis = now.getTime() - start.getTime();
		System.out.println(millis);

	}

}
