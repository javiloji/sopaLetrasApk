package com.example.sopaletras;

import android.util.Log;

import java.util.Random;

public class Palabra {
    public int x;
    public int y;
    public int xInicial;
    public int yInicial;
    public int dir;
    public String[] palabraArray;
    public String palabra;

    public static String[] arrayPalabras;

    public Palabra(){
        Random r = new Random();
        this.palabra = arrayPalabras[r.nextInt(5)];
        this.palabraArray = this.palabra.split("");
        this.x = r.nextInt(10);
        this.y = r.nextInt(10);
        this.xInicial = this.x;
        this.yInicial = this.y;
        this.dir = r.nextInt(8);
    }
    public void calculaDireccion(){
        switch (this.dir) {
            case 0:
                this.x -= 1;
                break;
            case 1:
                this.y += 1;
                break;
            case 2:
                this.x += 1;
                break;
            case 3:
                this.y -= 1;
                break;
            case 4:
                this.x -= 1;
                this.y += 1;
                break;
            case 5:
                this.x -= 1;
                this.y -= 1;
                break;
            case 6:
                this.x += 1;
                this.y += 1;
                break;
            case 7:
                this.x += 1;
                this.y -= 1;
                break;
        }
    }

    public void retrocederDir(){
        switch (this.dir) {
            case 0:
                this.x += 1;
                break;
            case 1:
                this.y -= 1;
                break;
            case 2:
                this.x -= 1;
                break;
            case 3:
                this.y += 1;
                break;
            case 4:
                this.x += 1;
                this.y -= 1;
                break;
            case 5:
                this.x += 1;
                this.y += 1;
                break;
            case 6:
                this.x -= 1;
                this.y -= 1;
                break;
            case 7:
                this.x -= 1;
                this.y += 1;
                break;
        }
    }

    public void revertirPalabra(){
        this.x = this.xInicial;
        this.y = this.yInicial;
    }

    public static void setArrayPalabras(String aP){
        arrayPalabras = aP.split(",");
    }

}
