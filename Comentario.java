import java.util.Scanner;

public class Comentario {

    public static void main(String[] args) {

      String comentarios = "";
      Scanner scan = new Scanner(System.in);

      System.out.println("Poste seu comentatario: ");
      comentarios += scan.nextLine();

      String[] palavrao = {
        "vsfd", "arrombado", "lixo", "feminista"
      };

      for(int i = 0; i < palavrao.length; i++) {
        if(comentarios.contains(palavrao[i])) {
           System.err.println("Voce nao pode digitar isso");
        return;
      }
    }

      while(comentarios != "jsjs777") {
         System.out.println("\nComentarios: \n" + comentarios + "\n");
         System.out.println("Deseja postar mais algo? (s/n)");
         char decisao = scan.next().charAt(0);
         if(decisao == 's') {
            System.out.println("Escreva oque deseja comentar mais: ");
            comentarios += "\n" + scan.next();
         } else {
           System.out.println("\nComentarios: \n" + comentarios + "\n");
           System.out.println("Programada finalizado\n");
           comentarios = "jsjs777";
         }
      }
    }
  }