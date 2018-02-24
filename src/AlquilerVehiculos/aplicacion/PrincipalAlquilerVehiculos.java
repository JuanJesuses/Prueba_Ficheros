package AlquilerVehiculos.aplicacion;

import utilidades.Entrada;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import AlquilerVehiculos.mvc.controlador.ControladorAlquilerVehiculos;
import AlquilerVehiculos.mvc.controlador.IControladorAlquilerVehiculos;
import AlquilerVehiculos.mvc.modelo.AlquilerVehiculos;
import AlquilerVehiculos.mvc.modelo.IModeloAlquilerVehiculos;
import AlquilerVehiculos.mvc.modelo.dao.Alquileres;
import AlquilerVehiculos.mvc.modelo.dao.Clientes;
import AlquilerVehiculos.mvc.modelo.dao.Vehiculos;
import AlquilerVehiculos.mvc.modelo.dominio.Alquiler;
import AlquilerVehiculos.mvc.modelo.dominio.Cliente;
import AlquilerVehiculos.mvc.modelo.dominio.DireccionPostal;
import AlquilerVehiculos.mvc.modelo.dominio.ExcepcionAlquilerVehiculos;
import AlquilerVehiculos.mvc.modelo.dominio.vehiculo.TipoVehiculo;
import AlquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo;
import AlquilerVehiculos.mvc.vista.IUTextual;
import AlquilerVehiculos.mvc.vista.IVistaAlquilerVehiculos;

public class PrincipalAlquilerVehiculos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		IModeloAlquilerVehiculos modelo = new AlquilerVehiculos();
		IVistaAlquilerVehiculos vista = new IUTextual();
		IControladorAlquilerVehiculos controlador = new ControladorAlquilerVehiculos(modelo, vista);
		
		controlador.comenzar();
		
		/**
		 * Escribimos fichero
		 */
		Vehiculo vehiculo /*= new Vehiculos()*/;
		//Vehiculo vehiculo = null;
		//TipoVehiculo tipoVehiculo = null;
		File fichero = new File("/home/john/Escritorio/FichVehiculos.dat");
		FileOutputStream fileout = new FileOutputStream(fichero);
		//FileInputStream filein = new FileInputStream(fichero);
		
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		
		Vehiculo arrayVeh[] = vehiculos.getVehiculos();	
		
		for (int i = 0; i < arrayVeh.length; i++) {
			array = new Vehiculos(arrayVeh);
			
		}
						
		dataOS.close();
		
		/**
		 ObjectInputStream dataIS = new ObjectInputStream(filein);
		
		try {
			while(true) {
				vehiculos = (Vehiculos)dataIS.readObject();
				System.out.println(vehiculos.getVehiculos());
				}
		}catch (EOFException eo) {}*/		
	}
		
}
