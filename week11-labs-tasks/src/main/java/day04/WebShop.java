package day04;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<WebShopItem> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addItem(WebShopItem item) {
        items.add(item);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void buyItem(String userName, String itemName) {
        User user = searchUser(userName);
        WebShopItem item = searchItem(itemName);

        if (user.getMoney() >= item.getPrice()) {
            user.buyItem(item.copy());
        }
    }

    private WebShopItem searchItem(String itemName) {
        for (WebShopItem actual : items) {
            if (itemName.equals(actual.getName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Can not find the item!");
    }

    private User searchUser(String userName) {
        for (User actual : users) {
            if (userName.equals(actual.getUserName())) ;
            return actual;
        }
        throw new IllegalArgumentException("Can not find the user!");
    }

}
