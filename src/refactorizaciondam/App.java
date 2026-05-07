package refactorizaciondam;

public class App {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("Lucía", "11111111A", 1, 1800, "Java", 10);
        AdministradorSistemas a1 = new AdministradorSistemas("Pedro", "22222222B", 2, 1900, 8, true);

        Proyecto proyecto = new Proyecto("Plataforma Educativa");
        proyecto.agregarEmpleado(d1);
        proyecto.agregarEmpleado(a1);

        d1.programar();
        a1.administrarRed();

        proyecto.mostrarEquipo();
        System.out.println("Coste mensual del proyecto: " + proyecto.calcularCosteMensual());
    }
}