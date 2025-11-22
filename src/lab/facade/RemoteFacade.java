package lab.facade;

public class RemoteFacade {

    private final ComputerFacade facade;

    public RemoteFacade(ComputerFacade facade) {
        this.facade = facade;
    }

    public String handleRequest(String command) {
        switch (command) {
            case "START":
                facade.start();
                return "Server: computer started";

            case "SHUTDOWN":
                facade.shutdown();
                return "Server: computer shut down";

            default:
                return "Server: unknown command";
        }
    }
}
