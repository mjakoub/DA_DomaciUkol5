package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();

        zofka.setLocation(100, 500);

        //Celý obrázek
        double velikost = 50;
        zmrzlina(velikost);
        zofka.penUp();
        zofka.turnRight(90-((180-42.5)/2));      //dopocitano podle zadane velikosti uhlu u zmrzliny
        zofka.move(4*velikost);
        zofka.turnLeft(90+(90-((180-42.5)/2)));
        zofka.move(7*velikost);
        zofka.turnLeft(90);
        zofka.penDown();
        snehulak(velikost);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(3*velikost+4.5*velikost);
        zofka.turnLeft(90);
        zofka.move(12*velikost);
        zofka.turnLeft(90);
        zofka.penDown();
        lokomotiva(velikost);

        //CAST 1
//        rovnoramennyTrojuhelnik1();         //Cast 1
//        ctverec1();                         //Cast 1
//        obdelnik1();                        //Cast 1
//        kruznice1();                        //Cast 1

        //CAST 2
//        rovnoramennyTrojuhelnik2(250, 85, new Color(251, 211, 0));    //Cast 2
//        ctverec2(145, new Color (115, 200, 32));                      //Cast 2
//        obdelnik2(52, 130, new Color(55, 10, 241));                   //Cast 2
//        kruznice2(145, new Color(232, 13, 58));                       //Cast 2


        //CAST 3

//       kruznice2(150, new Color(0xE3238C));       // Cast 3, Zmrzlina, obecna s moznosti velikosti nize
//       zofka.penUp();
//       zofka.turnRight(90);
//       zofka.move(150);
//       zofka.turnRight(90);
//       for (int i = 0; i < 15; i++) {            //posunout se trochu po obvodu
//            zofka.move((150*Math.PI)/360);
//            zofka.turnRight(1);
//        }
//       zofka.turnLeft(15);                       //otocit se zpatky
//       zofka.penDown();
//       rovnoramennyTrojuhelnik2(200, 42.5, new Color(0xCDB461));




//         Color color = new Color(0x94D5D9);         //Cast 3, Snehulak, obecna s moznosti velikosti nize
//         zofka.turnLeft(90);
//         kruznice2(225, color);
//         zofka.penUp();
//         zofka.turnRight(90);
//         zofka.move(225);
//         zofka.turnLeft(90);
//         zofka.penDown();
//         kruznice2(150, color);
//         zofka.penUp();
//         zofka.turnRight(90);
//         zofka.move(150/2);
//         zofka.turnLeft(90);
//         zofka.move(150/2);
//         zofka.turnLeft(90);
//         zofka.penDown();
//         kruznice2(50, color);
//         zofka.penUp();
//         zofka.turnLeft(90);
//         zofka.move(150);
//         zofka.turnLeft(90);
//         zofka.penDown();
//         kruznice2(50, color);
//         zofka.penUp();
//         zofka.turnLeft(90);
//         zofka.move(150/2);
//         zofka.turnRight(90);
//         zofka.move(150/2);
//         zofka.turnLeft(90);
//         zofka.penDown();
//         kruznice2(100, color);
//         zofka.turnRight(90);

//           Color cerna = new Color(0x000000);          //Cast 3 Lokomotiva, obecna nize
//           Color modra = new Color(0x0D0DE3);
//           Color cervena = new Color(0xF50B0B);
//           zofka.turnLeft(90);
//           kruznice2(125, cerna);
//           zofka.penUp();
//           zofka.turnRight(90);
//           zofka.move(125/2);
//           zofka.turnRight(90);
//           zofka.move(125/2);
//           zofka.turnLeft(180);
//           zofka.penDown();
//           obdelnik2(125, 175, modra);
//           zofka.penUp();
//           zofka.move(125+200);
//           zofka.turnRight(90);
//           zofka.penDown();
//           obdelnik2(100, 200, modra);
//           zofka.penUp();
//           zofka.move(3*100/4);
//           zofka.turnRight(135);
//           zofka.penDown();
//           rovnoramennyTrojuhelnik2(100, 90, cervena);
//           zofka.penUp();
//           zofka.turnRight(45);
//           zofka.move(3*100/4);
//           zofka.turnLeft(90);
//           zofka.move(50);
//           zofka.penDown();
//           kruznice2(62.5, cerna);
//           zofka.penUp();
//           zofka.move(62.5+25);
//           zofka.penDown();
//           kruznice2(62.5, cerna);
//           zofka.turnLeft(90);

    }

    public void rovnoramennyTrojuhelnik1() {
        zofka.turnRight(20);
        zofka.move(200);
        zofka.turnRight(140);
        zofka.move(200);
        zofka.turnRight(110);
        zofka.move(2*200*(Math.cos(Math.toRadians(70))));
        zofka.turnRight(90);
    }

    public void ctverec1() {
        for (int i = 0; i < 4; i++) {
            zofka.move(200);
            zofka.turnRight(90);
        }
    }

    public void obdelnik1() {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(200);
            zofka.turnRight(90);
        }
    }

    public void kruznice1() {
        for (int i = 0; i < 360; i++) {
            zofka.move(2);
            zofka.turnRight(1);
        }
    }

    public void rovnoramennyTrojuhelnik2(double delkaRamena, double uhelMeziRameny, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90-((180-uhelMeziRameny)/2));
        zofka.move(delkaRamena);
        zofka.turnRight(180-uhelMeziRameny);
        zofka.move(delkaRamena);
        zofka.turnRight(180-((180-uhelMeziRameny)/2));
        zofka.move(2*delkaRamena*(Math.cos(Math.toRadians((180-uhelMeziRameny)/2))));
        zofka.turnRight(90);
    }

    public void ctverec2(double strana, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
        }
    }

    public void obdelnik2(double kratsiStrana, double delsiStrana, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(kratsiStrana);
            zofka.turnRight(90);
            zofka.move(delsiStrana);
            zofka.turnRight(90);
        }
    }

    public void kruznice2(double prumer, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 360; i++) {
            zofka.move((prumer*Math.PI)/360);
            zofka.turnRight(1);
        }
    }

    public void zmrzlina(double velikost) {
        kruznice2(3*velikost, new Color(0xE3238C));       // Cast 3, Zmrzlina
       zofka.penUp();
       zofka.turnRight(90);
       zofka.move(3*velikost);
       zofka.turnRight(90);
       for (int i = 0; i < 15; i++) {            //posunout se trochu po obvodu
            zofka.move(((3*velikost)*Math.PI)/360);
            zofka.turnRight(1);
        }
       zofka.turnLeft(15);                       //otocit se zpatky
       zofka.penDown();
       rovnoramennyTrojuhelnik2(4*velikost, 42.5, new Color(0xCDB461));
    }

    public void snehulak(double velikost) {
        Color color = new Color(0x94D5D9);         //Cast 3, Snehulak
        zofka.turnLeft(90);
        kruznice2(4.5*velikost, color);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(4.5*velikost);
        zofka.turnLeft(90);
        zofka.penDown();
        kruznice2(3*velikost, color);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(3*velikost/2);
        zofka.turnLeft(90);
        zofka.move(3*velikost/2);
        zofka.turnLeft(90);
        zofka.penDown();
        kruznice2(velikost, color);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(3*velikost);
        zofka.turnLeft(90);
        zofka.penDown();
        kruznice2(velikost, color);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(3*velikost/2);
        zofka.turnRight(90);
        zofka.move(3*velikost/2);
        zofka.turnLeft(90);
        zofka.penDown();
        kruznice2(2*velikost, color);
        zofka.turnRight(90);
    }

    public void lokomotiva(double velikost) {
        Color cerna = new Color(0x000000);          //Cast 3 Lokomotiva
        Color modra = new Color(0x0D0DE3);
        Color cervena = new Color(0xF50B0B);
        zofka.turnLeft(90);
        kruznice2(2.5*velikost, cerna);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(2.5*velikost/2);
        zofka.turnRight(90);
        zofka.move(2.5*velikost/2);
        zofka.turnLeft(180);
        zofka.penDown();
        obdelnik2(2.5*velikost, 3.5*velikost, modra);
        zofka.penUp();
        zofka.move(2.5*velikost+4*velikost);
        zofka.turnRight(90);
        zofka.penDown();
        obdelnik2(2*velikost, 4*velikost, modra);
        zofka.penUp();
        zofka.move(3*(2*velikost)/4);
        zofka.turnRight(135);
        zofka.penDown();
        rovnoramennyTrojuhelnik2(2*velikost, 90, cervena);
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(3*(2*velikost/4));
        zofka.turnLeft(90);
        zofka.move(velikost);
        zofka.penDown();
        kruznice2(1.25*velikost, cerna);
        zofka.penUp();
        zofka.move(1.25*velikost+0.5*velikost);
        zofka.penDown();
        kruznice2(1.25*velikost, cerna);
        zofka.turnLeft(90);
    }

}
