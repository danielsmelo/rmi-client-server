import java.rmi.*;
import java.util.Scanner;

public class Cliente
{
	public Cliente()
	{
		System.out.println("Executando Cliente... \n");
		try
		{
			msi = (InterfaceServidorMat) Naming.lookup("rmi://rmi-server:1099/servidormat1");
		}
		catch (Exception e)
		{
			System.out.println("Falhou a execucao do Cliente.\n"+e);
			System.out.println("Certifique se a aplicacao no servidor esta em execucao.\n");
			System.exit(0);
		}
	}

	public static void main (String[] argv)
	{
		Cliente c = new Cliente();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Entre com valores de x1 e y1 separados por espaco:");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.println("Entre com valores de x2 e y2 separados por espaco:");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		System.out.println("");

		try
		{
			System.out.println("Distancia entre os dois pontos: " + c.distancia(x1,y1,x2,y2));
		}
		catch (Exception e)
		{
			System.out.println("Excecao durante chamadas remotas:" +e);
		}
	}

	private InterfaceServidorMat msi;

	public double distancia(double x1, double y1, double x2, double y2) throws RemoteException{
		 return msi.distancia(x1,y1,x2,y2);
	}
}