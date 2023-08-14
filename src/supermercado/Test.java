/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author liquiD
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto producto = new Producto(12, "asasd", 123, 12, Categoria.PERFUMERIA);
        
        System.out.println(producto.getRubro());
        
        
    }
    
}
