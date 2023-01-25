package ejercicioClienteFacturas;

import static ejercicioClienteFacturas.Cliente.facturas;

public class Factura {
    private int idFactura;
    private static int contFactura;
    private String nombreCliente;
    private String producto;
    private double precioTotal;

    //Constructores
    public Factura(){
        idFactura = ++contFactura;
    }

    public Factura(String nombreCliente, String productos, double precioTotal){
        this();
        this.nombreCliente = nombreCliente;
        this.producto = productos;
        this.precioTotal = precioTotal;
    }


    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public static int getContFactura() {
        return contFactura;
    }

    public static void setContFactura(int contFactura) {
        Factura.contFactura = contFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProductos(String producto) {
        this.producto = producto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String mostrarInformacionFactura(){
        return "ID de la Factura: " + idFactura + "\n" +
                "Nombre cliente: " + nombreCliente + "\n" +
                "Producto: " + producto + "\n" +
                "Precio Total: " + precioTotal+"€" + "\n" ;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", producto='" + producto + '\'' +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
