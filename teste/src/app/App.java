package app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        class Aluno { 
            //idade 
            int id =0;
            //nome    
            String nome="";
            //sexo
            char sexo;
            //telefone
            int telefone;
            //metodos
            //metodo ler nome do aluno
            String preNome(){
            Scanner ler = new Scanner(System.in).useLocale(Locale.US);
            String x;
            System.out.print("escreva o novo nome: ");
            x= ler.nextLine();
            System.out.println("esse e o novo nome: "+x);
            return x;
            }
            //metodo ler idade do aluno
            int preId(){
                Scanner ler = new Scanner(System.in).useLocale(Locale.US);
                int x;
                System.out.print("escreva a nova idade: ");
                x= ler.nextInt();
                System.out.println("esse e a nova idade: "+x);
                return x;
            }
            //metodo ler sexo do aluno
            char preSex(){
                Scanner ler = new Scanner(System.in).useLocale(Locale.US);
                char x;
                System.out.print("escreva o sexo: ");
                x= ler.next().charAt(0);
                System.out.println("esse e o novo sexo: "+x);
                return x;
            }
            //metodo ler telefone do aluno
            int preTele(){
                Scanner ler = new Scanner(System.in).useLocale(Locale.US);
                int x;
                System.out.print("escreva seu telefone: ");
                x= ler.nextInt();
                System.out.println("esse e o novo telefone: "+x);
                return x;
            }
            //metodo mostrar dados do aluno
            void mostra(){
                System.out.println("esses sao os valores do aluno: "+this.nome);
                System.out.println("nome: "+this.nome);
                System.out.println("telefone: "+this.telefone);
                System.out.println("sexo: "+this.sexo);
                System.out.println("idade: "+this.id);
            }   
        }

        Aluno gabriel = new Aluno();
        gabriel.nome = gabriel.preNome();
        gabriel.telefone = gabriel.preTele();
        gabriel.sexo = gabriel.preSex();
        gabriel.id = gabriel.preId();
        gabriel.mostra();

    }
}
