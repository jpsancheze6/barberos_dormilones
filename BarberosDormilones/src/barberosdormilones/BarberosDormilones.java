package barberosdormilones;

public class BarberosDormilones {

    public static void main(String[] args) {
        // TODO code application logic here
        interfaz inicio = new interfaz();
        inicio.setVisible (true);  
        
        
        inicio.dormir(1);
        inicio.dormir(2);
        inicio.dormir(3);
        inicio.quitarCliente(1);
        inicio.quitarCliente(2);
        inicio.quitarCliente(3);
     
    }   
}