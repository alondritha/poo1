def numeros(){

var cantidadPositivos = 0
var cantidadNegativos = 0
var cantidadNeutros = 0

 println("-------programa para calcular cuantos numeros son neutros, negativos y positivos------")
 for (i <- 1 to 20)
{
 
  println ("Ingresa un numero")
     val numero = readFloat()
 
  if(numero > 0)
   {
     cantidadPositivos= cantidadPositivos + 1
   }
  else if(numero < 0)
   {
    cantidadNegativos = cantidadNegativos  + 1
   }

     else{
         cantidadNeutros = cantidadNeutros + 1
         }
}

println("ingresaste:_" + cantidadPositivos + "numeros positivos")
println("ingresaste:_" + cantidadNegativos + "numeros negativos")
println("ingresaste:_" + cantidadNeutros + "numeros neutros")
}


def calificaciones (){

var menor = 11.0
var calificacion = 0.0

println("Programa para calcular la calificacion menor de un grupo de 40")
for(i <-1 to 40)
{
  
  println("Ingresa tu calificacion")
   calificacion = readFloat ()

  if(calificacion < menor){
     menor = calificacion
  }
}
 println("La calificacion menor es:" + menor)
}


def reloj(){

for(horas <-0 to 23)
 {
   for(minutos <-0 to 59)
   {
      for(segundos <-0 to 59)
        {
          println(horas + ":" + minutos + ":" + segundos)
        }
    }
 }
}


def expendio(){

var kilos = 0.0
var totalCliente=0.0
var totalTienda= 0.0

println("----- programa para calcular el descuento de 15 clientes-----")
println("Cuanto cuesta el kilo de naranjas")
val precioKilo = readFloat()

  for (i<-1 to 15)
   {
 println("cuantos kilos compraste")
       kilos = readFloat()
       totalCliente = precioKilo * kilos
         
          if(kilos > 10)
           {
            totalCliente = totalCliente * .85
            println("total a pagar:" + totalCliente)
            

           }
        else{
              println("total a pagar:" + totalCliente)
             }
totalTienda  = totalTienda + totalCliente
       
   }
println("la tienda va a recibir:" + totalTienda)

}

println("Elije un ejercicio del examen")
println("1) Cuantos numeros son positivos, negativos y neutros")
println("2) Calificacion mas baja de un grupo")
println("3) El comportamiento de un reloj")
println("4) Un expendio de naranjas")
val opcion = readInt ()

opcion match{
  case 1 => numeros ()
  case 2 => calificaciones ()
  case 3 => reloj ()
  case 4 => expendio ()
  case default => println("no valido")
}