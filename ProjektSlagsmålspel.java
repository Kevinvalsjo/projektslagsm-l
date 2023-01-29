/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projektslagsmålspel;
import java.util.Scanner;
public class ProjektSlagsmålspel { 
   
        public static void main(String[] args){  
       
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Hej och velkommen till detta slagsmolspel. Du kommer fa en chans att valja hur svor forsta leveln ska vara.");
        System.out.println("Din fiende kommer börja med 10hp! Ditt hp kommer alltid vara 200");
       
        int fiendens_hp = 10;
        int fiendens_starthp = fiendens_hp;
        int ditt_hp = 200;
        boolean play = true;
        System.out.println("Är du redo att starta? (ja/nej)");
        String svar = tangentbord.next();
        
        if(svar.equalsIgnoreCase("ja")){
         int runda =1 ;
        int i = 6;
        int k = 3;
        int tal1  = (int) (Math.random()*k);
        System.out.println("Fienden börjar! Tryck (Enter) för att fortsätta");
        
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        
        ditt_hp -= tal1;
        System.out.println("Du förlorade "+tal1+" HP. Och du får nu en chans att attackera");
        int poäng = 0;
         int o = 0;
        int[] fält1 = new int[4];
        while(play)
        { 
        if(poäng<20)
        {
            while(fiendens_hp >=0 && ditt_hp >= 0){
           
                System.out.println("F_hp: "+fiendens_hp+  "\nD_hp: " + ditt_hp);
           
                System.out.println("Din tur (Enter)");
                int d_atk2  = (int) (Math.random()*i)+1;
                int a = d_atk2;
                scan.nextLine();
                fiendens_hp -= d_atk2;
                System.out.println("Fienden förlorade "+d_atk2+" HP. ");
                System.out.println("Fienden attackerar!! (Enter)");
                scan.nextLine();
                int c = tal1;
                int d_atk = (int) (Math.random()*k);
                int b=d_atk;
                
                fält1[0]= a ;
                fält1[1]=  b;
                fält1[2]= c;
                int differens1 = fält1[2]-fält1[0];
                int differens2 = fält1[1]-fält1[0];
                System.out.println("Differensen mellan era skador är:" + differens1);
                System.out.println("Fiendens andra attack nedan minus din första:" + (differens2));
                if(d_atk>0) 
                {
                System.out.println("Fienden fick en lyckad träff och gjorde "  + d_atk + " skada");
                ditt_hp -= d_atk;
                System.out.println("Du förlorar "+d_atk+ " hp");
                }
                else
                {
                System.out.println("\nFienden missade");
                }
                if(d_atk==0){
                    System.out.println("Fienden slår igen och gör 3 skada");
                    ditt_hp -= 3;
                }
                if(d_atk2 == 3 || d_atk== 3)
                {
                System.out.println("\nFienden parrerar 3 skada");
                System.out.println("\nFienden har fortfarande "+ fiendens_hp +" HP"); 
                }
                if(d_atk2 >25 || d_atk >25 )
                {
                    int svärdskada = (int) (Math.random()*300);
                    System.out.println("DU FICK SÅ MYCKET SKADA ATT DU KALLADE PÅ GUD OCH FICK ETT ONE TIME USE OCH GJORDE: " + svärdskada+"skada och fienden förlorade "+svärdskada+"hp");
                    fiendens_hp -= svärdskada;
                    System.out.println(fiendens_hp);
                }
                    
                if(d_atk2==i){
                System.out.println("\nDu fick maximerad skada och du öppnade nu ett vapenförråd. Vad vill du använda för vapen?, 1.Yxa , 2.Kniv 3.Knytnäve");
                int val = tangentbord.nextInt();
                           switch(val){
            
                           case 1 ->  
            {
                System.out.println("Du drog yxan mot fienden och siktade på fiendens hals!");
                int yxa = (int) (Math.random()*40);
               
                if(yxa<25)
                {
                    System.out.println("Fienden hade en sopptunna där och blockade ditt slag och istället använde yxan till att öka sitt hp");
                    fiendens_hp += 10;
                      
                }
                else
                {
                    fiendens_hp -=yxa;
                      
                }          
            }
                            case 2 -> {
                System.out.println("Du tog din kniv snabbt och försökte skada fienden");
            
                int kniv = (int) (Math.random()*40);
                if(kniv<15)
                {
                
                    System.out.println("Attans! Fienden tog fram sin sköld och dämpade ditt slag. Varken du eller fienden gjorde skada.");
                    
                }
                else{
                int knivs =(int) Math.random()*20+10;
                System.out.println("Du fick en lyckad träff och körde upp kniven rakt i örat och fienden förlorar " +knivs+ " hp");
                fiendens_hp -= knivs;
                      
                }        
            }
                            case 3 ->{
                
                int näve = (int) (Math.random()*20);
                
                System.out.println("Du slog till fienden hårt och gjorde " +näve+ " skada");
                fiendens_hp -=näve;
                System.out.println(fiendens_hp+ " " + ditt_hp);
                                     }
                       
                }
            }           
        }   
        System.out.println("F_hp:"+fiendens_hp+ "\nD_hp"+ditt_hp);
        
        
        
        if(fiendens_hp<=0)
            
        {
            
            System.out.println("Du vinner");
            
        }
        
        else
            
        {
            
            System.out.println("Du förlorade");
            
            
            break;
        } 
       
         runda ++;
        
         
        if(o < 10)
        {
         System.out.println("Vill du fortsätta till runda:"+ (runda) +" ? (ja/nej)");
        
            String spel = tangentbord.next();
            
            if(spel.equalsIgnoreCase("ja")){
            
                k += 1;
                ditt_hp = 200;
                System.out.println("Fienden har nu blivit starkare. +1 skada & mer hp ");
                poäng += Math.random()*4+1;
                System.out.println("poäng:"+poäng);
                fiendens_hp = poäng*3 +fiendens_starthp;
            }
             else{
                System.out.println("okej, programmet avslutas");
                play = false;
            }
        } 
        else
        {
            break;
        }
        
            
           
           
            
    }
        else{
            System.out.println("Du har fått 20 poäng och har kommit till sista bossen!");
            poäng -=100;
            k = 16;
            fiendens_hp += 1000;
            ditt_hp = 400;
            i +=30;
            o += 20;
            
            
         
            }
        }
       
            
        
      
    }
        else{
             System.out.println("Vad synd att du inte ville spela!");
            }   
        
        }
   
            
     
}


     
            

    
           
 

    



