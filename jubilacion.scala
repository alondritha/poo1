
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