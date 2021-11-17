module com.example.lesson4_chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson4_chat to javafx.fxml;
    exports com.example.lesson4_chat;
}