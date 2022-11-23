package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementTwo implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Saludando desde el componente implementación 2");
    }
}
