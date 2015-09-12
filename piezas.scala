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