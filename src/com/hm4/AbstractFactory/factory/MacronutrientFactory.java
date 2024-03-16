package com.hm4.AbstractFactory.factory;

import com.hm4.AbstractFactory.macronutrient.Macronutrient;
import com.hm4.AbstractFactory.model.Customer;

public interface MacronutrientFactory {
    Macronutrient create(Customer customer);
}
