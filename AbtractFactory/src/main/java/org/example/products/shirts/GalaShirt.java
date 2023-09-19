package org.example.products.shirts;

import org.example.products.Shirt;

public class GalaShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- Tiene mangas largas? -> Si");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- Tiene mangas largas? -> Si");
        return false;
    }
}
