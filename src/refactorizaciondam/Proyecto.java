package refactorizaciondam;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombreProyecto;
    private List<Empleado> empleados;

    public Proyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        }
    }

    public void mostrarEquipo() {
        System.out.println("Proyecto: " + nombreProyecto);
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            empleado.mostrarResumen();
        }
    }

    public double calcularCosteMensual() {
        double total = 0;
        for (int i = 0; i < empleados.size(); i++) {
            total += empleados.get(i).calcularSalario();
        }
        return total;
    }

    public boolean hayEmpleados() {
        if (empleados.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public Empleado buscarEmpleadoPorId(int id) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getIdEmpleado() == id) {
                return empleados.get(i);
            }
        }
        return null;
    }

    public boolean existeEmpleadoConSalarioSuperiorA(double salario) {
        boolean encontrado = false;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).calcularSalario() > salario) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            return true;
        } else {
            return false;
        }
    }

    public int contarEmpleadosConSalarioSuperiorA(double salario) {
        int contador = 0;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).calcularSalario() > salario) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularMediaSalarial() {
        if (empleados.size() == 0) {
            return 0;
        }

        double suma = 0;
        for (int i = 0; i < empleados.size(); i++) {
            suma += empleados.get(i).calcularSalario();
        }

        return suma / empleados.size();
    }

    public void mostrarEmpleadosConSalarioSuperiorA(double salario) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if (empleado.calcularSalario() > salario) {
                if (empleado != null) {
                    empleado.mostrarResumen();
                }
            }
        }
    }
}