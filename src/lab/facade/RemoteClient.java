package lab.facade;

public class RemoteClient {

    public static void main(String[] args) {
        RemoteFacade server = new RemoteFacade(new ComputerFacade(new Ssd()));

        System.out.println("Client: sending START");
        System.out.println(server.handleRequest("START"));

        System.out.println("Client: sending SHUTDOWN");
        System.out.println(server.handleRequest("SHUTDOWN"));
    }
}
