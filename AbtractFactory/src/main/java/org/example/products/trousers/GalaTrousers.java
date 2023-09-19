package org.example.products.trousers;

import org.example.products.Trousers;

public class GalaTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalon de gala -- Son zapatos elegantes? -> Si");
        return true;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalon de gala -- Tipo de cierre -> Cremayera - Cierre");
        return "Cremayera - Cierre";
    }
}
