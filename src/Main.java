import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double NotaExamenParcial = 0, NotaTaller= 0, NotaFinal=0, NotaMateria = 0;
String Materia = "";
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
                Materia = sc.nextLine();
                switch (Materia) {
                    case "1":
                        System.out.println("Notas de logica de Programación");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de logica" + NotaMateria);
                        if (NotaMateria < 2){
                            System.out.println("Perdió Definitivamente");
                        } else if (NotaMateria>= 2 && NotaMateria < 2.9) /*Es exactamente lo mismo*/{
                            System.out.println("Tiene Derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Usted Aprobó");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de Metodologias agiles");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de metodologías" + NotaMateria);
                        break;
                    case "3":
                        System.out.println("Notas de Introducción");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Introducción" + NotaMateria);
                        break;
                }
              break;
            case "2":
                System.out.println("Diseño Grafico");
                System.out.println("Seleccione la Materia \n1 - Tipografia \n2 - Iconografia \n3 - Semantica");
                Materia = sc.nextLine();
                switch (Materia){
                case "1":
                    System.out.println("Nota de Tipografia ");
                    System.out.print("Nota examen parcial:");
                    NotaExamenParcial = sc.nextDouble();
                    System.out.print("Nota Examen");
                    NotaTaller=sc.nextDouble();
                    System.out.print("Nota Taller");
                    NotaFinal =sc.nextDouble();
                    NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                    System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Tipografia" + NotaMateria);
                    break;
                case "2":
                    System.out.println("Nota de Iconografia ");
                    System.out.print("Nota examen parcial:");
                    NotaExamenParcial = sc.nextDouble();
                    System.out.print("Nota Examen");
                    NotaTaller=sc.nextDouble();
                    System.out.print("Nota Taller");
                    NotaFinal =sc.nextDouble();
                    NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                    System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Iconografia" + NotaMateria);
                    break;
                case "3":
                    System.out.println("Nota de Semantica ");
                    System.out.print("Nota examen parcial:");
                    NotaExamenParcial = sc.nextDouble();
                    System.out.print("Nota Examen");
                    NotaTaller=sc.nextDouble();
                    System.out.print("Nota Taller");
                    NotaFinal =sc.nextDouble();
                    NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                    System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Semantica" + NotaMateria);
                    break;
                }
            case "3":
                System.out.println("Gastronomia");
                System.out.println("Seleccione la Materia \n1 - Costos \n2 - Panaderia Dulce \n3 - Cocina Internacional");
                Materia = sc.nextLine();
                switch (Materia){
                    case"1":
                        System.out.println("Nota de Costos ");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Costos" + NotaMateria);
                        break;

                    case "2":
                        System.out.println("Nota de Panaderia Dulce ");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Panaderia Dulce" + NotaMateria);
                        break;

                    case"3":
                        System.out.println("Nota de Cocina Internacional ");
                        System.out.print("Nota examen parcial:");
                        NotaExamenParcial = sc.nextDouble();
                        System.out.print("Nota Examen");
                        NotaTaller=sc.nextDouble();
                        System.out.print("Nota Taller");
                        NotaFinal =sc.nextDouble();
                        NotaMateria =(NotaExamenParcial *0.2) + (NotaTaller * 0.3)+(NotaFinal * 0.5);
                        System.out.print("El estudiante" + NombreEstudiante + "tiene la siguiente nota en la materia de Cocina Internacional" + NotaMateria);
                        break;
            }
        }
    }
}