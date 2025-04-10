import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese el nombre del estudiante");
String NombreEstudiante= sc.nextLine();
        System.out.println("Ingrese el documento de estudiante");
        String DocumentoEstudiante=sc.nextLine();
        System.out.println("Seleccione el programa: \n1-Desarrollo de Softaware \n2-Diseño Grafico\n3-Gastronomia");
        String Programa = sc.nextLine();
        switch (Programa){
            case "1":
                System. out.println("Programa de Desarrllo de Software");
                System.out.println("Seleccione la materia: \n1 - Logica de Programación \n 2 - Metodologias ágiles \n 3 - Introduccion a la programación");
                String Materia = sc.nextLine();
                switch (Materia) {
                    case "1":
                        System.out.println("Nota de logica de Programación");
                    break;
                    case "2":
                        System.out.println("Nota de Metodologias agiles");
                        break;
                }
              break;
            case "2":
                System.out.println("Diseño Grafico");
                break;
            case "3":
                System.out.println("Gastronomia");
                break;


        }
    }
}