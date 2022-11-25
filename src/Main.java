import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int ex=0,x=0,y=0,z=0,j=0,op;
        String ausu="Janet",aid="26",apass="12", usu="",id="",pass="";

        String[][] Doctor = new String[20][3];
        String[][] Paciente = new String[20][2];
        String[][] Cita = new String[20][6];

        Scanner l=new Scanner(System.in);

        while (usu.equals(ausu)==false && id.equals(aid)==false && pass.equals(apass)==false){
            System.out.println("Autentificación Favor de ingresar:");
            System.out.println("Usuario");
            usu = l.nextLine();
            System.out.println("Identificador Único");
            id = l.nextLine();
            System.out.println("Contraseña");
            pass = l.nextLine();
        }

        while (ex==0) {
            System.out.println("Qué desea realizar?");
            System.out.println("1 Dar de alta paciente");
            System.out.println("2 Dar de alta Doctor");
            System.out.println("3 Agendar cita");
            System.out.println("4 Salir");
            op = Integer.parseInt(l.nextLine());
            switch (op) {
                case 1:
                    for (j=0;j<2;j++){
                        switch (j) {
                            case 0:
                                System.out.println("ID paciente");
                                Paciente[x][j]=l.nextLine();
                                break;
                            case 1:
                                System.out.println("Nombre del paciente");
                                Paciente[x][j]=l.nextLine();
                                break;
                        }
                    }
                    x++;
                    break;
                case 2:
                    for (j=0;j<3;j++){
                        switch (j) {
                            case 0:
                                System.out.println("ID Doctor");
                                Doctor[y][j]=l.nextLine();
                                break;
                            case 1:
                                System.out.println("Nombre del Doctor");
                                Doctor[y][j]=l.nextLine();
                                break;
                            case 2:
                                System.out.println("Especialidad del Doctor");
                                Doctor[y][j]=l.nextLine();
                                break;
                        }
                    }
                    y++;

                    break;
                case 3:
                    for (j=0;j<6;j++){
                        switch (j) {
                            case 0:
                                System.out.println("ID Cita");
                                Cita[z][j]=l.nextLine();
                                break;
                            case 1:
                                System.out.println("Paciente");
                                Cita[z][j]=l.nextLine();
                                break;
                            case 2:
                                System.out.println("Fecha formato dd/mm/aaaa");
                                Cita[z][j]=l.nextLine();
                                break;
                            case 3:
                                System.out.println("Hora formato 24hrs");
                                Cita[z][j]=l.nextLine();
                                break;
                            case 4:
                                System.out.println("Motivo cita");
                                Cita[z][j]=l.nextLine();
                                break;
                            case 5:

                                System.out.println("El doctor asignado es: "+Doctor[z][1]);
                                break;
                        }
                    }
                    z++;
                    break;
                case 4:
                    ex = 1;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }
}