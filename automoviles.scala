var minimo =100
var maximo = 0
var suma = 0
var promedio= 0
var ptoContaminantes = 0

println("programa para calcular los puntos contaminantes de 25 automoviles")

for (i <- 1 to 25){
println("Registra los puntos contaminantes")
 ptoContaminantes=readInt()

if(ptoContaminantes < minimo)
 {
   minimo = ptoContaminantes
  }
if(ptoContaminantes > maximo)
  {
    maximo=ptoContaminantes
  }
suma=suma + ptoContaminantes
}

promedio = suma /25
 println("El promedio es:" + promedio)
 println("El que mas contaminate es:" + maximo)
 println("El que menos contamina es:" + minimo)
