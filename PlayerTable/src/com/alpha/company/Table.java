package com.alpha.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Table {

    ArrayList<String> nameList = new ArrayList<>();
    SecureRandom random = new SecureRandom();

    public void addPlayers(String firstName, String lastName) {
        nameList.add(firstName +" "+ lastName);
    }

    public String randomName() {
        String player = nameList.get(random.nextInt(nameList.size()));
        nameList.remove(player);
        return player;
    }

    @Override
    public String toString() {
        return randomName() +" vs "+ randomName();
    }
}
