import java.util.Scanner;

public class e1{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int memoria[]=new int[10];
        int c=0;
        int n=0;
        int sum=0;
        int c1=0, c2=0, y=0;
        String a;
        String n1, n2;
        System.out.println("****Ingrese los valores en lenguaje LMS*****");
        System.out.println("        (Ingrese -9999 para salir)");


        for( int x=0; x<10; x++){
            memoria[x]=0;
        }

        while (c!=1){
                n=input.nextInt();
                a=Integer.toString(n);

                if (n==-9999){
                    c=1;
                    for( int x=0; x<10; x++){
                        sum=sum+memoria[x];
                    }  
                    System.out.println("La suma es de: "+ sum);

                }else{
                    n2=Character.toString(a.charAt(2))+Character.toString(a.charAt(3));
                    n1=Character.toString(a.charAt(0))+Character.toString(a.charAt(1));
                    c1=Integer.valueOf(n1);
                    c2=Integer.valueOf(n2);
                    
                    if (c1==10){
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        memoria[c2]=n;
                        y++;

                         if (y==10){
                         for( int x=0; x<10; x++){
                            sum=sum+memoria[x];
                            }  
                            System.out.println("La suma es de: "+ sum);
                            y=0;
                        }

                    }else if(c1==30){
                         System.out.print("Ingrese el entero a sumar: ");
                        n=input.nextInt();
                       
                        memoria[c2]=memoria[c2]+n;

                    }else if(c1==31){
                         System.out.print("Ingrese el entero a restar: ");
                        n=input.nextInt();
                        memoria[c2]=memoria[c2]-n;
                    }else if(c1==32){
                         System.out.print("Ingrese el entero a dividir: ");
                            n=input.nextInt();
                            memoria[c2]=memoria[c2]/n;
                    }else if(c1==33){
                         System.out.print("Ingrese el entero a multipicar: ");
                            n=input.nextInt();
                            memoria[c2]=memoria[c2]*n;
                    }

                   
                }

        }


    





    }
}

