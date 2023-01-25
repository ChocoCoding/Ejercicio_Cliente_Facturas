package ejercicioClienteFacturas;

import java.util.ArrayList;

public class Cliente {
    //Atributos de la clase
    private String nombreCliente;
    private Factura factura;
    public static ArrayList <Factura> facturas = new ArrayList  ();

    //Constructores
    public Cliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public Cliente(String nombreCliente, Factura factura) {
        this.nombreCliente = nombreCliente;
        this.factura = factura;
        facturas.add(factura);
    }

    //Cantidad de facturas por cada cliente
    public int cantidadDeFacturasPorCliente(){
        int contadorFacturas = 0;
        for (int i = 0; i < facturas.size(); i++){
            if (facturas.get(i).getNombreCliente().equals(getNombreCliente())){
                contadorFacturas += 1;
            }
        }
        return contadorFacturas;
    }
    public void mostrarFacturasCliente(){
        for (int i = 0; i < facturas.size(); i++){
            if (facturas.get(i).getNombreCliente().equals(getNombreCliente())){
                System.out.println("ID Factura: " + facturas.get(i).getIdFactura() + "\n" +
                        "Nombre cliente: " + facturas.get(i).getNombreCliente() + "\n" +
                        "Producto: " + facturas.get(i).getProducto() + "\n" +
                        "Precio Total: " + facturas.get(i).getPrecioTotal()+"€" + "\n");
            }
        }
    }

    //Método agregar facturas
    public static void agregarFacturas(Factura factura){
        facturas.add(factura);
    }

    //Método eliminar facturas
    public static void eliminarFacturas(Factura factura){
       facturas.remove(factura);
    }

    //Getters / Setters / toString
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String mostrarInformacionCliente(){
        return  "Nombre cliente: " + nombreCliente + "\n" +
                "Cantidad de facturas a su nombre: " + cantidadDeFacturasPorCliente() + "\n";


    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", factura=" + factura +
                '}';
    }
}
