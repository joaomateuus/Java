
package projetoherança;
// Importando scanner
import java.util.Scanner;

//Criando a classe pessoa física que irão herdar os atributos da classe Cliente
public class ClienteFS extends Cliente {
 // Declarando o atributo especifíco da classe cliente físico   
    private String cpf;
    
 //Desenvolvendo o método acessador e modificador(get e set), do atributo especifíco da classe pessoa física  
    public String getCpf(){
        return cpf;    
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

  //método cliente físico, que coleta os dados do cliente que é físico e imprime na tela     
    public void clientefisico(){
        //Instanciand para poder chama-los nos comandos
         ClienteFS clientefis = new ClienteFS();
          Scanner into = new Scanner (System.in); 
        
        System.out.println("Digite o nome do cliente fisico: ");
        clientefis.setNome(into.nextLine());
       
       System.out.println("Digite o endereço do Cliente fisico: ");
        clientefis.setEnder(into.nextLine());
       
       System.out.println("Digite nuemro cpf: ");
        clientefis.setCpf(into.nextLine());
       //--------------------------------------------------------------------------- 
       
        System.out.println("O nome do cliente fisico e: " +clientefis.getNome());
         System.out.println("O endereço do cliente fisico e:" +clientefis.getEnder());
          System.out.println("O cpf do cliente fisico e:" +clientefis.getCpf());
    } 
        
    }
   
    
    
    
    
    
    
    
    

