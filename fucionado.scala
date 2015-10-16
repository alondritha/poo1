def jubilacion(){

println ("ingresar edad")
 val edad = readFloat()

println("antiguedad de empleo")
 val ant= readFloat()

if (edad >= 60 && ant <25)
  {  
    println("tiene jubilacion por: edad")
  }

if (edad >= 60 && ant >25)
  {
       println("tiene jubilacion por: edad adulta")
  }

if (edad < 60 && ant >25)
  {
       println("tiene jubilacion por: antiguedad joven")
  }


  else
   {
       println("gracias por trabajar en el IMSS") }
}

def compra(){
println("Cuantas piezas va a comprar?")
val piezas=readInt()

println("Cual es el costo?")
val costo=readFloat()

val total=costo*piezas
println("tu total a pagar es: " + total)

if(total>500000)
{
   val invertir=(total*.55)
   println("la empresa invierte el 55%: " + invertir)
   val prestado=(total*.30)
   println("El banco prestara el 30%: " + prestado)
   val credito=(total*.15)
   val intcredito=(total*.30)*.20
   val totalcredito=(credito+intcredito)
   println("La empresa pedira a credito el 15%: " + totalcredito)
   val cfinal=invertir + prestado + totalcredito
   println("La cuenta final es: " + cfinal)
}

if(total<=500000){
   val invertir=(total*.70)
   println("La empresa va a invertir el 70%: " + invertir)
   val credito=(total*.30)
   val intcredito=(total*.30)*.20
  val totalcredito=credito+intcredito
  println("La empresa pedira un credito del 30%: " + totalcredito)
   val cfinal=invertir + totalcredito
   println("La cuenta final es: " + cfinal)
}
}

def tienda(){

 println("escriba total de compra")
  val tc = readFloat()

println("escriba el color de la bolita para saber el descuento proporcionado")
  val cb = readLine()
 
if (cb == "blanca")
{ println("total a pagar")
   println (tc * 0)  }

if (cb == "verde")
{ println("total a pagar")
   println (tc * .1)  }

if (cb == "amarillo")
{ println("total a pagar")
  println (tc * .25)  }

if (cb == "azul")
{ println("total a pagar")
  println (tc * .50)  }

if (cb == "roja")
{ println("total a pagar")
  println (tc - tc)  }
}

def salario(){

println(" ingresar las horas trabajadas")
 val ht = readInt()
val he = ht*160

println("el salario semanal es:")
if ( ht <= 40)
  {
    println (ht * 160)
    println (" " + he)
  }

 else 
   {
      val he=(40 * 160) + ((ht-40)* 200) 
      println (" " + he)
   }
 }

println("Elije un ejercicio")
println("1) Jubilacion de un IMSS")
println("2) Una empresa compra varias piezas")
println("3) Una tienda de descuento")
println("4) Salario semanal de un obrero")
var opcion= readInt()

opcion match{
case 1=> jubilacion()
case 2=>compra()
case 3=> tienda()
case 4=> salario()
case default => println("error....ADIOS...")
}