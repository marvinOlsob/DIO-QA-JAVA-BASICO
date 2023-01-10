import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
  //valor original do Produto
    int M = input.nextInt();
  // valor final do produto com desconto
    int S = input.nextInt();  
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
      
   int desconto = M - S;
   int porcentagem = (desconto * 100/ M);
  
  System.out.println("O desconto foi de " + porcentagem + "%");
}
}
