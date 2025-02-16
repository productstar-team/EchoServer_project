import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // Локальный адрес сервера
        int port = 12345; // Порт, на который подключается клиент

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Подключение к серверу " + serverAddress + " на порту " + port);

            // Потоки для чтения и записи
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Отправка сообщения серверу
            String messageToSend = "Привет, сервер!";
            output.println(messageToSend);
            System.out.println("Отправлено серверу: " + messageToSend);

            // Получение ответа от сервера
            String serverResponse = input.readLine();
            System.out.println("Ответ от сервера: " + serverResponse);
        } catch (IOException e) {
            System.err.println("Ошибка на клиенте: " + e.getMessage());
        }
    }
}