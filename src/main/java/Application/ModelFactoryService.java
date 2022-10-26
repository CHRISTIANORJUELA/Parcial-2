package Application;

import javafx.scene.control.TextField;

public interface ModelFactoryService {
    void addClient(String tfName, String tfAge);
    void seeClient(TextField tfSee);

    void searchName(String name);
}
