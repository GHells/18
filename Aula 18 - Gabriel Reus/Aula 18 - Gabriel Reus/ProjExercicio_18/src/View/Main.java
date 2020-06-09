package View;
import java.util.Scanner;
import Model.Cadastro;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Cadastro c1 = new Cadastro();
        
        byte Menu;
        do{
         System.out.println("Escolha: "
                 + "\n1-Cadastrar as Idades"
                 + "\n2-Idades Cadastradas"
                 + "\n3-Média das Idades"
                 + "\n4-Mais Velho"
                 + "\n5-Mais Novo"
                 + "\n6-Maiores de Idade"
                 + "\n0-Sair");
            Menu = ler.nextByte();
            switch(Menu){
                case 1:
                    System.out.println("Cadastrando as Idades...");
                    for (byte i=0; i<c1.getIdade().length; i++) {                        
                        System.out.println("Digite a "+(i+1)+"ª Idade: ");
                        int idade = ler.nextInt();
                        while(idade<0 || idade>=122){
                            System.out.println("===================================");
                            System.out.println("             IDADE FALSA           ");
                            System.out.println("obs:Digite uma idade abaixo de 122.");
                            System.out.println("==================================="); 
                            idade = ler.nextInt();
                        }
                        c1.cadastrar(i, idade);
                    } 
                    break;
                case 2:
                    System.out.println(c1);
                    break;
                case 3:
                    System.out.println("A Média das Idades é: "+c1.calcularMedia());
                    break;
                case 4:
                    System.out.println("O Mais Velho Tem: "+c1.acharMaoir());
                    break;
                case 5:
                    System.out.println("O Mains Novo Tem: "+c1.acharMenor());
                    break;
                case 6:
                    System.out.println("Maiores de Idade: "+ c1.contarMaiores18());                 
                    break;  
                case 0:
                    System.out.println("Volte Sempre!!!");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }while (Menu!= 0);
        
        
    }
}
