
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
 
    