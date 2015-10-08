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


