/**
 * 
 */
package com.centrocultural.test;
import java.util.Vector;

import com.centrocultural.modelo.Cliente;
import com.centrocultural.modelo.Material;
import com.centrocultural.util.CapturaDatosGrafica;
import com.centrocultural.util.CapturaVariosDatos;
/**
 * @author cjovalle
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// aqui definiremos las variables necesarias para capturar datos y
		// presentar los menus
		// arma menu grafico
		String opcionesMenu = "CENTRO CULTURAL LENNON\n\n"
				+ "1 Gestionar Clientes \n" + "2 Gestionar Préstamos\n"
				+ "3 Reportes\n" + "4 Terminar\n";

		String opcionesCliente = "CENTRO CULTURAL LENNON\n\n"
				+ "Gestionar Clientes\n" + "1 Nuevo Cliente\n"
				+ "2 Modificar Información Cliente\n" + "3 Borrar Cliente\n"+ "4 Listar Clientes\n"
				+ "5 Regresar\n";

		String opcionesPrestamos = "CENTRO CULTURAL LENNON\n\n"
				+ "Gestionar Préstamos\n" + "1 Nuevo Prestamo\n"
				+ "2 Modificar Información Prestamo\n" + "3 Borrar Prestamo\n"
				+ "4 Devolver Material\n" + "5 Regresar\n";

		String opcionesReportes = "CENTRO CULTURAL LENNON\n\n" + "Reportes\n"
				+ "1 Reporte de préstamos x cliente\n"
				+ "2 Reporte de material x tipo\n" + "3 Regresar\n";

		int opcionMenuPrincipal = 0;
		int opcionMenuClientes = 0;
		int opcionMenuPrestamos = 0;
		int opcionMenuReportes = 0;
		boolean estado = false;
		
		//Para usar la clase captura de datos multiple
		//1 defino arreglo de cadenas para establecer los titulos de los campos a capturar
		String titulosCliente[] = {"Codigo","Nombres/Apellidos"};
		
		//2 defino arreglo de cadenas para capturar la información digitada
		String datos[];
		
		//3 Defino variable de tipo CapturaVariosDatos
		CapturaVariosDatos ventanaDatos;
		
		//Agrupa los clientes
		Vector <Cliente> catalogoClientes = new Vector();
		//Agrupa los materiales
		Vector <Material> catalogoMateriales = new Vector();
		//defino una variable tipo cliente para usarla posteriormente
		Cliente objetoCliente;
		
		//defino una variable tipo Material para usarla posteriormente
		Material objetoMaterial;
		
		String salidaImpresa = "";
		
		// menu principal
		do {
			opcionMenuPrincipal = CapturaDatosGrafica.presentaMenu(opcionesMenu, "CENTRO CULTURAL LENNON", 1, 4);
			switch (opcionMenuPrincipal) {
			// 1 Gestionar Clientes
			case 1:
				// submenu clientes
				do {
					opcionMenuClientes = CapturaDatosGrafica.presentaMenu(opcionesCliente, "CENTRO CULTURAL LENNON", 1, 5);
					switch (opcionMenuClientes) {
					// 1 Nuevo Cliente
					case 1:
						//Capturo los datos del cliente, pero antes configuro el titulo el mensaje y el icono de la ventana
						ventanaDatos = new CapturaVariosDatos(null,2);
						//establezco las etiquetas
						ventanaDatos.setLabels(titulosCliente);
						ventanaDatos.setIcon(2);
						ventanaDatos.setTitle("Clientes");
						ventanaDatos.setMessage("Datos Nuevo Cliente");
						//llamo al metodo que presenta el cuadro de dailogo y recupera los datos
						datos = ventanaDatos.getInputs();
						//valido si no se cancelo la operación
						if (ventanaDatos.isCanceled()) {
							CapturaDatosGrafica.imprimeMensaje("El usuario cancelo la operación... ","CENTRO CULTURAL LENNON - submenu clientes");
						//en este caso si ingreso información
						}else{
							objetoCliente = new Cliente();
							try {
								objetoCliente.setCliId(Integer.parseInt(datos[0]));
								estado = true;
				            }catch (NumberFormatException e) {
				            	estado = false;
				            }
							if (estado == true){
								objetoCliente.setCliNombresApellidos(datos[1]);
								//lo ingreso al catalogo de clientes guarda el objeto en la colección
								catalogoClientes.addElement(objetoCliente);
							}else{
								CapturaDatosGrafica.imprimeMensaje("Error al crear el cliente... ","CENTRO CULTURAL LENNON - submenu clientes");
							}
						}
						break;
					// 2 Modificar Información Cliente
					case 2:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Modificar Información Cliente... ","CENTRO CULTURAL LENNON - submenu clientes");
						break;
					// 3 Borrar Cliente
					case 3:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Borrar Cliente... ","CENTRO CULTURAL LENNON - submenu clientes");
						break;
					// Listar clientes
					case 4:
						salidaImpresa = "";
						if (catalogoClientes.size() > 0 ){
							for (int i=0; i<catalogoClientes.size();i++ ){
								salidaImpresa += catalogoClientes.elementAt(i).toString() + "\n";
							}
							CapturaDatosGrafica.imprimeMensaje(salidaImpresa,"CENTRO CULTURAL LENNON - submenu clientes");
						}else{
							CapturaDatosGrafica.imprimeMensaje("No hay datos... ","CENTRO CULTURAL LENNON - submenu clientes");
						}
						break;
					// Regresar
					case 5:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Regresar... ","CENTRO CULTURAL LENNON - submenu clientes");
						break;
					}
				} while (opcionMenuClientes != 5);
				break;

			// 2 Gestionar Préstamos
			case 2:
				//submenu Prestamos
				do {
					opcionMenuPrestamos = CapturaDatosGrafica.presentaMenu(opcionesPrestamos, "CENTRO CULTURAL LENNON", 1, 5);
					switch (opcionMenuPrestamos) {
					//1 Nuevo Prestamo
					case 1:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Nuevo Prestamo... ","CENTRO CULTURAL LENNON - submenu Prestamos");
						break;

					//2 Modificar Información Prestamo
					case 2:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Modificar Información Prestamo... ","CENTRO CULTURAL LENNON - submenu Prestamos");
						break;
					//3 Borrar Prestamo
					case 3:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Borrar Prestamo... ","CENTRO CULTURAL LENNON - submenu Prestamos");
						break;
					//4 Devolver Material
					case 4:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Devolver Material... ","CENTRO CULTURAL LENNON - submenu Prestamos");
						break;	
					// Regresar
					case 5:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Regresar... ","CENTRO CULTURAL LENNON - submenu Prestamos");
						break;
					}
				} while (opcionMenuPrestamos != 5);
				break;
			// 3 Reportes
			case 3:
				//submenu Reportes
				do {
					opcionMenuReportes = CapturaDatosGrafica.presentaMenu(opcionesReportes, "CENTRO CULTURAL LENNON", 1, 3);
					switch (opcionMenuReportes) {
					//1 Reporte de préstamos x cliente
					case 1:
						CapturaDatosGrafica.imprimeMensaje("Reporte de préstamos x cliente... ","CENTRO CULTURAL LENNON - submenu Reportes");
						break;

					//2 Reporte de material x tipo
					case 2:
						CapturaDatosGrafica.imprimeMensaje("Reporte de material x tipo... ","CENTRO CULTURAL LENNON - submenu Reportes");
						break;
					// Regresar
					case 3:
						CapturaDatosGrafica.imprimeMensaje("Proximamente Regresar... ","CENTRO CULTURAL LENNON - submenu Reportes");
						break;
					}
				} while (opcionMenuReportes != 3);
				break;
			// terminar
			case 4:
				CapturaDatosGrafica.imprimeMensaje("Aplicacion terminada... ","CENTRO CULTURAL LENNON");
				break;
			}
		} while (opcionMenuPrincipal != 4);
		System.exit(0);
	}

}
