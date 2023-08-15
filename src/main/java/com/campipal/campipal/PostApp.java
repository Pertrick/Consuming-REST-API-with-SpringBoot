package com.campipal.campipal;

import com.campipal.campipal.model.Post;
import com.campipal.campipal.service.PostService;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PostApp extends Application {
    private PostService postService;

    public PostApp(){
        this.postService = new PostService();
    }

    private final TableView<Post> tableView = new TableView<>();
    private final ObservableList<Post> posts = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Post App");

        TableColumn<Post, Integer> idColumn = new TableColumn<>("id");
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());

        TableColumn<Post, Integer> userIdColumn = new TableColumn<>("UserId");
        userIdColumn.setCellValueFactory(cellData -> cellData.getValue().userIdProperty().asObject());

        TableColumn<Post, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());

        TableColumn<Post, String> bodyColumn = new TableColumn<>("Body");
        bodyColumn.setCellValueFactory(cellData -> cellData.getValue().bodyProperty());

        tableView.getColumns().addAll(userIdColumn, idColumn, titleColumn,bodyColumn);

        tableView.setItems(posts);

        Button fetchButton = new Button("Fetch Data");
        fetchButton.setOnAction(event -> fetchData());

        VBox vbox = new VBox(tableView, fetchButton);

        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fetchData() {
        posts.clear();
        //System.out.println(postService.getPosts());
        posts.addAll(postService.getPosts());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Data Fetched");
        alert.setHeaderText("Done!");
        alert.setContentText("Data fetching is done.");
        alert.showAndWait();
    }

    public void launchJavaFXApp(String[] args) {
        launch(args);
    }

}
