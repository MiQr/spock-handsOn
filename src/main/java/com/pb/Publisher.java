package com.pb;

import java.util.ArrayList;
import java.util.List;

class Publisher {
    List<Subscriber> subscribers = new ArrayList<>();

    void add(Subscriber sub){
        this.subscribers.add(sub);
    }

    void send(String message){
        for (Subscriber subscriber : subscribers) {
            subscriber.receive(message);
        }
    }
}
