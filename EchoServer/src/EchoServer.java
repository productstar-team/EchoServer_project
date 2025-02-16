import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        int port = 12345; // Порт, на котором работает сервер

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен. Ожидание подключения клиентов...");

            while (true) { // Бесконечный цикл для ожидания подключения
                Socket clientSocket = serverSocket.accept(); // Принять подключение клиента
                System.out.println("Клиент подключен: " + clientSocket.getInetAddress());

                // Потоки для чтения и записи данных
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

                // Чтение сообщения от клиента
                String clientMessage = input.readLine();
                System.out.println("Сообщение от клиента: " + clientMessage);

                // Отправка сообщения обратно клиенту
                output.println("Эхо: " + clientMessage);

                // Закрытие подключения
                clientSocket.close();
                System.out.println("Клиент отключился.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка на сервере: " + e.getMessage());
        }
    }
}
