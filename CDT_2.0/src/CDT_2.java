/**
 * Jordan Shakespeare
 * 1-22-2021
 * Client Data Tracker 2 builds upon my first Client Data tracker.
 * is a JavaFX application that displays 3 tables for tracking a clients Sleep and behaviors.
 * Each cell in the tables is editable. As of now 1-22-2021 the data that is entered into the cells is only saved when
 * the application is running, the data is not saved into any .txt or .dat files.
 */


import com.sun.prism.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.FileInputStream;

public class CDT_2 extends Application {
    TableView<Sleep_Chart> table;
    TableView<GoodBehaviors> table2;
    TableView<TargetBehaviors> table3;

    PasswordField passwordField = new PasswordField();

    ScrollPane s1 = new ScrollPane();

    @Override
    public void start(Stage primaryStage)throws Exception{
        ImageView image = new ImageView("download.jpg");

        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Client Data Tracker");
        primaryStage.setHeight(800);
        primaryStage.setWidth(1500);

        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(200);

        Label label = new Label("Sleep Chart");
        label.setFont((new Font("Arial",20)));

        //Columns for Sleep Chart
        TableColumn<Sleep_Chart, String> day = new TableColumn<>("Day");
        day.setCellValueFactory(new PropertyValueFactory<>("DOW"));
        day.setMinWidth(100);
        day.setCellFactory(TextFieldTableCell.forTableColumn());
        day.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setDOW(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h1 = new TableColumn<>("12am-1am");
        h1.setCellValueFactory(new PropertyValueFactory<>("h1"));
        h1.setCellFactory(TextFieldTableCell.forTableColumn());
        h1.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH1(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h2 = new TableColumn<>("1am-2am");
        h2.setCellValueFactory(new PropertyValueFactory<>("h2"));
        h2.setCellFactory(TextFieldTableCell.forTableColumn());
        h2.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH2(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h3 = new TableColumn<>("2am-3am");
        h3.setCellValueFactory(new PropertyValueFactory<>("h3"));
        h3.setCellFactory(TextFieldTableCell.forTableColumn());
        h3.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH3(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h4 = new TableColumn<>("3am-4am");
        h4.setCellValueFactory(new PropertyValueFactory<>("h4"));
        h4.setCellFactory(TextFieldTableCell.forTableColumn());
        h4.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH4(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h5 = new TableColumn<>("5am-6am");
        h5.setCellValueFactory(new PropertyValueFactory<>("h5"));
        h5.setCellFactory(TextFieldTableCell.forTableColumn());
        h5.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH5(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h6 = new TableColumn<>("6am-7am");
        h6.setCellValueFactory(new PropertyValueFactory<>("h6"));
        h6.setCellFactory(TextFieldTableCell.forTableColumn());
        h6.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH6(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h7 = new TableColumn<>("7am-8am");
        h7.setCellValueFactory(new PropertyValueFactory<>("h7"));
        h7.setCellFactory(TextFieldTableCell.forTableColumn());
        h7.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH7(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h8 = new TableColumn<>("8am-9am");
        h8.setCellValueFactory(new PropertyValueFactory<>("h8"));
        h8.setCellFactory(TextFieldTableCell.forTableColumn());
        h8.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH8(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String>h9 = new TableColumn<>("9am-10am");
        h9.setCellValueFactory(new PropertyValueFactory<>("h9"));
        h9.setCellFactory(TextFieldTableCell.forTableColumn());
        h9.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH9(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h10 = new TableColumn<>("10am-11am");
        h10.setCellValueFactory(new PropertyValueFactory<>("h10"));
        h10.setCellFactory(TextFieldTableCell.forTableColumn());
        h10.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH10(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h11 = new TableColumn<>("11am-12pm");
        h11.setCellValueFactory(new PropertyValueFactory<>("h11"));
        h11.setCellFactory(TextFieldTableCell.forTableColumn());
        h11.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH11(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h12 = new TableColumn<>("12pm-1pm");
        h12.setCellValueFactory(new PropertyValueFactory<>("h12"));
        h12.setCellFactory(TextFieldTableCell.forTableColumn());
        h12.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH12(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h13 = new TableColumn<>("1pm-2pm");
        h13.setCellValueFactory(new PropertyValueFactory<>("h13"));
        h13.setCellFactory(TextFieldTableCell.forTableColumn());
        h13.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH13(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h14 = new TableColumn<>("2pm-3pm");
        h14.setCellValueFactory(new PropertyValueFactory<>("h14"));
        h14.setCellFactory(TextFieldTableCell.forTableColumn());
        h14.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH14(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h15 = new TableColumn<>("3pm-4pm");
        h15.setCellValueFactory(new PropertyValueFactory<>("h15"));
        h15.setCellFactory(TextFieldTableCell.forTableColumn());
        h15.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH15(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h16 = new TableColumn<>("4pm-5pm");
        h16.setCellValueFactory(new PropertyValueFactory<>("h16"));
        h16.setCellFactory(TextFieldTableCell.forTableColumn());
        h16.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH16(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h17 = new TableColumn<>("5pm-6pm");
        h17.setCellValueFactory(new PropertyValueFactory<>("h17"));
        h17.setCellFactory(TextFieldTableCell.forTableColumn());
        h17.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH17(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h18 = new TableColumn<>("6pm-7pm");
        h18.setCellValueFactory(new PropertyValueFactory<>("h18"));
        h18.setCellFactory(TextFieldTableCell.forTableColumn());
        h18.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH18(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h19 = new TableColumn<>("7pm-8pm");
        h19.setCellValueFactory(new PropertyValueFactory<>("h19"));
        h19.setCellFactory(TextFieldTableCell.forTableColumn());
        h19.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH19(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h20 = new TableColumn<>("8pm-9pm");
        h20.setCellValueFactory(new PropertyValueFactory<>("h20"));
        h20.setCellFactory(TextFieldTableCell.forTableColumn());
        h20.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH20(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h21 = new TableColumn<>("9pm-10pm");
        h21.setCellValueFactory(new PropertyValueFactory<>("h21"));
        h21.setCellFactory(TextFieldTableCell.forTableColumn());
        h21.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH21(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h22 = new TableColumn<>("10pm-11pm");
        h22.setCellValueFactory(new PropertyValueFactory<>("h22"));
        h22.setCellFactory(TextFieldTableCell.forTableColumn());
        h22.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH22(sleep_chartStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<Sleep_Chart, String> h23 = new TableColumn<>("11pm-12am");
        h23.setCellValueFactory(new PropertyValueFactory<>("h23"));
        h23.setCellFactory(TextFieldTableCell.forTableColumn());
        h23.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Sleep_Chart, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Sleep_Chart, String> sleep_chartStringCellEditEvent) {
                Sleep_Chart sleep_chart = sleep_chartStringCellEditEvent.getRowValue();
                sleep_chart.setH23(sleep_chartStringCellEditEvent.getNewValue());
            }
        });


        //Add Columns to table
        table = new TableView<>();
        table.setEditable(true);
        table.setItems(getSleep());
        table.getColumns().addAll(day,h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,
                h13,h14,h15,h16,h17,h18,h19,h20,h21,h22,h23);



        s1.setContent(table);
        s1.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        s1.setHmax(1500);
        s1.setPrefSize(1250,400);


        Label label2 = new Label("Good Behaviors");
        label2.setFont(new Font("Arial",20));

        //Good Behaviors table column
        TableColumn<GoodBehaviors, String> DOWcolumn = new TableColumn<>("DAY");
        DOWcolumn.setMinWidth(200);
        DOWcolumn.setCellValueFactory(new PropertyValueFactory<>("DOW"));
        DOWcolumn.setCellFactory(TextFieldTableCell.forTableColumn());
        DOWcolumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GoodBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<GoodBehaviors, String> goodBehaviorsStringCellEditEvent) {
                GoodBehaviors goodBehaviors = goodBehaviorsStringCellEditEvent.getRowValue();
                goodBehaviors.setDOW(goodBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<GoodBehaviors, String> Chore = new TableColumn<>("Completing Chore");
        Chore.setMinWidth(200);
        Chore.setCellValueFactory(new PropertyValueFactory<>("Chore"));
        Chore.setCellFactory(TextFieldTableCell.forTableColumn());
        Chore.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GoodBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<GoodBehaviors, String> goodBehaviorsStringCellEditEvent) {
                GoodBehaviors goodBehaviors = goodBehaviorsStringCellEditEvent.getRowValue();
                goodBehaviors.setChore(goodBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<GoodBehaviors, String> Task = new TableColumn<>("Completing Tasks Independently");
        Task.setMinWidth(200);
        Task.setCellValueFactory(new PropertyValueFactory<>("Tasks"));
        Task.setCellFactory(TextFieldTableCell.forTableColumn());
        Task.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GoodBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<GoodBehaviors, String> goodBehaviorsStringCellEditEvent) {
                GoodBehaviors goodBehaviors = goodBehaviorsStringCellEditEvent.getRowValue();
                goodBehaviors.setTasks(goodBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<GoodBehaviors, String> Activity = new TableColumn<>("Went on an Activity");
        Activity.setMinWidth(200);
        Activity.setCellValueFactory(new PropertyValueFactory<>("Activity"));
        Activity.setCellFactory(TextFieldTableCell.forTableColumn());
        Activity.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GoodBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<GoodBehaviors, String> goodBehaviorsStringCellEditEvent) {
                GoodBehaviors goodBehaviors = goodBehaviorsStringCellEditEvent.getRowValue();
                goodBehaviors.setActivity(goodBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<GoodBehaviors, String> Spontaneous = new TableColumn<>("Spontaneous Behaviors");
        Spontaneous.setMinWidth(200);
        Spontaneous.setCellValueFactory(new PropertyValueFactory<>("behavior"));
        Spontaneous.setCellFactory(TextFieldTableCell.forTableColumn());
        Spontaneous.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GoodBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<GoodBehaviors, String> goodBehaviorsStringCellEditEvent) {
                GoodBehaviors goodBehaviors = goodBehaviorsStringCellEditEvent.getRowValue();
                goodBehaviors.setBehavior(goodBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        table2 = new TableView<>();
        table2.setItems(getBehaviors());
        table2.setEditable(true);
        table2.getColumns().addAll(DOWcolumn,Chore,Task,Activity,Spontaneous);

        Label label3 = new Label("Target Behaviors");
        label3.setFont(new Font("Arial",20));

        //Table for Target Behaviors
        TableColumn<TargetBehaviors, String> dow = new TableColumn<>("Day");
        dow.setMinWidth(100);
        dow.setCellValueFactory(new PropertyValueFactory<>("DOW"));
        dow.setCellFactory(TextFieldTableCell.forTableColumn());
        dow.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TargetBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<TargetBehaviors, String> targetBehaviorsStringCellEditEvent) {
                TargetBehaviors targetBehaviors = targetBehaviorsStringCellEditEvent.getRowValue();
                targetBehaviors.setDOW(targetBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<TargetBehaviors, String> physical = new TableColumn<>("Physical Aggression");
        physical.setMinWidth(200);
        physical.setCellValueFactory(new PropertyValueFactory<>("Physical"));
        physical.setCellFactory(TextFieldTableCell.forTableColumn());
        physical.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TargetBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<TargetBehaviors, String> targetBehaviorsStringCellEditEvent) {
                TargetBehaviors targetBehaviors = targetBehaviorsStringCellEditEvent.getRowValue();
                targetBehaviors.setPhysical(targetBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<TargetBehaviors, String> angry = new TableColumn<>("Angry Outbursts");
        angry.setMinWidth(200);
        angry.setCellValueFactory(new PropertyValueFactory<>("Angry"));
        angry.setCellFactory(TextFieldTableCell.forTableColumn());
        angry.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TargetBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<TargetBehaviors, String> targetBehaviorsStringCellEditEvent) {
                TargetBehaviors targetBehaviors = targetBehaviorsStringCellEditEvent.getRowValue();
                targetBehaviors.setAngry(targetBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<TargetBehaviors, String> leaving = new TableColumn<>("Leaving Supervision");
        leaving.setMinWidth(200);
        leaving.setCellValueFactory(new PropertyValueFactory<>("leaving"));
        leaving.setCellFactory(TextFieldTableCell.forTableColumn());
        leaving.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TargetBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<TargetBehaviors, String> targetBehaviorsStringCellEditEvent) {
                TargetBehaviors targetBehaviors = targetBehaviorsStringCellEditEvent.getRowValue();
                targetBehaviors.setLeaving(targetBehaviorsStringCellEditEvent.getNewValue());
            }
        });

        TableColumn<TargetBehaviors, String> soar = new TableColumn<>("SOAR");
        soar.setMinWidth(200);
        soar.setCellValueFactory(new PropertyValueFactory<>("Soar"));
        soar.setCellFactory(TextFieldTableCell.forTableColumn());
        soar.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TargetBehaviors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<TargetBehaviors, String> targetBehaviorsStringCellEditEvent) {
                TargetBehaviors targetBehaviors = targetBehaviorsStringCellEditEvent.getRowValue();
                targetBehaviors.setSoar(targetBehaviorsStringCellEditEvent.getNewValue());
            }
        });
        table3 = new TableView<>();
        table3.setItems(getTarget());
        table3.setEditable(true);
        table3.getColumns().addAll(dow,physical,angry,leaving,soar);

        s1.setMinWidth(1400);
        VBox vbox = new VBox();
        vbox.setSpacing(25);
        vbox.setMinSize(1000,1500);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, s1, label2, table2, label3, table3);

        vbox.setAlignment(Pos.CENTER);
        ScrollPane sp2 = new ScrollPane();
        sp2.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        sp2.setFitToHeight(true);
        sp2.setPrefViewportHeight(700);
        sp2.setContent(vbox);

        Label p_label = new Label("Enter your password");
        p_label.setLabelFor(passwordField);
        p_label.setFont(new Font("Arial",12));

        VBox box1 = new VBox();
        box1.setAlignment(Pos.CENTER);
        box1.getChildren().addAll(p_label,passwordField);

        HBox box2 = new HBox();
        image.setFitHeight(500);
        image.setFitWidth(650);
        box2.setAlignment(Pos.BOTTOM_CENTER);
        box2.getChildren().add(image);

        BorderPane pane = new BorderPane();
        pane.setCenter(box1);
        pane.setTop(box2);

        Scene mainScene = new Scene(pane);
        ((Group) scene.getRoot()).getChildren().addAll(vbox,sp2);
        primaryStage.setScene(mainScene);
        primaryStage.show();

        passwordField.setOnAction(event -> {

                if (!passwordField.getText().equals("123")) {
                    passwordField.clear();
                } else {
                    primaryStage.setScene(scene);

                }
        });

    }
    public ObservableList<GoodBehaviors> getBehaviors(){
        ObservableList<GoodBehaviors> behaviors = FXCollections.observableArrayList();
        behaviors.add(new GoodBehaviors("Sunday","Yes","Yes","No","No"));
        behaviors.add(new GoodBehaviors("Monday","","","",""));
        behaviors.add(new GoodBehaviors("Tuesday","","","",""));
        behaviors.add(new GoodBehaviors("Wednesday","","","",""));
        behaviors.add(new GoodBehaviors("Thursday","","","",""));
        behaviors.add(new GoodBehaviors("Friday","","","",""));
        behaviors.add(new GoodBehaviors("Saturday","","","",""));

        return behaviors;
    }
    public ObservableList<Sleep_Chart> getSleep(){
        ObservableList<Sleep_Chart> sleep_chart = FXCollections.observableArrayList();
        sleep_chart.add(new Sleep_Chart("Sunday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Monday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Tuesday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Wednesday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Thursday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Friday","","","","","","","","","","","",
                "","","","","","","","","","","",""));
        sleep_chart.add(new Sleep_Chart("Saturday","","","","","","","","","","","",
                "","","","","","","","","","","",""));

        return sleep_chart;
    }
    public ObservableList<TargetBehaviors> getTarget(){
        ObservableList<TargetBehaviors> targetBehaviors = FXCollections.observableArrayList();
        targetBehaviors.add(new TargetBehaviors("Sunday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Monday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Tuesday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Wednesday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Thursday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Friday", "","","",""));
        targetBehaviors.add(new TargetBehaviors("Saturday", "","","",""));

        return targetBehaviors;
    }

    public static void main(String[] args) {
	Application.launch(args);
    }
}
