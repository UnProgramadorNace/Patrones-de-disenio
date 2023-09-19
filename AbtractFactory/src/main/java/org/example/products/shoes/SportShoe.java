package org.example.products.shoes;

import org.example.products.Shoe;

public class SportShoe implements Shoe {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos elegantes? -> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos elegantes? -> No");
        return true;
    }
}
