public class main {
    public static void main(String[] args) {
        double[] people = new double[30];
        double a = 32.00;
        double b = 8.00;
        int all = 0;
        int count = 0;
        double str = 0.00;
        for (int i = 0;i < people.length; i++) {
            all++;
            people[i] = (a +(b*Math.random()));
            str = str + people[i];
            if (people[i] < 36.9 && people[i] > 36.2) {
                System.out.println("Температура пациента " + all + " в норме: " + String.format("%.1f",people[i]).replace(",","."));
                count++;
            } else if (people[i] > 36.9 || people[i] < 36.2) {
                System.out.println("Пациент " + all + " не здоров. Его температура: " + String.format("%.1f",people[i]).replace(",","."));
            }
        }
        if (count == 1 || count == 21) {
            System.out.println("\nВсего " + count + " здоровый пациент \nСредняя темперанура по больнице состовляет " + String.format("%.1f", str / 30).replace(",", ".") + " градусов");
        } else if (count > 1 && count < 5) {
            System.out.println("\nВсего " + count + " здоровых пациента \nСредняя темперанура по больнице состовляет " + String.format("%.1f", str / 30).replace(",", ".") + " градусов");
        } else {
            System.out.println("\nВсего " + count + " здоровых пациентов \nСредняя темперанура по больнице состовляет " + String.format("%.1f", str / 30).replace(",", ".") + " градусов");

        }
    }
}
