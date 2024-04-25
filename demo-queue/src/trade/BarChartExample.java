import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the data series
        ObservableList<XYChart.Data<String, Integer>> data = FXCollections.observableArrayList(
                new XYChart.Data<>("1.25", 100),
                new XYChart.Data<>("1.25", 8),
                new XYChart.Data<>("1.65", 90),
                new XYChart.Data<>("1.95", 8),
                new XYChart.Data<>("1.65", 10)
        );

        // Create the chart axes
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the bar chart
        BarChart<String, Integer> chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Data Distribution");
        chart.getData().add(new XYChart.Series<>("Data", data));

        // Create a VBox to hold the chart
        VBox vbox = new VBox(chart);
        vbox.setPadding(new Insets(10));

        // Create the scene and set it on the stage
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bar Chart Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}