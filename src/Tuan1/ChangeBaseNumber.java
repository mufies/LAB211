/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeBaseNumber {
    private String num;
    
    public ChangeBaseNumber(String num)
    {
        this.num = num;
    }
    

    public String generate(int in, int out) {
        if (in == out) {
            return num;
        } else {
            if (in == 1 && out == 2) {
                return binToDec(num);
            }
            if (in == 1 && out == 3) {
                
                return binToHex(num);
            }
            if (in == 2 && out == 1) {
                return decToBin(num);
            }
            if (in == 2 && out == 3) {
                return decToHex(num);
            }
            if (in == 3 && out == 1) {
                
                return hexToBin(num);
            }
            if (in == 3 && out == 2) {
                return hexToDec(num);
            }
        }
        return null;
    }
public String decToHex(String decimal) {
    int dec = Integer.parseInt(decimal);
    StringBuilder hex = new StringBuilder();
    char[] hexChars = "0123456789ABCDEF".toCharArray();
    while (dec > 0) {
        int remainder = dec % 16;
        hex.insert(0, hexChars[remainder]);
        dec /= 16;
    }
    return hex.toString();
}

public String hexToDec(String hex) {
    int decimal = 0;
    char[] hexChars = "0123456789ABCDEF".toCharArray();
    for (int i = 0; i < hex.length(); i++) {
        char c = hex.toUpperCase().charAt(i);
        int value = -1;
        for (int j = 0; j < hexChars.length; j++) {
            if (hexChars[j] == c) {
                value = j;
                break;
            }
        }
        decimal = decimal * 16 + value;
    }
    return String.valueOf(decimal);
}

public String decToBin(String decimal) {
    int dec = Integer.parseInt(decimal);
    StringBuilder binary = new StringBuilder();
    while (dec > 0) {
        int remainder = dec % 2;
        binary.insert(0, remainder);
        dec /= 2;
    }
    return binary.toString();
}

public String binToDec(String binary) {
    int decimal = 0;
    for (int i = 0; i < binary.length(); i++) {
        char c = binary.charAt(i);
        decimal = decimal * 2 + (c - '0');
    }
    return String.valueOf(decimal);
}

public String hexToBin(String hex) {
    String decimal = hexToDec(hex);
    return decToBin(decimal);
}

public String binToHex(String binary) {
    String decimal = binToDec(binary);
    return decToHex(decimal);
}





}
