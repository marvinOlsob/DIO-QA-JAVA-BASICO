
import java.nio.channels.ClosedSelectorException;
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) throws Exception {
        //Scanner leitor = new Scanner(System.in);

        int idade1 = 22;
        int idade2 = 18;
        int idade3 = 35;

        int somaIdades = somarIdade(idade1, idade2, idade3);

        if( (somaIdades/2) > 60){
            System.out.println("Idosa!");
        } else if ( (somaIdades/2) >= 26 && (somaIdades/2) <= 60) {
            System.out.println("Adulta");
        } else if ( (somaIdades/2) >= 0 && (somaIdades/2) <= 25) {
            System.out.println("Jovem");
        }
       
    }

    public static int somarIdade(int idade1, int idade2, int idade3){
        return idade1+idade2+idade3;
    }
}
