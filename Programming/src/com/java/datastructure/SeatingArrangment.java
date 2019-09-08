package com.java.datastructure;
import java.util.Scanner;

class SeatingArrangement {
	
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = 0;
        if(s.hasNextInt()){
        n  = s.nextInt();    
        }
        
        while(n > 0){
            n--;
            int seatNo  = s.nextInt();
            int facingSeatNo = 13 - (seatNo % 12);
            if(facingSeatNo == 13){
                facingSeatNo = 1;
                seatNo--;
            }
            facingSeatNo = facingSeatNo + 12 *  (seatNo / 12);
            int seatType = facingSeatNo % 6;
            String type = "AS";
            if(seatType == 0 || seatType == 1){
                type = "WS";
            } else if(seatType == 2 || seatType == 5) {
                type = "MS";
            }
            System.out.println(facingSeatNo + " " + type);
        }
    }
}