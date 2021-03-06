package edu.erp.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Cliente extends User {
    private String direccion;
    private String cuil_cuit;
    private Compra compra;
    
    @OneToOne
    private CarritoCompra carrito;
    
    
    public Cliente(){
        super();
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CarritoCompra getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoCompra carrito) {
        this.carrito = carrito;
    }

    public String getCuil_cuit() {
        return cuil_cuit;
    }

    public void setCuil_cuit(String cuil_cuit) {
        this.cuil_cuit = cuil_cuit;
    }

   
}
