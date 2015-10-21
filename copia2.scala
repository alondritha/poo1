class Producto( n:String, p:Float, c:String){
  val nombre = n
  val precio = p
  val codigo = c
}

class Catalogo{
    val productos = new Array [Producto](50)
    var cantidadProductos = 0
 
def agregar (producto:producto){
    productos (cantidadProductos)= prducto
    cantidadProductos += 1
 }
}


main()

def main() {
    catalogo(new Catalogo )
}

def catalogo( 
    catalogo : Catalogo
) {
  var opcion = 3
  do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
      case 1 =>agregarProductos( catalogo)
      case 2 =>nota(catalogo)
      case default => println("Adios")
    }
  } while (opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Agregar productos")
  println("2) Nota")
  println("3) Salir")
}

def agregarProductos(
   catalogo : Catalogo
)  {
  var continuar = 'N'
  do {
    capturarDatosProductos(catalogo)
    mostrarCatalogoProductos(catalogo)
    print("¿Quieres agregar otro producto (S/N)? ")
    continuar = readChar()
  } while (continuar == 'S')
}

def capturarDatosProductos(
 catalogo  : Catalogo
) {
  println("Ingresa los datos del producto")
  print("Nombre: ")
   var nombre = readLine()
  print("Precio: ")
   var precio = readFloat()
  print("Codigo de barras: ")
   var codigo = readLine()
catalogo.agregar= (new Producto(nombre, precio, codigo))
}

def mostrarCatalogoProductos(
  catalogo : Catalogo
) {
  println("Nombre | Precio | Código")
  for (j <- 0 to catalogo.cantidadProductos - 1) {
    println(
      (j + 1) + "|"
      + catalogo.productos (j).nombre + "|"
      + catalogo.productos (j).precio + "|"
      + catalogo.productos (j). codigo 
  }
}
def nota(
 catalogo : Catalogo
  )
{
  var totalNota=0.0
  var otro='n'
  mostrarCatalogoProductos(catalogo)
  do{
    println("ingresa el numero del producto: ")
    var producto=readInt()
    println("Cantidad de productos:")
    var cantidad=readInt()
    totalNota += catalogo.productos(productos - 1 ) . precio * cantidad
    println("Agregar otro producto: (s/n) ")
    otro=readChar()
    }while(otro!='n')
    println("Total a pagar: " + totalNota)
  } 
