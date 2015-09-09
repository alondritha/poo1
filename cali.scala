
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