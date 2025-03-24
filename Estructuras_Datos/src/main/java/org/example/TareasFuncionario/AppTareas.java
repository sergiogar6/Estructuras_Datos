package org.example.TareasFuncionario;

import java.util.HashSet;
import java.util.Stack;

public class AppTareas {

    static Stack<Informe> tareas = new Stack<>();
    static HashSet<Informe> tareasUnicas = new HashSet<>();

    public static void main(String[] args) {
        tareas.push(new Informe(1, "Informe", Tipo.PERSONAL));
        tareas.push(new Informe(1, "Informe", Tipo.PERSONAL));
        tareas.push(new Informe(2, "Informe", Tipo.ADMINISTRATIVO));
        tareas.push(new Informe(2, "Informe", Tipo.EMPRESARIAL));
        tareas.push(new Informe(1, "Informe", Tipo.EMPRESARIAL));

        tareasUnicas.addAll(tareas);
        realizarTareas();

        tareas.push(new Informe(2, "Informe", Tipo.ADMINISTRATIVO));
        tareas.push(new Informe(2, "Informe", Tipo.EMPRESARIAL));
        tareas.push(new Informe(1, "Informe", Tipo.EMPRESARIAL));

        tareasUnicas.addAll(tareas);


        System.out.println("Numero de tareas unicas: " + tareasUnicas.size());

    }

    public static void realizarTareas() {

        System.out.println("======= REALIZANDO TAREAS =======");
        while (!tareas.isEmpty()) {
            
            tareasUnicas.remove(tareas.peek());
            System.out.println("Realizando tarea... " + tareas.pop());

        }

        System.out.println();

    }
}
