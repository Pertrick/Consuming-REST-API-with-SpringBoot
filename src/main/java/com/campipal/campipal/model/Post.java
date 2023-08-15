package com.campipal.campipal.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Post {

    private final StringProperty title = new SimpleStringProperty();
    // private String title;
    private final IntegerProperty userId  =new SimpleIntegerProperty();
   // private Integer userId;
    private final IntegerProperty id  =new SimpleIntegerProperty();
    //private Integer id;

    private final StringProperty body = new SimpleStringProperty();
    //private String body;


    public long getUserId() {
        return userId.get();
    }

    public void setUserId(Integer userId) {
        this.userId.set(userId);
    }

    public long getId() {
        return id.get();
    }

    public void setId(Integer id) {
        this.id.set(id);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getBody() {
        return body.get();
    }

    public void setBody(String body) {
        this.body.set(body);
    }

    public StringProperty titleProperty() {
        return title;
    }

    public StringProperty bodyProperty(){
        return body;
    }

    public IntegerProperty userIdProperty() {
        return userId;
    }

    public IntegerProperty idProperty(){
        return id;
    }
}
