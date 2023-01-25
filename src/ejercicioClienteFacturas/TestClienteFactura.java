package ejercicioClienteFacturas;

import static ejercicioClienteFacturas.Cliente.facturas;

public class TestClienteFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("Paco","Destornillador",10);
        Factura factura2 = new Factura("Manuel", "Aspiradora",300);
        Factura factura3 = new Factura("Paco", "Vaporizador",120);
        Factura factura4 = new Factura("Manuel", "Cargador",5.90);
        Factura factura5 = new Factura("María", "Cargador",5.90);
        Factura factura6 = new Factura("María", "Blusa",15.90);


        //Agregar las facturas al array
       // Cliente.agregarFacturas(factura1);
        //Cliente.agregarFacturas(factura2);
        Cliente.agregarFacturas(factura3);
        //Cliente.agregarFacturas(factura4);
        //Cliente.agregarFacturas(factura5);
        //Cliente.agregarFacturas(factura6);

        //Eliminar las facturas del array
        Cliente.eliminarFacturas(factura4);

        //Creación objetos cliente
        Cliente cliente1 = new Cliente("Paco",factura1);
        Cliente cliente2 = new Cliente("Manuel");
        Cliente cliente3 = new Cliente("Elías");
        Cliente cliente4 = new Cliente("María",factura5);


        System.out.println("Cantidad total de facturas: " + facturas.size() + "\n");


        //Pregunta Alejandro: ¿Que es mejor: Retornar un String e imprimirlo desde el main o imprimir directamente en el método?
        System.out.println(cliente4.mostrarInformacionCliente());
        cliente4.mostrarFacturasCliente();

        System.out.println(cliente1.mostrarInformacionCliente());
        cliente1.mostrarFacturasCliente();

        System.out.println(cliente3.mostrarInformacionCliente());
        cliente3.mostrarFacturasCliente();






    }
}
