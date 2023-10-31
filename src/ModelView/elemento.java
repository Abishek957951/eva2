/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

/**
 *
 * @author abish
 */
public abstract class elemento {
    
    protected String bodega;
    
    public elemento(String bodega){
        this.bodega = bodega;
    }
    
    public abstract int peso(int cantidad);
    public abstract int cantidad_unidades_por_paleta(int cantidad);
    public abstract String origen();
  
    
}
