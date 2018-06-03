package server;

import utils.LineByLineInputStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private LineByLineInputStream is;
    private PrintWriter os;
    private int port;

    public HttpServer(int port) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        clientSocket = serverSocket.accept();
        is = new BufferedReader(clientSocket.getInputStream());
        os = new PrintWriter(clientSocket.getOutputStream());
        handleRequest();
    }

    private void handleRequest() {
        while (true) {
            String line =
        }
    }
}
