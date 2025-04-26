import java.util.Scanner;

class AdivinarPersonaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirPersonajes();
        System.out.println("Voy a hacerte 5 preguntas para adivinar el personaje, responde con si o no.");

        if(pregunta(scanner, "Tu persona es ficticio?")) {
            personajeFicticio(scanner);
        }else {
            personajeReal(scanner);
        }
        scanner.close();
    }

    static void imprimirPersonajes() {
        System.out.println("Piensa en un personaje de la siguiente lista y no lo digas:");
        System.out.println("Radamel Falcao García\nGoku\nMichael Jordan\nEminem\nDarth Vader\nAdam Sandler");
        System.out.println("Bruce Wayne\nTin Tin\nAyudante de Santa\nJoe Biden\nJosé Saramago\nGünter Grass\nKim Jong Un.");
    }

    static boolean pregunta(Scanner scanner, String pregunta) {
        System.out.println(pregunta);
        return scanner.nextLine().equalsIgnoreCase("si");
    }

    static void personajeFicticio(Scanner scanner) {
        if (pregunta(scanner, "Ha sido revivido?")) {
            System.out.println("Tu personaje es Goku.");
        } else if(pregunta(scanner, "Tiene mucha plata?")){
            System.out.println("Tu personaje es Bruce Wayne.");
        } else if(pregunta(scanner, "Es amigo de Bart?")) {
            System.out.println("Tu personaje es Ayudante de Santa.");
        } else if(pregunta(scanner, "Es el cucho de Leia?")) {
            System.out.println("Tu personaje es Darth Vader.");
        }  else {
            System.out.println("Tu personaje es Tin Tin.");
        }
    }

    static void personajeReal(Scanner scanner) {

        if(pregunta(scanner, "Hace deporte?")) {
            if(pregunta(scanner, "Usa el número 9?")) {
                System.out.println("Tu personaje es Radamel Falcao García.");
            } else {
                System.out.println("Tu personaje es Michael Jordan.");
            }
        } else {
            if(pregunta(scanner, "Tiene más de 70 años y aun vive?")) {
                if(pregunta(scanner, "Ha ganado el premio Nobel de literatura?")) {
                    System.out.println("Tu personaje es Jose Saramago.");
                } else {
                    System.out.println("Tu personaje es Joe Biden.");
                }
            } else {
                if(pregunta(scanner, "Ha hecho peliculas?")) {
                    if(pregunta(scanner, "Ha ganado un Oscar?")) {
                        System.out.println("Tu personaje es Eminem.");
                    } else {
                        System.out.println("Tu personaje es Adam Sandler.");
                    }
                } else {
                    if(pregunta(scanner, "Ha ganado el premio Nobel de literatura?")) {
                        System.out.println("Tu personaje es Guenter Grass.");
                    } else {
                        System.out.println("Tu personaje es Kim Jong Un.");
                    }
                }
            }
        }
    }
}