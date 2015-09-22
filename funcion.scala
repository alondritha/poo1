def calificacion(){

println("Primera calificacion")
 val calificaion1 = readFloat()

println("Segunda calificacion")
 val calificaion2 = readFloat()

println("Tercera calificacion")
 val calificacion3 = readFloat()

println("Examen final")
 val calificaciontotal = readFloat()

println("Trabajo final")
 val trabajototal = readFloat()

val promedio = (calificaion1 + calificaion2 + calificacion3)/3

val calterminada = promedio *.55
               + trabajototal * .15
               + calificaciontotal * .3
println("calificacion=" + calterminada)

}

def hospitalpresupuesto(){

println("ingresar la cantidad del presupuesto disponible a repartir")

  val presupuesto = readFloat()
  val ginecologia = presupuesto * .4
  val traumatologia = presupuesto * .3
  val pediatria = presupuesto * .3

println("el presupuesto para ginecologia es:" + ginecologia)
println ("el presupuesto para traumatologia es:" + traumatologia)
println("el presupuesto para pediatria es:" + pediatria)

}

def inversion (){

println("cantidad 1")
 val cantidad1 = readFloat()

println("cantidad 2")
 val cantidad2 = readFloat()

println("cantidad 3")
 val cantidad3 = readFloat()

val total= cantidad1 + cantidad2 + cantidad3
 
println("porcentaje 1")
 val porcentaje1 = (cantidad1 * 100)/total
  println ("  " + porcentaje1)

println("porcentaje 2")
 val porcentaje2 = (cantidad2 * 100)/total
 println (" " +porcentaje2)

println("porcentaje 3")
 val porcentaje3 = (cantidad3 * 100)/total
   println (" " +porcentaje2)
}

println("Seleccione un ejercicio")
println("1) calificaciones")
println("2) presupuesto de un hospital")
println("3) inversiones")
val opcion = readInt()

opcion match {
 case 1 => calificacion()
 case 2 => hospitalpresupuesto()
 case 3 => inversion()
 case default => println ("opcion invalida")
}
