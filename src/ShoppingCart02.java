public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camiseta";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declarar e inicializar campos numéricos: preço, imposto, quantidade.  
        double preco=15.5;
        double imposto = 20.5;
        int quantidade =2;
                
        // Declarar e atribuir um total
        double total;
        total=quantidade*(preco*imposto);
         
        // Modifique a mensagem para incluir a quantidade
        message=custName+" quer comprar 2 "+itemDesc;
        System.out.println(message);
        // Print another message with the total cost
        System.out.println(total);
    }    
}
