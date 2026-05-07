package refactorizaciondam;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private int horasExtra;

    public Desarrollador(String nombre, String dni, int idEmpleado, double salarioBase, String lenguajePrincipal, int horasExtra) {
        super(nombre, dni, idEmpleado, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtra = horasExtra;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtra * 20);
    }

    public void programar() {
        System.out.println(nombre + " está programando en " + lenguajePrincipal);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Desarrollador: " + nombre + " | Lenguaje: " + lenguajePrincipal +
                " | Salario: " + calcularSalario());
    }
}