package javaapplication21;
import java.util.Scanner;
public class JavaApplication21{ 
        static String text="";
        public static void main(String[] args){  
       
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Hej och velkommen till detta slagsmolspel. Du kommer fa en chans att valja hur svor forsta leveln ska vara.");
        System.out.println("Din fiende kommer börja med 10hp! Ditt hp kommer alltid vara 200");
            System.out.println("Fienden kommer börja attackera. När fienden har attackerat klart trycker du enter för att attackera"  );
        int fiendens_hp = 10;
        int fiendens_starthp = fiendens_hp;
        int ditt_hp = 200;
        boolean play = true;
        System.out.println("Är du redo att starta? (ja/nej)");
        String svar = tangentbord.next();
        
        while(!"ja".equalsIgnoreCase(svar) && !"Nej".equalsIgnoreCase(svar))
        {
            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = tangentbord.next();
        }
        String lvl4 = "";
        String lvl3 ="";
        if(svar.equalsIgnoreCase("ja")){
         int runda =1 ;
        int i = 6;
        int k = 3;
        int tal1  = (int) (Math.random()*k);
        System.out.println("Fienden börjar! Tryck (Enter) för att fortsätta");
        String fiende = "Johan, lvl 1";
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        
        ditt_hp -= tal1;
        System.out.println("Fienden slog dig och du förlorade "+tal1+" HP. Och du får nu en chans att attackera");
        int poäng = 0;
         int o = 0;
        int[] fält1 = new int[4];
        while(play)
        { 
        if(poäng<20)
        {
            while(fiendens_hp >0 && ditt_hp > 0){
               
               if(poäng<4 && poäng >= 0)
               {
                System.out.println(fiende);
               }
               if(poäng>=4 && poäng<8)
               {
                   System.out.println(text);
               
                }
                  if(poäng>=8 && poäng <12)
                {
                    System.out.println(lvl3);
                }
                   if(poäng>=12 && poäng <20)
                   {
                       System.out.println(lvl4);
                   }
                System.out.println("F_hp: "+fiendens_hp+  "\nD_hp: " + ditt_hp);
           
                System.out.println("Din tur (Enter)");
                int d_atk2  = (int) (Math.random()*i)+1;
                fiendens_hp -= d_atk2;
                int a = d_atk2;
                scan.nextLine();
                
                System.out.println("Du slog till fienden och fienden förlorade "+d_atk2+" HP. ");
                System.out.println("Fienden attackerar!! (Enter)");
                scan.nextLine();
               
                int d_atk = (int) (Math.random()*k);
                int b=d_atk;
                
                fält1[0]= a;
                fält1[1]=  b;
                int differens2 = fält1[1]-fält1[0];
              
                //System.out.println("Fiendens andra attack nedan minus din första:" + (differens2));
                if(fiendens_hp<=0 || ditt_hp<=0)
                {
                    fiendens_hp=0;
                    break;
                }
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
                    int svärdskada = (int) (Math.random()*200);
                    System.out.println("DU FICK SÅ MYCKET SKADA ATT DU KALLADE PÅ GUD OCH FICK ETT SVÄRD OCH GJORDE:" + svärdskada+" Skada och fienden förlorade "+svärdskada+" hp");
                    fiendens_hp -= svärdskada;
                    System.out.println(fiendens_hp);
                }
                   System.out.println("Differensen mellan era skador är:" + differens2); 
                if(d_atk2==i && d_atk2<=25){
                System.out.println("\nDu fick maximerad skada och du öppnade nu ett vapenförråd. Vad vill du använda för vapen?, 1.Yxa , 2.Kniv 3.Knytnäve");
                String val = tangentbord.next();
                while(!"1".equalsIgnoreCase(val)&&!"2".equalsIgnoreCase(val) &&! "3".equalsIgnoreCase(val) )
                {
                    System.out.println("Du måste skriva in en siffra mellan 1-3");
                    System.out.println("1.Yxa , 2.Kniv 3.Knytnäve");
                    val = tangentbord.nextLine();
                }
                int vals = Integer.parseInt(val);
                    System.out.println("Du valde "+vals);
                    scan.nextLine();
                           switch(vals){
            
                           case 1 ->  
            {
                System.out.println("Du drog yxan mot fienden och siktade på fiendens hals!");
                int yxa = (int) (Math.random()*40);
               
                if(yxa<25)
                {
                    System.out.println("Fienden hade en sköld där och blockade ditt slag och istället använde yxan till att öka sitt hp");
                    fiendens_hp += 10;
                    
                      
                }
                else
                {
                    System.out.println("Du slog till med yxan och gjorde"+yxa +"skada");
                    fiendens_hp -=yxa;
                    if(fiendens_hp<=0 || ditt_hp<=0)
                {
                    fiendens_hp=0;
                    break;
                }
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
                System.out.println("Du fick en lyckad träff och körde upp kniven rakt i örat och fienden förlorade " +knivs+ " hp");
                fiendens_hp -= knivs;
                 if(fiendens_hp<=0 || ditt_hp<=0)
                {
                    fiendens_hp=0;
                    break;
                }
                      
                }        
            }
                            case 3 ->{
                
                int näve = (int) (Math.random()*20);
                if(näve>0)
                {
                System.out.println("Du tog din knytnäve och slog fienden och därmed gjorde du " +näve+ " skada");
                fiendens_hp -=näve;
                System.out.println(fiendens_hp+ " " + ditt_hp);
                 if(fiendens_hp<=0 || ditt_hp<=0)
                {
                    fiendens_hp=0;
                    break;
                }
                
                }
                else
                {
                    System.out.println("Du missade fienden och blev uppercuttad och ramlade ner på marken och förloade 7 hp" );
                    ditt_hp -= 7;
                     if(fiendens_hp<=0 || ditt_hp<=0)
                {
                    ditt_hp=0;
                    break;
                }
                     
                }
                                     }
                       
                }
            }           
        }   
        System.out.println("F_hp:"+fiendens_hp+ "\nD_hp"+ditt_hp);
        
        
        if(o==0){
        if(fiendens_hp<=0)
            
        {
            
            System.out.println("Du Mördade Fienden!");
            
        }
        
        else
            
        {
            
            System.out.println("Du förlorade");
           
             ditt_hp=0;
             System.out.println("Ditt hp är: "+ditt_hp+" ,noob");
                
            
            
            break;
        } 
        }
       
         runda ++;
        
         
        if(o < 10)
        {
         System.out.println("Vill du fortsätta till runda:"+ (runda) +" ? (ja/nej)");
        
            String spel = tangentbord.next();
             while(!"ja".equalsIgnoreCase(spel) && !"Nej".equalsIgnoreCase(spel))
        {
            System.out.println("Du måste skriva 'ja' eller 'nej'");
            spel = tangentbord.next();
        }
            
            if(spel.equalsIgnoreCase("ja")){
            
                k += 1;
                ditt_hp = 200;
                System.out.println("Fienden har nu blivit starkare. +1 skada & mer hp ");
                poäng += Math.random()*5+1;
                System.out.println("poäng:"+poäng);
                fiendens_hp = poäng*3 +fiendens_starthp;
                if(poäng>=4 && poäng<8)
                {
                  
                    text = fiende.replace("Johan, lvl 1","Anders, lvl 2");
                    k +=1;
                    System.out.println("Anders har +1 mer skada");
                }
                if(poäng>=8 && poäng <12)
                {
                   
                  lvl3= text.replace("Anders, lvl 2","Sopptunna, lvl 3");
                   k +=2;
                    System.out.println("Sopptunna har +2 mer skada");
                }
                if(poäng>=12 && poäng <20)
                {
                    
                
                     lvl4 = lvl3.replace("Sopptunna, lvl 3","Samurai, lvl 4");
                     k +=4;
                     System.out.println("Samurai har +4 mer skada");
                }
                
             
            } 
            else
            {
                System.out.println("okej, programmet avslutas");
                play = false;
            }  
            
    }
        else
           { 
               if(fiendens_hp<=0){
            System.out.println("DU VANN ÖVER BOSSEN! GRATTIS! Spelet avslutas");
           play = false;
               }
               else
               {
                   System.out.println("Du förlorade över bossen:( hejdå");
                   play = false;
               }
        }  
        
       
                
            
         
            }
         else
            {
            System.out.println("Du har fått 20 eller mer poäng och har kommit till sista bossen!");
            poäng -=100;
            k = 16;
            fiendens_hp += 3000;
            ditt_hp = 600;
            i +=30;
            o += 20;
            
            }    
    }
       
        
        }
         else
        {
             System.out.println("Vad synd att du inte ville spela!");
            }   
   
            
     
}
}
