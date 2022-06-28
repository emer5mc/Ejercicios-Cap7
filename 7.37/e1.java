import java.util.Scanner;

public class e1{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int memoria[]=new int[100];
        int m2[]=new int[100];
        int m1[]=new int[100];
        int c=0, z=0;
        int n=0;
        int sum=0;
        int codigoDeOperacion=0, operando=0, y=0, registroDeInstruccion=0, contadorDeIntrucciones=0;
        int acumulador=0;
        String a, w, n1,n2;
        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");



        for( contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){
            memoria[contadorDeIntrucciones]=0;
        }

        while (n!=-9999){

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
                if (n!=-9999){
                    if (codigoDeOperacion==10 || codigoDeOperacion==11 || codigoDeOperacion==30 || codigoDeOperacion==31 || codigoDeOperacion==32 || codigoDeOperacion==33 || codigoDeOperacion==20 || codigoDeOperacion==21 || codigoDeOperacion==43 ){ 
                        if(codigoDeOperacion==43){
                            n=-9999;
                        }

                        if ( operando>=0 && operando<100){
                            m1[z]=codigoDeOperacion;
                            m2[z]=operando;
                             z++;
                             y++;
                        }
                    }else{
                        System.out.println("Instruccion no valida");
                    }
                }
            

        }
        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");

        for (int x=0; x<=z; x++){

            switch (m1[x]){
            
                case 10:
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        memoria[m2[x]]=n;
                        break;

                case 30:
                         System.out.print("Ingrese el entero a sumar: ");
                        n=input.nextInt();
                       
                        memoria[m2[x]]=memoria[m2[x]]+n;
                        break;

                case 31:
                         System.out.print("Ingrese el entero a restar: ");
                        n=input.nextInt();
                        memoria[m2[x]]=memoria[m2[x]]-n;
                        break;
                case 32:
                         System.out.print("Ingrese el entero a dividir: ");
                            n=input.nextInt();
                            memoria[m2[x]]=memoria[m2[x]]/n;
                            break;
                case 33:
                         System.out.print("Ingrese el entero a multipicar: ");
                            n=input.nextInt();
                            memoria[m2[x]]=memoria[m2[x]]*n;
                            break;

                case 20:
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        acumulador=n;
                        break;

                case 21:
                        memoria[operando]=acumulador;
                        break;

                case 11:
                        System.out.println(memoria[m2[x]]);
                        break;

                default: 
                        System.out.print("");  
            }


        }

        System.out.println("*** Empieza la impresion de la memoria ***");

        for( contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){

            if(contadorDeIntrucciones<10){
                w="0"+Integer.toString(contadorDeIntrucciones);
            }else{
                w=Integer.toString(contadorDeIntrucciones);
            }
            System.out.println(w+"? "+memoria[contadorDeIntrucciones]);
        }
    }



    }


