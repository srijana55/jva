import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String printMessage() throws RemoteException;//interface


    public int printSum() throws RemoteException;
}
