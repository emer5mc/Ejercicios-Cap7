import java.util.Scanner;

public class e1{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int memoria[]=new int[100];
        int c=0;
        int n=0;
        int sum=0;
        int codigoDeOperacion=0, operando=0, y=0;
        int acumulador=0;
        String a, w, n1,n2;
        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");



        for( int contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){
            memoria[contadorDeIntrucciones]=0;
        }

        while (n!=-999){

            if(y<10){
                w="0"+Integer.toString(y);
            }else{
                w=Integer.toString(y);
            }
            
                System.out.print(w+"?");
                n=input.nextInt();
                a=Integer.toString(n);
                n2=Character.toString(a.charAt(2))+Character.toString(a.charAt(3));
                n1=Character.toString(a.charAt(0))+Character.toString(a.charAt(1));
                codigoDeOperacion=Integer.valueOf(n1);
                operando=Integer.valueOf(n2);
                
                    if (codigoDeOperacion==10){
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        memoria[operando]=n;

                    }else if(codigoDeOperacion==30){
                         System.out.print("Ingrese el entero a sumar: ");
                        n=input.nextInt();
                       
                        memoria[operando]=memoria[operando]+n;

                    }else if(codigoDeOperacion==31){
                         System.out.print("Ingrese el entero a restar: ");
                        n=input.nextInt();
                        memoria[operando]=memoria[operando]-n;
                    }else if(codigoDeOperacion==32){
                         System.out.print("Ingrese el entero a dividir: ");
                            n=input.nextInt();
                            memoria[operando]=memoria[operando]/n;
                    }else if(codigoDeOperacion==33){
                         System.out.print("Ingrese el entero a multipicar: ");
                            n=input.nextInt();
                            memoria[operando]=memoria[operando]*n;
                    }else if (codigoDeOperacion==20){
                        System.out.print("Ingrese el entero a acumular: ");
                        n=input.nextInt();
                        acumulador=n;

                    }else if (codigoDeOperacion==21){
                        memoria[operando]=acumulador;

                    }else if (codigoDeOperacion==11){
                        System.out.println(memoria[operando]);
                    }
                y++;
            

        }
        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");


        for( int contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){

            if(contadorDeIntrucciones<10){
                w="0"+Integer.toString(contadorDeIntrucciones);
            }else{
                w=Integer.toString(contadorDeIntrucciones);
            }
            System.out.println(w+"? "+memoria[contadorDeIntrucciones]);
        }

    

    }



    }


