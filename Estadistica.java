import java.util.Scanner;
public class Estadistica
{
    static double resultado;
    public static double Media(int v [])
    {
        for(int i =0;i<v.length;i++)
        {
            resultado=v[i]+resultado;
        }
        resultado=resultado/v.length;
        return resultado;
    }
    
    public static double Mediana(int cantidades[])
    {
        resultado=cantidades.length%2;
        if(resultado==0)
        {
            int posicion=(int)(cantidades.length/2);
            resultado=((cantidades[posicion]+cantidades[posicion+1])/2);
        }
        else
        {
            if(resultado!=0)
            {
                int posicion=(int)(cantidades.length/2);
                posicion++;
                resultado=cantidades[posicion];
            }
        }
        return resultado;
    }
    
      public static int [ ] burbuja ( int [ ] v, int ord ) {
    int i, j, n = v.length, aux = 0;
    
    for ( i = 0; i < n - 1; i++ )
      for ( j = i + 1; j < n; j++ )
        if ( ord == 0 )
          if ( v [ i ] > v [ j ] ) {
            aux = v [ j ];
            v [ j ] = v [ i ];
            v [ i ] = aux;
          }
        else if ( ord == 1 )
          if ( v [ i ] < v [ j ] ) {
            aux = v [ i ];
            v [ i ] = v [ j ];
            v [ j ] = aux;
          }
    return v;
}
    public static int moda ( int [ ] v ) {
    int i, j, moda = 0, n = v.length, frec;
    int frecTemp, frecModa = 0, moda1 = -1; 
  
    v = burbuja ( v, 0 );
    
    for ( i = 0; i < n; i++ ) {
      frecTemp = 1; 
      for ( j = i + 1; j < n; j++ ) {
        if ( v [ i ] == v [ j ] )
          frecTemp++;
      }
      if ( frecTemp > frecModa ) {
        frecModa = frecTemp;
        moda1 = v [ i ];
      }
    }
    return moda1;
    }
      public static double promedio ( int [ ] v ) {
    double prom = 0.0;
    for ( int i = 0; i < v.length; i++ )
      prom += v[i];

    return prom / ( double ) v.length;  
  }

    public static double desviacion ( int [ ] v ) {
    double prom, sum = 0; int i, n = v.length;
    prom = promedio ( v );

    for ( i = 0; i < n; i++ ) 
      sum += Math.pow ( v [ i ] - prom, 2 );

    return Math.sqrt ( sum / ( double ) n );
  }
    public static double varianza (int [] v)
    {
        double varianza=desviacion (v)* desviacion(v);
        return varianza;
    }
    
    public static void main ( String [ ] args ) {
    int n; int [] v={0,6,7,5,5,6,6,6,5,5,5,6,6,6,7,7,7,0,0,9};
    double media, mediana, moda, rango, desviacion;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dimension Arreglo : ");
    n = sc.nextInt ( );
    media = Media ( v ); 
    mediana = Mediana ( v );     
    moda = moda ( v );
    desviacion = desviacion ( v );

    System.out.println ( " Moda del vector: " + moda);
    System.out.println ( " Media del vector: " + media);
    System.out.println ( " Mediana del vector: " + mediana);
    System.out.println ( " Desviacion del vector: " + desviacion);
  }
}
