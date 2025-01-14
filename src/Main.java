import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        int numero1 = chiediNumero();
        System.out.println("Il numero selezionato è: " + numero1);
        Scanner scanner = new Scanner(System.in);

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for(int i=0;i<numero1;i++){
            System.out.print("Inserisci delle parole");
            String righe = scanner.nextLine();
          String[] parole = righe.split(" ");
          for(String parola:parole) {
              if(!paroleDistinte.add(parola)){
                  paroleDuplicate.add(parola);
              }
          }


        }
        System.out.println("Parole duplicate: "+ paroleDuplicate);
        System.out.println("Numero di parole duplicate: "+ paroleDuplicate.size());
        System.out.println("Parole distinte: "+ paroleDistinte);

        System.out.println("Esercizio 2");
        int numero2 = chiediNumero();
        System.out.println("Il numero selezionato è: " + numero2);
System.out.println("Lista ordinata di numeri casuali⬇️");
        List<Integer> listaCasuali = randomNumber(numero2);
        Collections.sort(listaCasuali);
        System.out.println(listaCasuali);
        System.out.println("Lista ordinata di numeri casuali e inversi⬇️");
        System.out.println(listaCasuali);
        Collections.sort(listaCasuali, Collections.reverseOrder());
        System.out.println(listaCasuali);
        System.out.println("Scegli se stampare i numeri nella posizione pari o dispari ️");
        System.out.println("Inserisci true per i numeri pari o false per i numeri dispari");
        boolean pariODispari = scanner.nextBoolean();
        stampaNumeriPerPosizioni(listaCasuali,pariODispari);
    }

    public static int chiediNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero1 = scanner.nextInt();
        return numero1 ;
    }

    public static List<Integer> randomNumber(int n) {
        List<Integer> listaCasuali = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int numeroCasuale = random.nextInt(100) + 1;
            listaCasuali.add(numeroCasuale);
        }
return listaCasuali;
    }


    public static void stampaNumeriPerPosizioni(List <Integer> lista, boolean pari){
        if(pari){
            System.out.println("Hai scelto di visualizzare i numeri in posizione pari⬇️");
            for(int i=1;i<lista.size();i += 2){
                System.out.println(lista.get(i));
            }
        }else{
            System.out.println("Hai scelto di visualizzare i numeri in posizione dispari⬇️");
            for(int i=0;i<lista.size();i += 2){
                System.out.println(lista.get(i));
            }
        }
    }




    }