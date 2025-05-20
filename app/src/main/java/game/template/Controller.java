// public class Controller implements Initializable {
//     @FXML
//     ImageView player;

//     private double startDragX;
//     private double startDragY;

//     @Override
//     public void initialize(URL arg0, ResourceBundle arg1) {
//         button.setMousePressed(e -> {
//             startDragX = e.getSceneX();
//             startDragY = e.getSceneY();
//         });

//         button.setMouseDragged(e -> {
//             button.setTranslateX(e.getSceneX() - startDragX);
//             button.setTranslateY(e.getSceneY() - startDragY);
//         });
//     }
// }