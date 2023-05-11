public class EmailHost {
    private Message msg = new Message();
    private Message[] message = new Message[100];
    private int capacity;
    private int nextMessage;
    private String hostname;

    public EmailHost() {
        this.capacity = capacity;
        this.nextMessage = nextMessage;
        this.hostname = hostname;
    }

    public EmailHost(int capacity, int nextMessage, String hostname) {
        this.capacity = capacity;
        this.nextMessage = nextMessage;
        this.hostname = hostname;
    }

    public String gethostName() {
        return hostname;
    }

    public void send(Message msg) {

    }

    public Message[] getMessageForUser(String userEmail) {
        
    }
}
