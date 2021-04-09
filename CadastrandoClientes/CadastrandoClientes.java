
package projetoherança;
//importando scanner
import java.util.Scanner;


public class ClasseApp {
    
    // Método principal que irá ser executado
    public static void main(String[] args){
        //Declarando variavel que irá ser usada na condicional
       int numero;
      
      
       //instanciando-os para poderem serem chamados pelos comandos
        Scanner into = new Scanner (System.in);
        ClienteFS clientefisic= new ClienteFS();
        ClientePJ clienteju= new ClientePJ();
        
    //Output perguntando se o usuario quer escolher pessoa fisíca ou jurídica
         System.out.print("Digite 1 para cliente fisico ou 2 para cliente juridico");
    //Input da reposta do usúario     
         numero = into.nextInt();
     //Estrutura condicional que encaminha para o método clientefisico caso aperte 1, ou para clientejuridico se apertar 2     
         if(numero==1){
            clientefisic.clientefisico();
         }else{ 
           clienteju.clientejuridico();      
         }
    }   
}
    
    
    
    
    
    
    

