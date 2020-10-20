/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp.sederhana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KTPSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, lahir, kelamin, alamat, agama, pekerjaan, status, goldar;//tipe data String Vacriabel nama
        
        Scanner io = new Scanner(System.in);
        
        System.out.println("Silahkan isi data berikut");
        System.out.print("Nama : ");
        nama = io.nextLine();
        System.out.println("Tempat Tanggal lahir : ");
        lahir = io.nextLine();
        System.out.print("Jenis Kelamin : ");
        kelamin = io.nextLine();
        System.out.print("Alamat : ");
        alamat = io.nextLine();
        System.out.print("Agama : ");
        agama = io.nextLine();
        System.out.print("Pekerjaan : ");
        pekerjaan = io.nextLine();
        System.out.print("Status : ");
        status = io.nextLine();
        System.out.print("Golongan Darah : ");
        goldar = io.nextLine();
        
        System.out.println("****************");
        System.out.println("Provinsi Jawa Timur Kabupaten Magetan");
        System.out.println("Nama : "+nama);
        System.out.println("Tempat Tanggal lahir : "+ lahir);
        System.out.println("Jenis Kelamin : "+ kelamin);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Agama : "+ agama);
        System.out.println("Pekerjaan : "+ pekerjaan);
        System.out.println("Status Perkawinan : "+ status);
        System.out.println("Golongan darah : "+ goldar);
        
        
        
    }
    
}
