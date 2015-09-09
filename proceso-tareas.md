#Como hacer un pull request

__*Pasos para crear un pulll request*__

1.-Clonar el repositorio de alguien mas

     '''git clone git@github.com:alondrita/poo1.gif'''

2.-Crear un branch para la tarea 4..

      '''git checkout -b tarea 4'''

3.-Agregar un staging

    ''' git add fb.cpp'''

4.-Crear y editar archivos en C con el código de fizzbuzz

int main

 {
    
    int i;
    
 for  (i= 1 < 20; i++)      
    {
       
             if ( ! (i%3))
        printf("Fizz");
        if ( !(i%5)) 
        printf("Buzz");
        if ( i % 3) * ( i % 5)  
        printf("%d", i); 
        printf ("/n");          
    
}
    
    }
5.-Hacer un push

          ''' git push origin master'''