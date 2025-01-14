import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
    public static void main(String[] args) {

        System.out.println("Benvenuto sulla tua Rubrica Telefonica");
        Map<String,String> listaMap = new HashMap<>();
        int scelta = -1;
        Scanner scanner = new Scanner(System.in);
        while (scelta != 0) {
            System.out.println("➡️Digita 0 per uscire dal programma");
            System.out.println("➡️Digita 1 per inserire un contatto");
            System.out.println("➡️Digita 2 per eliminare un contatto");
            System.out.println("➡️Digita 3 per cercare un contatto");
            System.out.println("➡️Digita 4 per mostrare tutti i contatti");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                case 1:
                    registraContatto(listaMap);
                    System.out.println("Riepilogo contatto registrato: ");
                    String nome = listaMap.keySet().iterator().next();
                    String numero = listaMap.get(nome);
                    System.out.println("Nome: " + nome + " Numero: " + numero);
           break;
                case 2:
                    System.out.println("Funzione ancora non funzionante");
                    break;
                case 3:
                    System.out.println("Funzione ancora non funzionante");
                    break;
                case 4:
                    if (listaMap.isEmpty()) {
                        System.out.println("La rubrica è vuota.");
                    } else {
                        System.out.println("Ecco tutti i contatti:");
                        for (Map.Entry<String, String> entry : listaMap.entrySet()) {
                            System.out.println("Nome: " + entry.getKey() + " - Numero: " + entry.getValue());
                        }
                    }
                    break;

                default:
                    System.out.println("Scelta non valida!");
            }
        }




    }
    public static void registraContatto(Map<String,String> listaMap){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome della persona: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il numero della persona: ");
        String numero = scanner.nextLine();
        listaMap.put(nome,numero);
    }




    }
