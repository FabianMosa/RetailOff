package com.integration.integration_maven_proyect;
import java.util.Scanner;
public class App 
{
	public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("Gestor de Tareas");
            System.out.println("1. Añadir nueva tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Listar todas las tareas");
            System.out.println("4. Listar tareas pendientes");
            System.out.println("5. Listar tareas completadas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese el título de la tarea: ");
                    String title = scanner.nextLine();
                    taskManager.addTask(title);
                    System.out.println("Tarea añadida.");
                    break;
                case 2:
                    System.out.println("Seleccione el índice de la tarea a completar:");
                    int index = scanner.nextInt();
                    taskManager.completeTask(index);
                    System.out.println("Tarea completada.");
                    break;
                case 3:
                    System.out.println("Todas las tareas:");
                    for (Task task : taskManager.getAllTasks()) {
                        System.out.println(task);
                    }
                    break;
                case 4:
                    System.out.println("Tareas pendientes:");
                    for (Task task : taskManager.getPendingTasks()) {
                        System.out.println(task);
                    }
                    break;
                case 5:
                    System.out.println("Tareas completadas:");
                    for (Task task : taskManager.getCompletedTasks()) {
                        System.out.println(task);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
