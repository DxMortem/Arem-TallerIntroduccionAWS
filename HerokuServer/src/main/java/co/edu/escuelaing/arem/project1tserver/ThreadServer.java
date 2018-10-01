package co.edu.escuelaing.arem.project1tserver;

import java.net.Socket;

public class ThreadServer implements Runnable{

    private Socket clientSocket;

    public ThreadServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run(){
        //Input Read
        InputReader ir = new InputReader(clientSocket);
        //Output
        ResourceWriter rw = new ResourceWriter(ir.getResource(),clientSocket);
        ir.closeIn();
    }
}