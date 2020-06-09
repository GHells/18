
package Model;

import java.util.Arrays;

     public class Cadastro{
        private int [] idade;
        
        public Cadastro(){
            this.idade = new int[20];
         
    }

        public int[] getIdade() {
        return idade;
    }

        public void setIdade(int[] idade) {
        this.idade = idade;
    }
        
        @Override
        public String toString(){
            return  "Cadastro de Idades: " + Arrays.toString(this.idade);
        }
        public void cadastrar(int i, int idade){
            this.idade[i] = idade;
        }
        public int calcularMedia(){
            int acum = 0;
            for (int i=0; i < this.idade.length; i++) {
                acum = acum + this.idade[i];
            }
            return acum/this.idade.length;
        }  
       
        public int acharMaoir(){
            int maior = this.idade[0];
             for (int  i=0; i < this.idade.length; i++){
                if(this.idade[i]>maior){
                    maior = this.idade[i];
                }
            }
            return maior;
        }
        
         public int acharMenor(){
            int menor = this.idade[0];
             for (int  i=0; i < this.idade.length; i++){
                if(this.idade[i]<menor){
                    menor = this.idade[i];
                }
             }
            return menor;
         }
         
        public int contarMaiores18(){
            int contIdades = 0;
            for (int i=0; i<this.idade.length; i++) {
                if (this.idade[i]>18) {
                    contIdades++;
                } 
            }
            return contIdades;
        }

    
    }
  

