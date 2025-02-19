# Задача 1. Реализация эхо-сервера с использованием TCP

В данной задаче вам предстоит реализовать клиент-серверное приложение с использованием протокола TCP. Приложение должно состоять из двух компонентов:
Эхо-сервер: принимает сообщения от клиента, затем отправляет их обратно без изменений.
Эхо-клиент: подключается к серверу, отправляет сообщение и выводит полученный ответ.
Эта задача поможет вам научиться работать с сокетами в Java и реализовывать сетевое взаимодействие.


Шаги выполнения

1. Настройка серверного компонента (EchoServer):
Создайте класс EchoServer.
Настройте сервер для прослушивания входящих подключений на определенном порту, используя класс ServerSocket.
Организуйте цикл обработки подключений:
Принимается сообщение от клиента через поток ввода (InputStream).
Сервер отправляет это же сообщение обратно клиенту через поток вывода (OutputStream).
Добавьте обработку исключений для случаев ошибок подключения.


2. Настройка клиентского компонента (EchoClient):
Создайте класс EchoClient.
Настройте подключение к серверу с использованием класса Socket (укажите IP-адрес сервера и порт).
Реализуйте отправку сообщения серверу через поток вывода (OutputStream) и получение ответа через поток ввода (InputStream).
Добавьте вывод полученного ответа в консоль.
