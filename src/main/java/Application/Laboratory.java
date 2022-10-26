package Application;

public class Laboratory {
    private ClientServiceImpl clientServiceImpl;

    public Laboratory() {
        clientServiceImpl = new ClientServiceImpl();

    }

    public ClientServiceImpl getClientServiceImpl() {
        return clientServiceImpl;
    }

}


