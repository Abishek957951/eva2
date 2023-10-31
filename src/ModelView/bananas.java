/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

/**
 *
 * @author abish
 */
public class bananas extends elemento {
    
    private final int peso = 80;
    private final int c_u_p_p = 10;

    public bananas(String bodega) {
        super(bodega);
    }
    
    @Override
    public int peso(int cantidad) {
        return peso*cantidad;
    }

    @Override
    public int cantidad_unidades_por_paleta(int cantidad) {
        return c_u_p_p*cantidad;
    }

    @Override
    public String origen() {
        return "Colombia";
    }
    
}
