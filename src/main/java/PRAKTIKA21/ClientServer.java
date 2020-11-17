package PRAKTIKA21;

import java.net.http.HttpClient;

public class ClientServer implements ItemsStore{

    HttpClient httpClient = HttpClient.newHttpClient();
    public void run()
    {

    }

    @Override
    public void get(int id) {

    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void editItem(int id, Item item) {

    }

    @Override
    public void deleteItem(int id) {

    }
}
