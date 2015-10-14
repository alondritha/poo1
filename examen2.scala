def carrera(){

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

if(prom  <=15)
{
 println("si eres apto")
}

else
{
println("no eres apto")
}
}

def terreno(){
var hectareas=0.0
var pinos=0.0
var oyamel=0.0
var cedros=0.0
var totalpinos=0.0
var totaloyamel=0.0
var totalcedros=0.0
var metros = 0.0

println("en un terreno se desea plantar arboles")

println("cuantas hectareas mide el terreno")
hectareas= readFloat()
metros = hectareas * 10000

if(metros <= 1000000)
 {
   pinos=(metros/100)*50
   oyamel =(metros/100)*30
   cedros=(metros/100)*20
println("se sembraran " + pinos + "n metros cuadrados de pino")
println("se sembraran " + oyamel + "n metros cuadrados de oyamel")
println("se sembraran " + cedros + "n metros cuadrados de cedros")

 totalpinos=(.8)*pinos
  totaloyamel= (1)* oyamel
  totalcedros= (0.555555555)* cedros


println("el total de pinos plantados es: " + totalpinos)
println("el total de oyameles plantados es: " + totaloyamel)
println("el total de cedros plantados es: " + totalcedros)
 
}

if(metros>1000000)
{
 pinos=(metros/100)*70
 oyamel=(metros/100)*20
 cedros=(metros/100)*10

println("se sembraran " + pinos + "n metros cuadrados de pino")
println("se sembraran " + oyamel + "n metros cuadrados de oyamel")
println("se sembraran " + cedros + "n metros cuadrados de cedros")

totalpinos=(.8)*pinos
totaloyamel=(1)*oyamel
totalcedros=(0.555555555)*cedros

println("el total de pinos plantados es; " + totalpinos)
println("el total de oyameles plantados es; " + totaloyamel)
println("el total de cedros plantados es; " + totalcedros)

}
}

println("elije un ejercicio")
println("1) carro q mayor y menor contamina")
println("2) en un terreno se desean sembrrar plantas")
var opcion = readInt()

opcion match {
case 1 => carrera()
case 2 => terreno()
case default=> println("error...")
}