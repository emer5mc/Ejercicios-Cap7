import java.util.Scanner;

public class e3{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int c=0;
        int n=0;
        int memoria[]=new int[1];
        int mayor=0;
        int c1=0, c2=0, z=0, y=1;
        String a;
        String n1, n2;
        System.out.println("****Ingrese los valores en lenguaje LMS*****");

 


        while (c<=z){
                
                n=input.nextInt();
                a=Integer.toString(n);
                n2=Character.toString(a.charAt(2))+Character.toString(a.charAt(3));
                n1=Character.toString(a.charAt(0))+Character.toString(a.charAt(1));
                c1=Integer.valueOf(n1);
                c2=Integer.valueOf(n2);
                    
                    if (c1==10){
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        mayor=n;
                        if (y==1){
                            z=n;
                            y=2;
                            memoria=new int[z];
                            for( int x=0; x<z; x++){
                                 memoria[x]=0;
                            }
                            c++;
                        }
                        memoria[c2]=n;
                        c++;
                    }

                }

                for( int x=0; x<z; x++){

                    if (memoria[x]>mayor){
                        mayor=memoria[x];
                    }
                }

                System.out.println("El entero mayor es: "+mayor);


                }

        }


    





    


