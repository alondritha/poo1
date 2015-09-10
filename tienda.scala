 
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