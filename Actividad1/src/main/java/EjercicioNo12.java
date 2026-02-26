public class EjercicioNo12 {
    public static void main(String[] args) {
        Salaryman salaryman = new Salaryman(48);
        
        System.out.println("Salario bruto: $" + salaryman.getGrossSalary());
        System.out.println("Retencion en la fuente: $" + salaryman.getRetentionTax());
        System.out.println("Salario neto: $" + salaryman.getNetSalary());
    }
}


class Salaryman {
    private int hours;
    private float salary = 5000f;
    private float retention_tax = 0.125f;

    public Salaryman(int hours) {
        this.hours = hours;
    }

    public float getGrossSalary() {
        return salary;
    }

    public float getRetentionTax() {
        return salary * retention_tax;
    }

    public float getNetSalary() {
        return salary - (salary * retention_tax);
    }
}