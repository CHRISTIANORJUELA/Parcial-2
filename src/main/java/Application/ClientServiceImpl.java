package Application;

import com.example.proyecto.models.Client;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService{

    ArrayList<Client> clients = new ArrayList<>();

    public void addClient(String tfName, String tfAge){
        try {
            clients.add(new Client(tfName,Integer.parseInt(tfAge)));
        }catch (NumberFormatException e){
            System.out.println("Age dont valid");
        }

    }

    public  void seeClient(TextField tfSee){
        String words = "";
        for (int i= 0;i<clients.size();i++){
            words += clients.get(i).getName()+clients.get(i).getAge()+"\n";
        }
        tfSee.setText(words);
    }

    public void searchName(String name){
        boolean a = clients.stream().anyMatch(x -> x.getName().equalsIgnoreCase(name.toLowerCase()) && x.getAge()>18);
        if (a){
            System.out.println("Client Exists");
        }else {
            System.out.println("Client dont exists");
        }
    }
}
