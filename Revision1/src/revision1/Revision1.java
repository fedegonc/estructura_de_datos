package revision1;

public class Revision1 {

    public static void main(String[] args) {

        /* 
        //1. Imprima a soma de todos os números pares de 1 a 1000;
       
        int suma = 0;
        
        for (int i = 0; i <= 1000; i++) {
            if(i%2 == 0){
                suma = suma + i;
            }
        }
        System.out.println(suma);    
         */
 /*
        //2. Imprima a quantidade de todos os números divisíveis por 3 e 6 e não são por 9.
        
        int x = 0;
        
        for (int i = 0; i <= 1000; i++) {
            if(i%3 == 0 && i%3 == 0 && !(i%9 == 0) ){
                x = i;
            } 
        System.out.println(x); 
        } */
 /*
        //3. Calcule e imprima o fatorial de um número qualquer (até 20);
        int n = 20;
        long fact = 1;
        
        for (int i = 1; i <= n; i++) {
           fact = fact * i;
            
        }
        System.out.println(fact);   
         */
 /*
        //Crie um vetor de inteiros contendo os vinte primeiros números primos;
        
        
        int[] numerosPrimos = new int[20];

        int n = 0;
        int p = 0;
        int aux = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0 && i % 1 == 0) { n++; }
            }
                
            if (n <= 2) { 
                aux = i;
                
                    if (p < 20 && aux != 0) { numerosPrimos[p] = aux; }
                p++;
            }
            n = 0;
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
         */
 /*
 //5. Crie um vetor de inteiros contendo os dez primeiros números da sequência de Fibonacci;
    
    int[] fibo = new int[10];
    int a = 0;
    int b = 1;
    int c = 0;
     for (int i = 0; i < 10; i++) {
         
     
         c = b + a;
         a = b;
         b = c;
         
         fibo[i] = c;
         
     System.out.println(fibo[i]);
     
     }
         */
        // 6. Crie um método que receba um vetor de inteiros e imprima o menor, o maior e a média dos valores;
        int[] vect1 = {1,22, 2, 3,3, 4, 5,7};
        int[] vect2 = {6, 7, 8, 9,3, 10, 20,22};
        
        int[] vect = {-5, 10, 20, 30, 40, 1000};

        //calcular(vect);
        //concatenar(vect1, vect2);
        interseccion(vect1, vect2);
    }

    public static void calcular(int[] v) {
        int menor, mayor;
        float media;
        int acum = 0;
     
        
        mayor = menor = v[0];
        
        for (int i = 0; i < v.length; i++) {
            acum = acum + v[i];
            
            for (int j = 0; j < v.length; j++) {

                if (v[i] > mayor) {
                    mayor = v[j];
                    
                }
                
                if (v[i] < menor) {
                    menor = v[j];
                   
                }
            }
        }

        media = acum / v.length;

        System.out.printf( "%.1f %d %d \n" , media, mayor, menor);
        

    }
    
    // 7. Crie um método que receba dois vetores de números inteiros como parâmetros e retorne um novo vetor que seja a concatenação deles.
           // Exemplo de entrada: [1,2,3,4,5], [6,7,8,9,10]

           // Saída: [1,2,3,4,5,6,7,8,9,10]
    
    
    public static int[] concatenar(int[] v1, int[] v2) {
        int[] concat = new int[v1.length+v2.length];
        int c=0;
        for (int i = 0; i < v1.length+v2.length; i++) {
            
            if(i < v1.length){
                concat[i] = v1[i];
                c++;
                
            }
            
            if(i >= c){
                concat[i] = v2[i-c];  
                
            }
        }
        for (int i = 0; i < concat.length; i++) {
          System.out.println(concat[i]);   
        }
        return concat;

}
    // 7. Crie um método que receba dois vetores de números inteiros como parâmetros e retorne um novo vetor que contenha  apenas os elementos que sejam comuns aos dois vetores (ou seja, a intersecção dos vetores).

         //Exemplo de entrada: [1,2,3,4,5], [1,2,9,5,10]

         //Saída: [1,2,5]
    
     public static int[] interseccion(int[] v1, int[] v2) {
         
         
         int c = 0;
         
         for (int i = 0; i < v1.length; i++) {
             for (int j = 0; j < v2.length; j++) {
                 if(v1[i] == v2[j]){c++;}
            }
         }
         
         int d = 0;
         
         int[] inter = new int[c];
         for (int i = 0; i < v1.length; i++) {
             for (int j = 0; j < v2.length; j++) {
                    
                 if(v1[i] == v2[j]){ inter[d] = v1[i]; d++; }
            }
         }
          
         for (int i = 0; i < inter.length; i++) {
          System.out.println(inter[i]); 
        }
               
     return inter;
     }
    
    
}
