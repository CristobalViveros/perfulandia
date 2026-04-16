package com.example.perfulandia;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid

public class Producto {
    private int id;
    private String nombre;
    private int stock_actual; 
    private int precio;


}
