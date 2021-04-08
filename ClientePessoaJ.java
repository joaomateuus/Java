
package projetoherança;
//Importando scanner
import java.util.Scanner;

//Criando classe pessoa jurídica, que tambem irá herdar atributos da classe Cliente
public class ClientePJ extends Cliente{
 //Declarando atributo específico da classe Cliente Jurídico   
    private String cnpj;
    
   //Desenvolvendo o método acessador e modificador(get e set), do atributo específico da classe Pessoa Juridica
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    
  //método clientejuridico, que coleta as informações do cliente que é pessoa jurídica e mostra na tela  
    public void clientejuridico(){
        ClientePJ clientejur = new ClientePJ();
        Scanner into= new Scanner (System.in);
        
         System.out.println("Digite o nome do cliente juridico:");
         clientejur.setNome(into.nextLine());
        
        System.out.println("Digite o endereço do cliente juridico");
         clientejur.setEnder(into.nextLine());
        
        System.out.println("Digite o cnpj do cliente juridico: ");
         clientejur.setCnpj(into.nextLine());
     
        
        System.out.println("O nome do cliente juridico é: " +clientejur.getNome());
         System.out.println("O endereço do cliente juridico é: "+clientejur.getEnder());
          System.out.println("O cnpj do cliente é: " +clientejur.getCnpj());    
    }    
}
