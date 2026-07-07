package junio;
import java.util.Scanner;
public class GestorMercado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Electronica electronica1 = new Electronica(null, null, 0, null, null, null, null, 0);
		Ropa ropa1 = new Ropa(null, null, 0, null, null, null, null, null, null);
		Alimento alimento1 = new Alimento(null, null, 0, null, null, null, null);
		
		Electronica electronicaArreglo[] = new Electronica[10];
		Ropa ropaArreglo[ ]= new Ropa[10];
		Alimento alimentoArreglo[] = new Alimento[10];
		
		
		int opcion = 0;
		do {System.out.println(" ");
			System.out.println("----------------");
			System.out.println("--PROGRAMITA--");
			System.out.println("1. Alta de productos");
			System.out.println("2. Listado de productos");
			System.out.println("3. Modificar producto guardado");
			System.out.println("4. Eliminar producto");
			System.out.println("5. Salir...");
			System.out.println("----------------");
			System.out.println(" ");
			opcion = sc.nextInt();


			switch (opcion) {

			case 1:
				int categoria = 0;
				System.out.println("Ingrese el producto que desee dar de alta: ");
				System.out.println("1. Electronica");
				System.out.println("2. Ropa");
				System.out.println("3. Alimento");
				categoria= sc.nextInt();
				
				if(categoria==1) {
				System.out.println("--ELECTRONICA--");
				System.out.println("Ingrese el producto: ");
				String nombreElectronica = sc.next();
				System.out.println("Ingrese el código: ");
				String codigoElectronica = sc.next();
				System.out.println("Ingrese el stock: ");
				int stockElectronica = sc.nextInt();
				System.out.println("Ingrese el precio: ");
				Double precioElectronica = sc.nextDouble();
				System.out.println("Ingrese garantia: ");
				String garantia = sc.next();
				System.out.println("Ingrese marca: ");
				String marcaElectronica = sc.next();
				System.out.println("Ingrese modelo: ");
				String modeloElectronica = sc.next();
				System.out.println("Ingrese año del modelo: ");
				int anio = sc.nextInt();
				ELECTRONICA(electronicaArreglo, electronica1, nombreElectronica, codigoElectronica, stockElectronica, precioElectronica, garantia, marcaElectronica, modeloElectronica, anio);
				}
				
				
				if(categoria==2) {
				System.out.println("--ROPA--");
				System.out.println("Ingrese el producto: ");
				String nombreRopa = sc.next();
				System.out.println("Ingrese el código: ");
				String codigoRopa = sc.next();
				System.out.println("Ingrese el stock: ");
				int stockRopa = sc.nextInt();
				System.out.println("Ingrese el precio: ");
				Double precioRopa = sc.nextDouble();
				System.out.println("Ingrese marca: ");
				String marcaRopa = sc.next();
				System.out.println("Ingrese talle: ");
				String talle = sc.next();
				System.out.println("Ingrese modelo: ");
				String modeloRopa = sc.next();
				System.out.println("Ingrese color: ");
				String color = sc.next();
				System.out.println("Ingrese material: ");
				String material = sc.next();
				ROPA(ropaArreglo, ropa1, nombreRopa, codigoRopa, stockRopa, precioRopa, marcaRopa, talle, modeloRopa, color, material);
				}
				
				if(categoria==3) {
				System.out.println("--ALIMENTO--");
				System.out.println("Ingrese el producto: ");
				String nombreAlimento = sc.next();
				System.out.println("Ingrese código: ");
				String codigoAlimento = sc.next();
				System.out.println("Ingrese stock: ");
				int stockAlimento = sc.nextInt();
				System.out.println("Ingrese precio: ");
				Double precioAlimento = sc.nextDouble();
				System.out.println("Ingrese fecha de vencimiento: ");
				String fechaVencimiento = sc.next();
				System.out.println("Ingrese calorias: ");
				String calorias = sc.next();
				System.out.println("Ingrese peso: ");
				Double peso = sc.nextDouble();
				ALIMENTO(alimentoArreglo, alimento1, nombreAlimento, codigoAlimento, stockAlimento, precioAlimento, fechaVencimiento, calorias, peso);
				}
				break;

			case 2:
				MuestreoELECTRONICA(electronicaArreglo);
				MuestreoROPA(ropaArreglo);
				MuestreoALIMENTO(alimentoArreglo);
				break;

			case 3:
				int categoriaDarBaja = 0;
				System.out.println("Ingrese categoria de la cual desee eliminar un producto");
				System.out.println("1. Electronica");
				System.out.println("2. Ropa");
				System.out.println("3. Alimento");
				categoriaDarBaja = sc.nextInt();
				
				if(categoriaDarBaja==1) {
				System.out.println("Ingrese código del producto de electrónica a eliminar: ");
				String codigoE = sc.next();
				BajaELECTRONICA(codigoE, electronicaArreglo);
				}
				
				if(categoriaDarBaja==1) {
				System.out.println("Ingrese código del producto de ropa eliminar: ");
				String codigoR = sc.next();
				BajaROPA(codigoR, ropaArreglo);
				}
				
				if(categoriaDarBaja==1) {
				System.out.println("Ingrese código del producto alimenticio a eliminar: ");
				String codigoA = sc.next();
				BajaALIMENTO(codigoA, alimentoArreglo);
				}
				break;
				
			case 4:
				
				int categoriaMod = 0;
				System.out.println("Ingrese categoria de la cual desee modificar un producto");
				System.out.println("1. Electronica");
				System.out.println("2. Ropa");
				System.out.println("3. Alimento");
				categoriaMod = sc.nextInt();
				
				if(categoriaMod==3) {
				System.out.println("Ingrese código del producto de electrónica del cual desee modificar un dato: ");
				String codigoModE = sc.next();
				int datoParaModificarE = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Precio");
				System.out.println("2. Stock");
				datoParaModificarE = sc.nextInt();
				Double nuevoPrecioE = 0.0;
				int nuevoStockE = 0;
				if (datoParaModificarE == 1) {
					System.out.println("Ingrese el nuevo precio: ");
					nuevoPrecioE = sc.nextDouble();
				} else {
					System.out.println("Ingrese el nuevo stock: ");
					nuevoStockE = sc.nextInt();
				}
				ModificarELECTRONICA(electronicaArreglo, codigoModE, datoParaModificarE, nuevoPrecioE, nuevoStockE);
				}
				
				if(categoriaMod==3) {
				System.out.println("Ingrese código del producto de ropa del cual desee modificar un dato: ");
				String codigoModR = sc.next();
				int datoParaModificarR = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Precio");
				System.out.println("2. Stock");
				datoParaModificarR = sc.nextInt();
				Double nuevoPrecioR = 0.0;
				int nuevoStockR = 0;
				if (datoParaModificarR == 1) {
					System.out.println("Ingrese el nuevo precio: ");
					nuevoPrecioR = sc.nextDouble();
				} else {
					System.out.println("Ingrese el nuevo stock: ");
					nuevoStockR = sc.nextInt();
				}
				ModificarROPA(ropaArreglo, codigoModR, datoParaModificarR, nuevoPrecioR, nuevoStockR);
				}
				
				if(categoriaMod==3) {
				System.out.println("Ingrese código del alimento del cual desee modificar un dato: ");
				String codigoModA = sc.next();
				int datoParaModificarA = 0;
				System.out.println("Elija el dato que desea modificar: ");
				System.out.println("1. Precio");
				System.out.println("2. Stock");
				datoParaModificarA = sc.nextInt();
				Double nuevoPrecioA = 0.0;
				int nuevoStockA = 0;
				if (datoParaModificarA == 1) {
					System.out.println("Ingrese el nuevo precio: ");
					nuevoPrecioA = sc.nextDouble();
				} else {
					System.out.println("Ingrese el nuevo stock: ");
					nuevoStockA = sc.nextInt();
				}
				ModificarALIMENTO(alimentoArreglo, codigoModA, datoParaModificarA, nuevoPrecioA, nuevoStockA);
				}
				break;
				
				
			case 5:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 5);

	}

	public static void ELECTRONICA(Electronica[] EA, Electronica e, String nombre, String codigo, int stock, Double precio,
			String garantia, String marca, String modelo, int anio) {
		for (int i = 0; i < EA.length; i++) {

			if (EA[i] == null) {

				EA[i] = new Electronica(nombre, codigo, stock, precio, garantia, marca, modelo, anio);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void ROPA(Ropa[] RA, Ropa r, String nombre, String codigo, int stock, Double precio,
			String marcaRopa, String talle, String modeloRopa, String color, String material) {
		for (int i = 0; i < RA.length; i++) {

			if (RA[i] == null) {

				RA[i] = new Ropa(nombre, codigo, stock, precio, marcaRopa, talle, modeloRopa, color, material);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void ALIMENTO(Alimento[] AA, Alimento a, String nombre, String codigo, int stock, Double precio, String fechaVencimiento, String calorias, Double peso) {

		for (int i = 0; i < AA.length; i++) {

			if (AA[i] == null) {

				AA[i] = new Alimento(nombre, codigo, stock, precio, fechaVencimiento, calorias, peso);
				System.out.println("Datos recibidos");
				System.out.println(" ");
				break;
			}
		}

	}

	public static void MuestreoELECTRONICA(Electronica[] e) {

		for (int i = 0; i < e.length; i++) {

			if (e[i] == null) {

			} else {
				System.out.println("--ELECTRONICA--");
				System.out.println("Posición nro: " + i);
				System.out.println("Producto: " + e[i].getNombreProducto());
				System.out.println("Código: " + e[i].getCodigo());
				System.out.println("Stock: " + e[i].getStock());
				System.out.println("Precio: " + e[i].getPrecio());
				System.out.println("Marca: " + e[i].getMarcaElectronico());
				System.out.println("Modelo: " + e[i].getModeloElectronico());
				System.out.println("Año: " + e[i].getAnio());
				System.out.println(" ");
			}
		}
	}

	public static void MuestreoROPA(Ropa[] r) {

		for (int i = 0; i < r.length; i++) {

			if (r[i] == null) {

			} else {
				System.out.println("--ROPA--");
				System.out.println("Posición nro: " + i);
				System.out.println("Producto: " + r[i].getNombreProducto());
				System.out.println("Código: " + r[i].getCodigo());
				System.out.println("Stock: " + r[i].getStock());
				System.out.println("Precio: " + r[i].getPrecio());
				System.out.println("Marca: " + r[i].getMarcaRopa());
				System.out.println("Talle: " + r[i].getTalle());
				System.out.println("Modelo: " + r[i].getModeloRopa());
				System.out.println("Color: " + r[i].getColor());
				System.out.println("Material: " + r[i].getMaterial());
				System.out.println(" ");
			}
		}
	}

	public static void MuestreoALIMENTO(Alimento[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

			} else {
				System.out.println("--ROPA--");
				System.out.println("Posición nro: " + i);
				System.out.println("Producto: " + a[i].getNombreProducto());
				System.out.println("Código: " + a[i].getCodigo());
				System.out.println("Stock: " + a[i].getStock());
				System.out.println("Precio: " + a[i].getPrecio());
				System.out.println("Fecha de vencimiento: " + a[i].getFechaVencimiento());
				System.out.println("Calorias: " + a[i].getCalorias());
				System.out.println("Peso: " + a[i].getPeso());
				System.out.println(" ");
		}
	}
}

	public static void BajaELECTRONICA(String codigo, Electronica[] e) {

		for (int i = 0; i < e.length; i++) {
			if (e[i].getCodigo().equals(codigo)) {
				e[i] = null;
				System.out.println("Producto eliminado exitosamente");
				System.out.println(" ");
				break;
}}}
	public static void BajaROPA(String codigo, Ropa[] r) {

		for (int i = 0; i < r.length; i++) {
			if (r[i].getCodigo().equals(codigo)) {
				r[i] = null;
				System.out.println("Producto eliminado exitosamente");
				System.out.println(" ");
				break;
}}}
	public static void BajaALIMENTO(String codigo, Alimento[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].getCodigo().equals(codigo)) {
				a[i] = null;
				System.out.println("Producto eliminado exitosamente");
				System.out.println(" ");
				break;
}}}
	
	public static void ModificarELECTRONICA(Electronica[] e, String codigo, int datoParaModificar, Double nuevoPrecio,
			int nuevoStock) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null && e[i].getCodigo() == codigo) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					e[i].setPrecio(nuevoPrecio);

				} else {
					e[i].setStock(nuevoStock);

				}

			}

		}

	}
	public static void ModificarROPA(Ropa[] r, String codigo, int datoParaModificar, Double nuevoPrecio,
			int nuevoStock) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getCodigo() == codigo) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					r[i].setPrecio(nuevoPrecio);

				} else {
					r[i].setStock(nuevoStock);

				}

			}

		}

	}
	public static void ModificarALIMENTO(Alimento[] a, String codigo, int datoParaModificar, Double nuevoPrecio,
			int nuevoStock) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getCodigo() == codigo) {
				System.out.println("Dato modificado exitosamente :D");
				if (datoParaModificar == 1) {
					a[i].setPrecio(nuevoPrecio);

				} else {
					a[i].setStock(nuevoStock);

				}

			}

		}

	}
}

