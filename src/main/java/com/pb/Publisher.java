package com.pb;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscribers = new ArrayList<>();

    public void add(Subscriber sub){
        this.subscribers.add(sub);
    }

    public void send(String message){
        for (Subscriber subscriber : subscribers) {
            subscriber.receive(message);
        }
    }
}
