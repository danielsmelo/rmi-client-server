import java.rmi.*;
import java.rmi.server.*;

public class ServidorMat extends UnicastRemoteObject implements InterfaceServidorMat
{
    public ServidorMat() throws RemoteException
    {
        System.out.println("Novo Servidor instanciado...");
    }

    public double distancia(double x1, double y1, double x2, double y2) throws RemoteException
    {
        System.out.println("Valores recebidos do cliente: \n ponto1 = " + x1 + ", " + y1 + "\n ponto2 = " + x2 + ", " + y2 );
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}