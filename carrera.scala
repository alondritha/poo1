println("un atleta recorre una ruta de 5 km en 10 dias ")
val i=1
var prom = 0

for (i<- 1 to 10)
{
println("DIA" + i)
println("ingresar tiempo hecho en el recorrido")
val time = readInt()
if (time < 16)
{
println("")
}
else
 {
println("se ha pasado del tiempo establecido")
 }

prom = prom + time
}

println(" la suma deel tiempo de los 10 dias es :" + prom)
val promedio= prom/10
println(" el promedio es:" + promedio)

if(prom  >=15)
{
 println("si eres apto")
}

else
{
println("no eres apto")
}