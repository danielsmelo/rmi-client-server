import java.rmi.*;
import java.net.*;
import java.rmi.registry.Registry;

public class ArrancaServidor
{
    public static void main(String argv[])
    {
        try
        {
			System.out.println("Subindo servidor...");

			InetAddress IP = InetAddress.getLocalHost();

            System.out.println(IP.getHostAddress());

            System.setProperty("java.rmi.server.hostname", IP.getHostAddress());

			Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);

            InterfaceServidorMat stub = new ServidorMat();

            Naming.rebind("rmi://rmi-server:1099/servidormat1", stub);
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um problema no arranque do servidor.\n"+e.toString());
        }
    }
}