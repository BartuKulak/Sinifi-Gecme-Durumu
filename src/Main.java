import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int mat,fiz,kim,tur,muz,ortalama;
        System.out.println("Matematik Notunuz: ");
        mat=input.nextInt();
        System.out.println("Turkce Notunuz: ");
        tur=input.nextInt();
        System.out.println("Fizik Notunuz: ");
        fiz=input.nextInt();
        System.out.println("Kimya Notunuz: ");
        kim=input.nextInt();
        System.out.println("Müzik Notunuz: ");
        muz=input.nextInt();
        if(mat<0 || mat>100)
            mat=0;
        if(fiz<0 || fiz>100)
            fiz=0;
        if(kim<0 || kim>100)
            kim=0;
        if(tur<0 || tur>100)
            tur=0;
        if(muz<0 || muz>100)
            muz=0;
        ortalama=(mat+fiz+kim+tur+muz)/5;
        System.out.println("Ortalamanız: "+ortalama);
    }
}
