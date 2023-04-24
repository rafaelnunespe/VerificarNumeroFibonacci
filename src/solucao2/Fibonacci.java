
package solucao2;


public class Fibonacci
{
    public int n1 = 0, n2 = 0, resultado = 0;
    
    public void Verificar(int n)
    {        
        while (n > resultado)
        {
            resultado = n1 + n2;
            n1 = n2;
            n2 = resultado;
        }
        
        if (n == 0)
        {
            System.out.println("O numero 0 esta na sequencia de Fibonacci. \nO proximo numnero e: 1");
        }
        else if(n == resultado)
        {
            System.out.println("O numero "+n+" esta na sequencia de Fibonacci. \nO proximo numero e: " +(n1+1));
        }
        else
        {
            System.out.println("O numero "+n+" nao esta na sequencia de Fibonacci.");
        }
    }
}
